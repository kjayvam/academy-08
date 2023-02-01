package com.javasw.project.Board.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.javasw.project.Board.di.BService_Dao;

@Service
public class BReplyService implements IBService {
	
	@Autowired
	@Qualifier("BService_Dao")
	private BService_Dao dao;
	
	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String bId = request.getParameter("bId");
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		String bGroup = request.getParameter("bGroup");
		String bStep = request.getParameter("bStep");
		String bIndent = request.getParameter("bIndent");

		dao.getDao().reply(bId, bName, bTitle, bContent, bGroup, bStep, bIndent);
	}
}


