<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="com.coolfun.service.PaymentServiceImpl"%>
<%@ page import="com.think.model.SystemRadioModel"%>
<%@ page import="java.util.List,java.text.SimpleDateFormat"%>
<%
	String path = request.getContextPath();
String basePath = "https://" + request.getServerName() + path + "/";
String publisher = request.getParameter("id");
String clientVersion = request.getParameter("clientVersion");
String id = request.getParameter("id");
response.setHeader("Cache-Control", "no-store");
response.setHeader("Pragrma", "no-cache");
response.setDateHeader("Expires", 0);
SystemRadioModel model = PaymentServiceImpl.getInstance().getSystemRadioModelById(id);
System.out.println("id=" + id + " model" + model);
if (model != null) {
	SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	request.setAttribute("id", model.getId());
	request.setAttribute("title", model.getTitle());
	request.setAttribute("content", model.getContent());
	String endTime = dateformat.format(model.getEndTime());
	request.setAttribute("endTime", endTime);
	request.setAttribute("imageUrl", model.getImageUrl());
	//response.setContentLength(1024*1024+model.getContent().length());
%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,maxnimum-scale=1.0,user-scalable=0">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/notice.css" />
<title>${title}</title>
<script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
<style type="text/css">
.div1 {
	background: url("${imageUrl}NoticBG.png")
		no-repeat;
	width: 100%;
	height: 100%;
	background-size: 100% 100%;	
}

.div2 {
	width: 60%;
	height: 300px;
	
	color: #FFCBB9;
	position: absolute;
	top: 25%;
	left: 20%;
}

.div3 {
	width: 60%;
	height: 300px;
	font-family: "微软雅黑";
	font-size: 18px;
	font-style: normal;
	line-height: normal;
	color: #33FF00;
	word-wrap: break-word;
	text-align: center;
	position: absolute;
	top: 90%;
	left: 20%;
}
.div4 {
	width: 100%;
	height: 88px;
	align-items: center;
	justify-content: center;
	background-size: 100% 100%;
	background-image: url(${imageUrl});
	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src='${imageUrl}title.png)',
		sizingMethod='scale');
	position: absolute;
	top: 0px;
	left: 0%;
	z-index: 9999
}
.holiday_right1 {
	width: 100%;
	height: 24%;
	align-items: center;
	justify-content: center;
	background-size: 100% 100%;
	background-image: url(${imageUrl}title.png);
	margin-left: -14%;
}
.holiday_div_right {
	float: right;
	width: 80%;
	height: 100%;
}


.holiday_content {
	width: 94%;
	height: 65%;
}

.holiday_content_div {
	width: 80%;
	height: 90%;
	color: ＃613333;
	overflow-y: auto
}

.wrap {
	border: 1px solid #eee;
	min-width: 400px;
	min-height: 400px;
}

.tab span {
	border: 1px solid #ccc;
	width: 100px;
	height: 30px;
	padding-left: 0px;
	margin: 10PX 10PX;
}

.info {
	border: 1px dashed #006400;
	margin: 20px 0px;
}

.huangse {
	background-color: #FFFF00;
}

.qianlv {
	background-color: #F5FFFA;
}
</style>
</head>
<body>
	<div class="div1">		
		<div class="holiday_div_right">
			<div class="holiday_right1">								
				<div ><a href="uniwebview://close"><span class="btn-close"> </span></a></div>
			</div>
			<div class="holiday_content"  ><div class="holiday_content_div">${content}</div></div>			
			<div class="div3">
			<div align="center">
				惊喜倒计时：<span id="t_d"> 天</span> <span id="t_h"> 时</span> <span
					id="t_m"> 分</span> <span id="t_s"> 秒</span>
				<p>
			</div>
		</div>			
		</div>		
	</div>
</body>
<script type="text/javascript">
				function getRTime() {
					var EndTime = new Date("<%=endTime%>"); //截止时间
					var NowTime = new Date();
					var t = EndTime.getTime() - NowTime.getTime();
					var d = Math.floor(t / 1000 / 60 / 60 / 24);
					var h = Math.floor(t / 1000 / 60 / 60 % 24);
					var m = Math.floor(t / 1000 / 60 % 60);
					var s = Math.floor(t / 1000 % 60);

					document.getElementById("t_d").innerHTML = d + " 天";
					document.getElementById("t_h").innerHTML = h + " 时";
					document.getElementById("t_m").innerHTML = m + " 分";
					document.getElementById("t_s").innerHTML = s + " 秒";
				}
				setInterval(getRTime, 1000);
			</script>
</html>
<%
	}
%>