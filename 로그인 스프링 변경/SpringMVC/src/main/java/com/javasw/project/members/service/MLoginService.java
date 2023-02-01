package com.javasw.project.members.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.javasw.project.members.di.MService_Dao;
import com.javasw.project.members.model.MVo;

@Service
public class MLoginService implements IMService {
	
	@Autowired
	@Qualifier("MService_Dao")
	private MService_Dao dao;

	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MVo vo = dao.getDao().login(id);
		String dbpw = vo.getPw();
		String dbname = vo.getName();
		
		if (pw.equals(dbpw)) {
			setSession(id, dbname);
		} else {
			if (dbpw == null) {
				System.out.println("아이디 틀림");
			} else {
				System.out.println("비밀번호 틀림");
			}
		}
	}
	
	public void setSession(String id, String name) {
		
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		
		session.setAttribute("id", id);
		session.setAttribute("name", name);
	}
}
