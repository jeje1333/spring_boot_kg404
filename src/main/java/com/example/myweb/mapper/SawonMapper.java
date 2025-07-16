package com.example.myweb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.myweb.vo.SawonVO;

@Mapper
public interface SawonMapper {
	List<SawonVO> getAllInfo();
}
