package com.javasw.project.Board.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.javasw.project.Board.model.BVo;

public interface IBDao {
	
	ArrayList<BVo> list();
	void write(@Param("bName")String bName, @Param("bTitle")String bTitle, @Param("bContent")String bContent);
	BVo contentView(@Param("bId")String strID);
	void modify(@Param("bId")String bId, @Param("bName")String bName, @Param("bTitle")String bTitle, @Param("bContent")String bContent);
	void delete(@Param("bId")String bId);
	BVo reply_view(@Param("bId")String str);
	void reply(@Param("bId")String bId, @Param("bName")String bName, @Param("bTitle")String bTitle, @Param("bContent")String bContent, @Param("bGroup")String bGroup, @Param("bStep")String bStep, @Param("bIndent")String bIndent);
	void replyShape(@Param("bGroup")String bGroup, @Param("bStep")String bStep);
	void upHit(@Param("bId")String bId);

}
