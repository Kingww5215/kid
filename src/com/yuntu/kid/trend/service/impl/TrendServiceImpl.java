package com.yuntu.kid.trend.service.impl;

import java.util.ArrayList;

import com.yuntu.kid.trend.dao.TrendDao;
import com.yuntu.kid.trend.dao.impl.TrendDaoImpl;
import com.yuntu.kid.trend.pojo.Trend;
import com.yuntu.kid.trend.service.TrendService;

public class TrendServiceImpl implements TrendService {

	private TrendDao dao = new TrendDaoImpl();

	@Override
	public void add(Trend trend) throws Exception {
		dao.addTrend(trend);

	}

	@Override
	public ArrayList<Trend> query() throws Exception {
		return dao.queryTrend();
	}

}
