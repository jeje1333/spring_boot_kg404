package com.example.myweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.myweb.service.SawonService;
import com.example.myweb.vo.SawonVO;

@Controller
public class SawonController {

	
	@Autowired SawonService sv;
	 

	@RequestMapping(value = "/sawonallinfo")
	public String sawonallinfo(Model model) {

		List<SawonVO> userList = sv.getAllInfo(); // DB에서 전체 사원 정보 조회

		model.addAttribute("list", userList);
		
		System.out.println(userList.get(0).getTel());

		return "sawon/sawonallinfo";
	}
}
