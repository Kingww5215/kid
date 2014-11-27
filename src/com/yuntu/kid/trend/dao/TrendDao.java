package com.yuntu.kid.trend.dao;

import java.util.ArrayList;

import com.yuntu.kid.trend.pojo.Trend;

public interface TrendDao {
	void addTrend(Trend trend) throws Exception;

	ArrayList<Trend> queryTrend() throws Exception;
}
