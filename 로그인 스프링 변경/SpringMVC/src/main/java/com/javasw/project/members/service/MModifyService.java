package com.javasw.project.members.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.javasw.project.members.di.MService_Dao;

@Service
public class MModifyService implements IMService {

	@Autowired
	@Qualifier("MService_Dao")
	private MService_Dao dao;
	
	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String name = (String) map.get("name");
		String id = (String) map.get("id");
		
		String pw = request.getParameter("pw");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
//		자바스크립트에서 비밀번호 일치하는지 검사하고 왔음
		dao.getDao().modify(name, id, pw, address, email);
	}

}
