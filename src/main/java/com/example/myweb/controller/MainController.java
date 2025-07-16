package com.example.myweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.myweb.service.HakjumService;
import com.example.myweb.vo.HakjumVO;
import com.example.myweb.vo.SawonVO;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {

	
	@Autowired
	HakjumService hakjumService;

	
	@RequestMapping("/kajaBada")
	public @ResponseBody String happy(@RequestParam String withName) {
		return "탁뜨인 바다를 "+withName+" 과 함께~~~";
	}

	@RequestMapping("/")
	public String layout() {

		return "mainview";
	}

	@GetMapping("/ceo")
	public String ceo(HttpServletRequest requset) {
		return "normal_html/ceo";
	}

	@GetMapping("/content")
	public String content(HttpServletRequest requset) {
		return "normal_html/content";
	}

	@GetMapping("/goodhtml")
	public String goodhtml(HttpServletRequest requset) {
		return "normal_html/goodhtml";
	}

	@GetMapping("/hakjum")
	public String hakjum(Model model) {
		model.addAttribute("HakjumVO", new HakjumVO());
		return "hakjum/hakjum_input";
	}

	@GetMapping("/ohye")
	public @ResponseBody String ohye() {
		return "OHYE!!!!!";
	}

	@PostMapping("/calculate")
	public String calculate(@ModelAttribute HakjumVO hakjumVO, Model model) {

		int score = hakjumVO.getScore();

		String hak = hakjumService.getHakByScore(score);

		hakjumVO.setHak(hak);
		model.addAttribute("hakjumVO", hakjumVO);

		return "hakjum/hakjum_result";
	}

	@RequestMapping("/kajalom")
	public @ResponseBody String kajalom() {
		SawonVO sawonvo = new SawonVO();
		sawonvo.setIrum("hong");
		sawonvo.setTel("010-7777-8888");
		log.warn("ad"); // debug info warn error crit
		System.out.println(sawonvo);

		return "lombok1";
	}

}
