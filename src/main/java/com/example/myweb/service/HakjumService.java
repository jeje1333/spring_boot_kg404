package com.example.myweb.service;
import org.springframework.stereotype.Service;

@Service
public class HakjumService {
	
	
	public String getHakByScore(int score) {
		
		String hak;
		
		if(score >= 90) hak = "A";
		else if(score >= 80) hak = "B";
		else if(score >= 70) hak = "C";
		else if(score >= 60) hak = "D";
		else hak = "F";
		
		return hak;
		
	}
	
	

}
