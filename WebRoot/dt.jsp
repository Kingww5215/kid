<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.yuntu.kid.trend.pojo.Trend"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
		<title>动态</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<link rel="stylesheet" href="js/jquery.mobile.css" />
		<link rel="stylesheet" href="/kid/css/ten.css" />
		<script type="text/javascript" src="js/jquery.js">
</script>
		<script type="text/javascript" src="js/jquery.mobile.js">
</script>
<script type="text/javascript">
	function takeWord(){
		var word = document.getElementById("word").value;
		location.href="TakewordServlet?word="+word;
	}
</script>
		<% ArrayList<Trend> list = (ArrayList<Trend>)request.getAttribute("list"); %>
	</head>

	<body>
		<div data-role="header">
			<div data-role="navbar">
				<ul>
					<li>
						动态展示
					</li>
				</ul>
			</div>
		</div>
		<div class="content">
			<%for(int i=0;i<list.size();i++){ %>
			<div class="first">
				<div class="fleft">
					<img src="img/99.jpg" height="50px" width="50px" />
				</div>
				<div class="fright">
					<div class="username">
						<%=list.get(i).getUser() %>
					</div>
					<div>
						<p>
							<%=list.get(i).getWord() %>
						</p>
					</div>
					<div></div>
					<div>
						<iframe height=200 width=90%
							src="http://player.youku.com/embed/XNDYxODg0NTM2" frameborder=0
							allowfullscreen></iframe>
					</div>
					<div class="time">
						2014.10.20-17:33
					</div>
				</div>
			</div>
			<div class="midline"></div>
		<%} %>


		</div>
		<div data-role="footer" data-position="fixed">
			<table>
				<tr>
					<td width="90%">
						<input type="text" name="word" id="word" />
					</td>
					<td width="10%">
						<input type="button" name="sub" value="发表" onclick="javascript:takeWord();"/>
					</td>
				</tr>
			</table>
		</div>
	</body>

</html>
