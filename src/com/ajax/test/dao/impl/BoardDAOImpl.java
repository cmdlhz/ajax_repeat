package com.ajax.test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ajax.test.common.DBCon;
import com.ajax.test.dao.BoardDAO;

public class BoardDAOImpl implements BoardDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	@Override
	public Map<String, String> selectBoard(Map<String, String> board) {
		con = DBCon.getCon();
		try {
			con = DBCon.getCon();
			String sql = "select * from board_info where bi_num = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, board.get("biNum"));
			rs = ps.executeQuery();
			while(rs.next()) {
				Map<String, String> b = new HashMap<>();
				b.put("biNum", rs.getString("bi_num"));
				b.put("biTitle", rs.getString("bi_title"));
				b.put("biContent", rs.getString("bi_content"));
				b.put("uiNum", rs.getString("ui_num"));
				b.put("credat", rs.getString("credat"));
				b.put("cretim", rs.getString("cretim"));
				b.put("moddat", rs.getString("moddat"));
				b.put("modtim", rs.getString("modtim"));
				b.put("active", rs.getString("active"));
				return b;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<Map<String, String>> selectBoardList(Map<String, String> board) {
		return null;
	}

	@Override
	public int insertBoard(Map<String, String> board) {
		return 0;
	}

	@Override
	public int updateBoard(Map<String, String> board) {
		return 0;
	}

	@Override
	public int deleteBoard(Map<String, String> board) {
		return 0;
	}

}
