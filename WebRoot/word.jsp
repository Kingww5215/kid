<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
		<title>留言板</title>
		<link rel="stylesheet" href="js/jquery.mobile.css" />
		<link rel="stylesheet" href="css/trend.css" />
		<script type="text/javascript" src="js/jquery.js"></script>
		<script type="text/javascript" src="js/jquery.mobile.js"></script>
		<script type="text/javascript">
			function takeword(){
				var word=document.getElementById("word").value;
				var time=document.getElementById("time").value;
				location.href="TakewordServlet?word="+word+"&&time="+time;
			}
		</script>
	</head>

	<body>
		<div data-role="header">
			<h1>
				留言板
			</h1>
		</div>
		<div class="content">
		
			<div class="cleft">
				<img src="img/99.jpg" width="100%" />
			</div>
			<div class="cright">
				<div class="rc1">
					1
				</div>
				<div class="rc2">
					2
				</div>
				<div class="rc3">
					<img src="img/top.jpg" width="100%" />
				</div>
				<div class="rc4">
					
				</div>
			</div>
			<hr>
			
		</div>
		<div data-role="footer" data-position="fixed">
			<table>
				<tr>
					<td width="90%">
						<input type="text" id="word" placeholder="你想说点什么？" />
						
					</td>
					<td>
						<input type="button" value="发表" onclick="javascript:takeword();"/>
					</td>
				</tr>
			</table>
		</div>
	</body>
</html>