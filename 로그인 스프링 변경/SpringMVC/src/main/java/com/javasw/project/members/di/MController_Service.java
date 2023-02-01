package com.javasw.project.members.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.javasw.project.members.service.IMService;

@Repository 
public class MController_Service {

	private IMService insertService;
	private IMService loginService;
	private IMService logoutService;
	private IMService modifyService;
	private IMService deleteService;
	private IMService listService;

	@Autowired
	public void setInsertService(@Qualifier("MInsertService") IMService insertService) {
		this.insertService = insertService;
	}

	@Autowired
	public void setLoginService(@Qualifier("MLoginService") IMService loginService) {
		this.loginService = loginService;
	}

	@Autowired
	public void setLogoutService(@Qualifier("MLogoutService") IMService logoutService) {
		this.logoutService = logoutService;
	}

	@Autowired
	public void setModifyService(@Qualifier("MModifyService") IMService modifyService) {
		this.modifyService = modifyService;
	}

	@Autowired
	public void setDeleteService(@Qualifier("MDeleteService") IMService deleteService) {
		this.deleteService = deleteService;
	}

	@Autowired
	public void setListService(@Qualifier("MListService") IMService listService) {
		this.listService = listService;
	}

	public IMService getInsertService() {
		return insertService;
	}

	public IMService getLoginService() {
		return loginService;
	}

	public IMService getLogoutService() {
		return logoutService;
	}

	public IMService getModifyService() {
		return modifyService;
	}

	public IMService getDeleteService() {
		return deleteService;
	}

	public IMService getListService() {
		return listService;
	}
}
