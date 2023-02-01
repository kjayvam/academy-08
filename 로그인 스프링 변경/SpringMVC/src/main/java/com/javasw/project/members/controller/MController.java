package com.javasw.project.members.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javasw.project.members.di.MController_Service;

@Controller
@RequestMapping("/Member/")
public class MController {
	
	@Autowired
	@Qualifier("MController_Service")
	MController_Service cs;

//	회원가입
	@PostMapping("/insert")
	public String insert(HttpServletRequest request, Model model) {
		System.out.println("Member Controller insert method");
		model.addAttribute("request", request);
		cs.getInsertService().execute(model);
		return "redirect:/index";
	}

//	로그인
	@PostMapping("/login")
	public String login(HttpServletRequest request, Model model) {
		System.out.println("Member Controller login method");
		model.addAttribute("request", request);
		cs.getLoginService().execute(model);
		return "redirect:/index";
	}

//	로그아웃
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		System.out.println("Member Controller logout method");
		session.invalidate();
		return "redirect:/index";
	}

//	회원 정보 수정
	@PostMapping("/modify")
	public String modify(HttpSession session, HttpServletRequest request, Model model) {
		System.out.println("Member Controller modify method");
		String id = (String) session.getAttribute("id");
		String name = (String) session.getAttribute("name");
		
		model.addAttribute("name", name);
		model.addAttribute("id", id);
		model.addAttribute("request", request);
		cs.getModifyService().execute(model);
		return "redirect:/index";
	}

//	회원탈퇴 (코드 작성중)
//	@PostMapping("/delete")
//	public String delete(HttpSession session, HttpServletRequest request, Model model) {
//		System.out.println("Member Controller delete method");
//		model.addAttribute("request", request);
//		cs.getDeleteService().execute(model);
//		return "redirect:/index";
//	}

//	회원 리스트 출력 (코드 작성중)
//	@PostMapping("/list")
//	public String list(Model model) {
//		System.out.println("Member Controller list method");
//		cs.getListService().execute(model);
//		return "redirect:/list";
//	}
}
