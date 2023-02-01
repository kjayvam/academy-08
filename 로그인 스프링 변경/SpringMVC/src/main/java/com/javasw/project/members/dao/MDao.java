package com.javasw.project.members.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.javasw.project.members.model.MVo;

@Repository
public class MDao implements IMDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private class DMvo implements RowMapper<MVo> {
//		DB에 있는 속성을 가져와서 VO(DTO)에 저장하는 방법이다
		@Override
		public MVo mapRow(ResultSet rs, int rowNum) throws SQLException {

			MVo vo = new MVo();
//			좌측 setVO 우측 DB
			vo.setId(rs.getString("id"));
			vo.setPw(rs.getString("pw"));
			vo.setName(rs.getString("name"));
			vo.seteMail(rs.getString("email"));
			vo.setrDate(rs.getTimestamp("rdate"));
			vo.setAddress(rs.getString("address"));
			
			return vo;
		}
	}

	@Override
	public void insert(String id, String pw, String name, String email, Timestamp rDate, String address) {
		String query = "INSERT INTO members (id, pw, name, email, rdate, address) VALUES (?,?,?,?,?,?)";
		jdbcTemplate.update(query, id, pw, name, email, rDate, address);
	}
	
	@Override
	public MVo login(String id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM members WHERE id = ?";
		return jdbcTemplate.queryForObject(query, new DMvo(), id);
	}
	
	@Override
	public MVo select(String id) {
		String query = "SELECT pw FROM members WHERE id = ?";
		return jdbcTemplate.queryForObject(query, new DMvo(), id);
	}

	@Override
	public void modify(String name, String id, String pw, String address, String email) {
		String query = "UPDATE members SET pw=?, email=?, address=? WHERE id=? AND name=?";
		jdbcTemplate.update(query, pw, email, address, id, name);
	}

	@Override
	public void delete(String id, String pw) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<MVo> list() {
		// TODO Auto-generated method stub
		return null;
	}
}
