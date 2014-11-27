package com.yuntu.kid.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.yuntu.kid.common.aes.AesException;
import com.yuntu.kid.common.aes.WXBizMsgCrypt;

public class QYCoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * ------------验证回调URL---------------企业开启回调模式时，企业号会向验证url发送一个get请求
	 * 接收到该请求时，企业应
	 * 1.解析出Get请求的参数，包括消息体签名(msg_signature)，时间戳(timestamp)，随机数字串(nonce
	 * )以及公众平台推送过来的随机加密字符串(echostr),这一步注意作URL解码。 2.验证消息体签名的正确性 3.
	 * 解密出echostr原文，将原文当作Get请求的response，返回给公众平台 第2，3步可以用公众平台提供的库函数VerifyURL来实现。
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置编码
		response.setContentType("text/html;charset=utf-8");
		// response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		// 企业号的基本信息，配置时填写
		String sToken = "uyeiU1GLfa";
		String sCorpID = "wxa3be5c1b3e9d1944";
		String sEncodingAESKey = "N5lrfpDGqFUuHVOYoUPNOB5fDGSn8bZhRfk9MNIFWiq";
		try {
			WXBizMsgCrypt wxcpt = new WXBizMsgCrypt(sToken, sEncodingAESKey,
					sCorpID);
			// 解析出url上的参数值如下：
			// URLDecoder.decode(request.getParameter("echostr"),"utf-8");
			String sVerifyMsgSig = URLDecoder.decode(request
					.getParameter("msg_signature"), "utf-8");
			String sVerifyTimeStamp = URLDecoder.decode(request
					.getParameter("timestamp"), "utf-8");
			String sVerifyNonce = URLDecoder.decode(request
					.getParameter("nonce"), "utf-8");
			String sVerifyEchoStr = URLDecoder.decode(request
					.getParameter("echostr"), "utf-8");
			PrintWriter out = response.getWriter();
			String sEchoStr; // 需要返回的明文
			try {
				sEchoStr = wxcpt.VerifyURL(sVerifyMsgSig, sVerifyTimeStamp,
						sVerifyNonce, sVerifyEchoStr);
				System.out.println("verifyurl echostr: " + sEchoStr);
				// 验证URL成功，将sEchoStr返回
				out.print(sEchoStr);
				out.close();
				out = null;
			} catch (Exception e) {
				// 验证URL失败，错误原因请查看异常
				e.printStackTrace();
			}
		} catch (AesException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO 接收用户信息后的操作
	}
}