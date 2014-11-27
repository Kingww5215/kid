package com.yuntu.kid.trend.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yuntu.kid.trend.pojo.Trend;
import com.yuntu.kid.trend.service.TrendService;
import com.yuntu.kid.trend.service.impl.TrendServiceImpl;

public class QueryTrendServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("gbk");
		response.setContentType("text/html；charset=gbk");
		ArrayList<Trend> list = new ArrayList<Trend>();
		TrendService service = new TrendServiceImpl();
		try {
			list = service.query();
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("list", list);
		request.getRequestDispatcher("/trend.jsp").forward(request, response);
	}

}
