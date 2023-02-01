package com.javasw.project.members.dao;

import java.sql.Timestamp;
import java.util.ArrayList;

import com.javasw.project.members.model.MVo;

public interface IMDao {

	void insert(String id, String pw, String name, String email, Timestamp rDate, String address);	// 회원가입		// insetMember
	MVo login(String id);	// 로그인		// getPassword
	MVo select(String id);	// 정보 보기	// selectMember
	void modify(String name, String id, String pw, String address, String email);	// 정보 수정	// updateMember
	void delete(String id, String pw);	// 회원 탈퇴	// deleteMember
	ArrayList<MVo> list();	// 회원 리스트	// selectAllMember
}
