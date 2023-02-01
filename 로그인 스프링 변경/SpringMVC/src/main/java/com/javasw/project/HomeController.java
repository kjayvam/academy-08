package com.javasw.project;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/")
//	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
//		return "Member/checkout";
		return "index";
//		return "home";	
	}

//	메인
	@RequestMapping("index")
	public String index() {
		return "index";
	}

//	지도 						//(ui 만드는 중)
	@RequestMapping("map")
	public String map() {
		return "Contents/map";
	}

//	설명 - 소비자
	@RequestMapping("about-consumer")
	public String consumer() {
		return "Contents/about-consumer";
	}

//	설명 - 업체
	@RequestMapping("about-policy")
	public String policy() {
		return "Contents/about-policy";
	}

//	커뮤니티 - 공지사항 			//(ui 만드는 중)
	@RequestMapping("notice")
	public String notice() {
		return "Board/notice";
	}

//	커뮤니티 - 문의하기
	@RequestMapping("contact-us")
	public String contactUs() {
		return "Board/contact-us";
	}

//	커뮤니티 - 이용후기 			//(ui 만드는 중)
	@RequestMapping("iyonghugi")
	public String iyonghugi() {
		return "Board/iyonghugi";
	}

//	갤러리
	@RequestMapping("gallery")
	public String gallery() {
		return "Contents/gallery";
	}

//	가게 검색
	@RequestMapping("store")
	public String store() {
		return "Contents/store";
	}

//	로그인 & 회원가입
	@RequestMapping("checkout")
	public String checkout() {
		return "Member/checkout";
	}

//	나의 계정
	@RequestMapping("my-account")
	public String account() {
		return "Member/my-account";
	}

//	나의 계정 - 즐겨찾기
	@RequestMapping("wishlist")
	public String wishlist() {
		return "Member/wishlist";
	}

//	나의 계정 - 프로필
	@RequestMapping("modify")
	public String modify() {
		return "Member/modify";
	}
}
