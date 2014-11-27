package com.yuntu.kid.trend.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yuntu.kid.trend.pojo.Trend;
import com.yuntu.kid.trend.service.TrendService;
import com.yuntu.kid.trend.service.impl.TrendServiceImpl;

public class TakewordServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html；charset=utf-8");
		request.setCharacterEncoding("utf-8");
		TrendService service = new TrendServiceImpl();
		String word = request.getParameter("word");
		String time = request.getParameter("time");
		word = new String(word.getBytes("GBK"),"ISO-8859-1");
		System.out.println(word);
		Trend trend = new Trend("tom",word,"","",time);
		try {
			service.add(trend);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/QueryTrendServlet").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
