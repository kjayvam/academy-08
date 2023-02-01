package com.javasw.project.members.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.javasw.project.members.di.MService_Dao;
import com.javasw.project.members.model.MVo;

@Service
public class MListService implements IMService {

	@Autowired
	@Qualifier("MService_Dao")
	private MService_Dao dao;

	@Override
	public void execute(Model model) {

		ArrayList<MVo> listVo = dao.getDao().list();
		model.addAttribute("list",listVo);
	}

}
