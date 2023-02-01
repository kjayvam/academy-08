package com.javasw.project.Board.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.javasw.project.Board.model.BVo;

@Repository
public class BDao implements IBDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private class DBvo implements RowMapper<BVo> {
//		DB에 있는 속성을 가져와서 VO(DTO)에 저장하는 방법이다
		@Override
		public BVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			BVo vo = new BVo();
//			좌측 setVO 우측 DB
			vo.setbId(rs.getInt("bId"));
			vo.setbName(rs.getString("bName"));
			vo.setbTitle(rs.getString("bTitle"));
			vo.setbContent(rs.getString("bContent"));
			vo.setbDate(rs.getTimestamp("bDate"));
			vo.setbHit(rs.getInt("bHit"));
			vo.setbGroup(rs.getInt("bGroup"));
			vo.setbStep(rs.getInt("bStep"));
			vo.setbIndent(rs.getInt("bIndent"));
			return vo;
		}
	}

	@Override // 게시판 화면 출력물
	public ArrayList<BVo> list() {
		String query = "SELECT bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent " 
				+ "FROM board "
				+ "ORDER BY bGroup DESC, bStep ASC";
		return (ArrayList<BVo>) jdbcTemplate.query(query, new DBvo());
	}

	@Override // 게시판 글 쓰기
	public void write(String bName, String bTitle, String bContent) {
		String query = "INSERT INTO board(bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) "
				+ "VALUES (board_seq.NEXTVAL, ?, ?, ?, 0, board_seq.CURRVAL, 0, 0) ";
		jdbcTemplate.update(query, bName, bTitle, bContent);
	}

	@Override
	public BVo contentView(String strID) {
		upHit(strID);
		String query = "SELECT * " + "FROM board " + "WHERE bId = ?";
		return jdbcTemplate.queryForObject(query, new DBvo(), Integer.parseInt(strID));
	}

	@Override
	public void modify(String bId, String bName, String bTitle, String bContent) {
		String query = "UPDATE board " + "SET bName = ?, bTitle = ?, bContent = ?" + "WHERE bId = ?";
		jdbcTemplate.update(query, bName, bTitle, bContent, Integer.parseInt(bId));
	}

	@Override
	public void delete(String bId) {
		String query = "DELETE FROM board WHERE bId = ?";
		jdbcTemplate.update(query, Integer.parseInt(bId));
	}

	@Override
	public BVo reply_view(String str) {
		String query = "SELECT * " + "FROM board " + "WHERE bId = ?";
		return jdbcTemplate.queryForObject(query, new DBvo(), str);
	}

	@Override
	public void reply(String bId, String bName, String bTitle, String bContent, String bGroup, String bStep, String bIndent) {
		replyShape(bGroup, bStep);
		String query = "INSERT INTO board(bId, bName, bTitle, bContent, bGroup, bStep, bIndent) "
				+ "VALUES (board_seq.nextval, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(query, bName, bTitle, bContent, Integer.parseInt(bGroup), Integer.parseInt(bStep) + 1,
				Integer.parseInt(bIndent) + 1);

	}

	@Override
	public void replyShape(String bGroup, String bStep) {
		String query = "UPDATE board "
					+ "SET bStep = bStep + 1 "
					+ "WHERE bGroup = ? AND bStep > ? ";
		jdbcTemplate.update(query, Integer.parseInt(bGroup), Integer.parseInt(bStep));
	}

	@Override
	public void upHit(String bId) {
		String query = "UPDATE board "
					+ "SET bHit = bHit + 1 "
					+ "WHERE bId = ? ";
		jdbcTemplate.update(query, Integer.parseInt(bId));
	}
}
