package com.javasw.project.members.service;

import java.sql.Timestamp;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.javasw.project.members.di.MService_Dao;

@Service
public class MInsertService implements IMService {

	@Autowired
	@Qualifier("MService_Dao")
	private MService_Dao dao;

	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String id = request.getParameter("id");
		String pw = request.getParameter("newPw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		Timestamp rDate = new Timestamp(System.currentTimeMillis()); // 회원가입 가입 날짜
		String address = request.getParameter("address");
		
		dao.getDao().insert(id, pw, name, email, rDate, address);
	}
}
