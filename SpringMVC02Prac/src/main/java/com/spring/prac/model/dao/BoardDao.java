package com.spring.prac.model.dao;

import java.util.List;

import com.spring.prac.model.dto.BoardDto;

public interface BoardDao {

	String NAMESPACE = "myboard.";
	public List<BoardDto> selectAll();
	public BoardDto selectOne(int myno);
	public int insertBoard(BoardDto dto);
	public int updateBoard(BoardDto dto);
	public int deleteBoard(int myno);
}
