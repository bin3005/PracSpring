package com.spring.prac.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.prac.model.dao.BoardDao;
import com.spring.prac.model.dao.BoardDaoImpl;
import com.spring.prac.model.dto.BoardDto;

@Service
public class BoardBizImpl implements BoardBiz {
	
	@Autowired
	private BoardDao dao;

	@Override
	public List<BoardDto> selectAll() {
		return dao.selectAll();
	}

	@Override
	public BoardDto selectOne(int myno) {
		return dao.selectOne(myno);
	}

	@Override
	public int insertBoard(BoardDto dto) {
		return dao.insertBoard(dto);
	}

	@Override
	public int updateBoard(BoardDto dto) {
		return dao.updateBoard(dto);
	}

	@Override
	public int deleteBoard(int myno) {
		return dao.deleteBoard(myno);
	}
}
