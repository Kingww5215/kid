<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>幼儿园</title>
		<meta charset="utf-8">
		<!--<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />-->
		<meta name="viewport"
			content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="js/jquery.mobile.css" />
		<script type="text/javascript" src="js/jquery.js">
</script>
		<script type="text/javascript" src="js/jquery.mobile.js">
</script>
		<style>
a {
	font-size: 2px;
	color: red
}


.hh1 {
	background: #fcfdf9 url(img/pattern.gif);
	height:100px
}

.top {
	border-radius: 20px 20px
}

.content {
	margin: 0px;
	padding: 0px;
}
</style>
	</head>
	<body>
		<div class="top">
			<img src="img/top.gif" width=100% height=100px />
		</div>

		<div data-role="content" class="content">
			<div class="ui-grid-b">
				<div class="ui-block-a">
					<a href="<%=path%>/DongtaiServlet" data-theme="a" data-role="button"><img
							src="img/dt.gif" height="100%" width="100%" />
					</a>
				</div>
				<div class="ui-block-b">
					<a href="info.html" data-theme="a" data-role="button"><img
							src="img/tz.gif" height="100%" width="100%" />
					</a>
				</div>
				<div class="ui-block-c">
					<a href="word.html" data-theme="a" data-role="button"><img
							src="img/ly.gif" height="100%" width="100%" />
					</a>
				</div>

				<div class="ui-block-a">
					<a href="ww.html" data-theme="a" data-role="button"><img
							src="img/qd.gif" height="100%" width="100%" />
					</a>
				</div>
				<div class="ui-block-b">
					<a href="#" data-theme="a" data-role="button"><img
							src="img/zy.gif" height="100%" width="100%" />
					</a>
				</div>
				<div class="ui-block-c">
					<a href="#" data-theme="a" data-role="button"><img
							src="img/kb.gif" height="100%" width="100%" />
					</a>
				</div>

				<div class="ui-block-a">
					<a href="#" data-theme="a" data-role="button"><img
							src="img/ye.gif" height="100%" width="100%" />
					</a>
				</div>
				<div class="ui-block-b">
					<a href="#" data-theme="a" data-role="button"><img
							src="img/gs.gif" height="100%" width="100%" />
					</a>
				</div>
				<div class="ui-block-c">
					<a href="#" data-theme="a" data-role="button"><img
							src="img/sp.gif" height="100%" width="100%" />
					</a>
				</div>
			</div>
		</div>

		<div data-role="footer" data-position="fixed" class="hh1">
			<h1>
				云图技术支持
			</h1>
		</div>

	</body>
</html>