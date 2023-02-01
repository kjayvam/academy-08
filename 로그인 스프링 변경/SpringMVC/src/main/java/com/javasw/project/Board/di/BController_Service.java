package com.javasw.project.Board.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.javasw.project.Board.service.IBService;

@Repository
public class BController_Service {

	private IBService listService;
	private IBService writeService;
	private IBService contentService;
	private IBService modifyService;
	private IBService replyService;
	private IBService replyViewService;
	private IBService deleteService;

	@Autowired
	public void setListService(@Qualifier("BListService") IBService listService) {
		this.listService = listService;
	}

	@Autowired
	public void setWriteService(@Qualifier("BWriteService") IBService writeService) {
		this.writeService = writeService;
	}

	@Autowired
	public void setContentService(@Qualifier("BContentService") IBService contentService) {
		this.contentService = contentService;
	}

	@Autowired
	public void setModifyService(@Qualifier("BModifyService") IBService modifyService) {
		this.modifyService = modifyService;
	}

	@Autowired
	public void setReplyService(@Qualifier("BReplyService") IBService replyService) {
		this.replyService = replyService;
	}

	@Autowired
	public void setReplyViewService(@Qualifier("BReplyViewService") IBService replyViewService) {
		this.replyViewService = replyViewService;
	}

	@Autowired
	public void setDeleteService(@Qualifier("BDeleteService") IBService deleteService) {
		this.deleteService = deleteService;
	}

	public IBService getListService() {
		return listService;
	}

	public IBService getWriteService() {
		return writeService;
	}

	public IBService getContentService() {
		return contentService;
	}

	public IBService getModifyService() {
		return modifyService;
	}

	public IBService getReplyService() {
		return replyService;
	}

	public IBService getReplyViewService() {
		return replyViewService;
	}

	public IBService getDeleteService() {
		return deleteService;
	}

}
