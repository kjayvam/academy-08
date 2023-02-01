package com.javasw.project.Board.model;

import java.sql.Timestamp;

import org.springframework.stereotype.Repository;

@Repository
public class BVo {
	
	private int bId;			// 게시물 번호
	private String bName;		// 게시물 이름
	private String bTitle;		// 게시물 제목
	private String bContent;	// 게시물 내용
	private Timestamp bDate;	// 게시물 날짜
	private int bHit;			// 게시물 관람수
	private int bGroup;			// 게시물 위치
	private int bStep;			// 게시물 답변
	private int bIndent;		// 게시물 답변 들여쓰기

	public BVo() {
	}

	public BVo(int bId, String bName, String bTitle, String bContent, Timestamp bDate, int bHit, int bGroup, int bStep, int bIndent) {
		this.bId = bId;
		this.bName = bName;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bDate = bDate;
		this.bHit = bHit;
		this.bGroup = bGroup;
		this.bStep = bStep;
		this.bIndent = bIndent;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public Timestamp getbDate() {
		return bDate;
	}

	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}

	public int getbHit() {
		return bHit;
	}

	public void setbHit(int bHit) {
		this.bHit = bHit;
	}

	public int getbGroup() {
		return bGroup;
	}

	public void setbGroup(int bGroup) {
		this.bGroup = bGroup;
	}

	public int getbStep() {
		return bStep;
	}

	public void setbStep(int bStep) {
		this.bStep = bStep;
	}

	public int getbIndent() {
		return bIndent;
	}

	public void setbIndent(int bIndent) {
		this.bIndent = bIndent;
	}
}
