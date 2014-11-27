package com.yuntu.kid.trend.dao.impl;

import java.sql.*;
import java.util.ArrayList;

import com.yuntu.kid.common.ConFactory;
import com.yuntu.kid.trend.dao.TrendDao;
import com.yuntu.kid.trend.pojo.Trend;

public class TrendDaoImpl implements TrendDao {

	@Override
	public void addTrend(Trend trend) throws Exception {
		Connection conn = ConFactory.getConnection();
		String sql = "insert into trend(username,word,img,video,time) values(?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, trend.getUser());
		pstmt.setString(2, trend.getWord());
		pstmt.setString(3, trend.getImg());
		pstmt.setString(4, trend.getVideo());
		pstmt.setString(5, trend.getTime());
		pstmt.executeUpdate();
		pstmt.close();
		conn.close();
	}

	@Override
	public ArrayList<Trend> queryTrend() throws Exception {
		Connection conn = ConFactory.getConnection();
		ArrayList<Trend> list = new ArrayList<Trend>();
		String sql = "select * from trend order by time desc";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Trend trend = new Trend(rs.getString(1), rs.getString(2), rs
					.getString(3), rs.getString(4), rs.getString(5), rs
					.getString(6));
			list.add(trend);
		}
		return list;
	}

}
