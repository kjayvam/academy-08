package com.javasw.project.members.model;

import java.sql.Timestamp;

import org.springframework.stereotype.Repository;

@Repository
public class MVo {

	private String id;			// 회원 아이디
	private String pw;			// 회원 비밀번호
	private String name;		// 회원 이름
	private String eMail;		// 회원 이메일
	private Timestamp rDate;	// 회원 가입일
	private String address;		// 회원 주소
	
	public MVo() {
	}

	public MVo(String id, String pw, String name, String eMail, Timestamp rDate, String address) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.eMail = eMail;
		this.rDate = rDate;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Timestamp getrDate() {
		return rDate;
	}

	public void setrDate(Timestamp rDate) {
		this.rDate = rDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
