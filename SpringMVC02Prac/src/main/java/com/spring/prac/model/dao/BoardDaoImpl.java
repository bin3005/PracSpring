package com.spring.prac.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.prac.model.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<BoardDto> selectAll() {
		List<BoardDto> list = new ArrayList<BoardDto>();
		try {
			list = sqlSession.selectList(NAMESPACE+"selectList");
		} catch (Exception e) {
			System.out.println("셀렉트 리스트 에러");
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public BoardDto selectOne(int myno) {
		BoardDto dto = new BoardDto();
		
		try {
			dto = sqlSession.selectOne(NAMESPACE+"selectOne", myno);
		} catch (Exception e) {
			System.out.println("글쓰기 에러");
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public int insertBoard(BoardDto dto) {
		int res = 0;
		
		try {
			res = sqlSession.insert(NAMESPACE+"boardWrite", dto);
		} catch (Exception e) {
			System.out.println("글쓰기 에러");
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int updateBoard(BoardDto dto) {
		int res = 0;
		
		try {
			res = sqlSession.update(NAMESPACE+"updateBoard", dto);
		} catch (Exception e) {
			System.out.println("글 수정 에러");
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int deleteBoard(int myno) {
		int res = 0;
		
		try {
			res = sqlSession.delete(NAMESPACE+"deleteBoard",myno);
		} catch (Exception e) {
			System.out.println("글삭제 에러");
			e.printStackTrace();
		}
		return res;
	}
}
