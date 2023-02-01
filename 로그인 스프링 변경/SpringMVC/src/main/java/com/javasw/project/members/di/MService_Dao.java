package com.javasw.project.members.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.javasw.project.members.dao.IMDao;

@Service
public class MService_Dao {

	@Autowired
//	@Qualifier("MDaoMyBitis")	
	@Qualifier("MDao")
	private IMDao dao;

	public IMDao getDao() {
		return dao;
	}

}
