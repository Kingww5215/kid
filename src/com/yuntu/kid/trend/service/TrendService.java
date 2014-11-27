package com.yuntu.kid.trend.service;

import java.util.ArrayList;

import com.yuntu.kid.trend.pojo.Trend;

public interface TrendService {

	void add(Trend trend) throws Exception;

	ArrayList<Trend> query() throws Exception;
}
