package com.javasw.project.Board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javasw.project.Board.di.BController_Service;

@Controller
@RequestMapping("/Board/")
public class BController {
	
	@Autowired
	@Qualifier("BController_Service")
	BController_Service cs;

//	게시판 리스트 가져오기
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("Board Controller list method");
		cs.getListService().execute(model);
		return "Board/list";
	}

//	게시판 글작성
	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("Board Controller write_view method");
		return "Board/write_view";
	}

	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("Board Controller write method");
		model.addAttribute("request", request);
		cs.getWriteService().execute(model);
		return "redirect:list";
	}

//	작성된 게시판 보기
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		System.out.println("Board Controller content_view method");
		model.addAttribute("request", request);
		cs.getContentService().execute(model);
		return "Board/content_view";
	}

//	수정하기
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("Board Controller modify method");
		model.addAttribute("request", request);
		cs.getModifyService().execute(model);
		return "redirect:list";
	}

//	답변 게시판
	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		System.out.println("Board Controller reply_view method");
		model.addAttribute("request", request);
		cs.getReplyViewService().execute(model);
		return "Board/reply_view";
	}

	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("Board Controller reply method");
		model.addAttribute("request", request);
		cs.getReplyService().execute(model);
		return "redirect:list";
	}
	
//	삭제
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("Board Controller delete method");
		model.addAttribute("request", request);
		cs.getDeleteService().execute(model);
		return "redirect:list";
	}
}




