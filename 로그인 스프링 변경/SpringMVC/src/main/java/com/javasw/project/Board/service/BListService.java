package com.javasw.project.Board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.javasw.project.Board.di.BService_Dao;
import com.javasw.project.Board.model.BVo;

@Service
public class BListService implements IBService {
	
	@Autowired
	@Qualifier("BService_Dao")
	private BService_Dao dao;
	
//	받은 스프링을
//	dao에서 list메소드를 실행하여 리턴 받는다.
//	받은 값을 스프링에 키,값으로 보낸다
	@Override
	public void execute(Model model) {

		ArrayList<BVo> listVo = dao.getDao().list();
		model.addAttribute("list", listVo);
	}
}
