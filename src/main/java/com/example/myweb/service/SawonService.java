package com.example.myweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myweb.mapper.SawonMapper;
import com.example.myweb.vo.SawonVO;

@Service
public class SawonService {
	
	@Autowired
	SawonMapper sm;
	
	
	public List<SawonVO> getAllInfo() {
		return sm.getAllInfo();
	}
}
