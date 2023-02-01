package com.javasw.project.members.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.javasw.project.members.di.MService_Dao;

@Service
public class MLogoutService implements IMService {

	@Autowired
	@Qualifier("MService_Dao")
	private MService_Dao dao;
	
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

	}

}
