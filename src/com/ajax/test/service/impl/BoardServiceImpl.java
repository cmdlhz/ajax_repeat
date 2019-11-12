package com.ajax.test.service.impl;

import java.util.List;
import java.util.Map;

import com.ajax.test.dao.BoardDAO;
import com.ajax.test.dao.impl.BoardDAOImpl;
import com.ajax.test.service.BoardService;

public class BoardServiceImpl implements BoardService {
	private BoardDAO bdao = new BoardDAOImpl();
	
	@Override
	public Map<String, String> selectBoard(Map<String, String> board) {
		return bdao.selectBoard(board);
	}

	@Override
	public List<Map<String, String>> selectBoardList(Map<String, String> board) {
		return null;
	}

	@Override
	public Map<String, String> insertBoard(Map<String, String> board) {
		return null;
	}

	@Override
	public Map<String, String> updateBoard(Map<String, String> board) {
		return null;
	}

	@Override
	public Map<String, String> deleteBoard(Map<String, String> board) {
		return null;
	}

}
