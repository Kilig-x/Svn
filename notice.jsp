<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.coolfun.service.PaymentServiceImpl"%>
<%@ page import="com.think.model.SystemRadioModel"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.*" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + path + "/";
	
	System.out.println(basePath+request.getRequestURI()+ "?" + request.getQueryString());
	//获取支付宝POST过来反馈信息
	Map requestParams = request.getParameterMap();
	for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
		String name = (String) iter.next();
		String[] values = (String[]) requestParams.get(name);
		String valueStr = "";
		for (int i = 0; i < values.length; i++) {
			valueStr = (i == values.length - 1) ? valueStr + values[i]
					: valueStr + values[i] + ",";
		}
		System.out.println(name+"="+valueStr);
	}
	
	String publisher = request.getParameter("publisher");
	String clientVersion = request.getParameter("clientVersion");
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragrma", "no-cache");
	response.setDateHeader("Expires", 0);
	response.addHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
	response.addHeader("Access-Control-Allow-Methods", "*");
	response.addHeader("Access-Control-Allow-Headers", "Accept,Authorization,DNT,Content-Type,Referer,User-Agent");
	response.addHeader("Access-Control-Allow-Credentials","true"); // 允许携带验证信息
	List<SystemRadioModel> list = PaymentServiceImpl.getInstance().getSystemRadioModels(publisher,
			clientVersion);
	if (list.size() > 0) {
		SystemRadioModel systemRadioModel = list.get(0);
		request.setAttribute("show_id", systemRadioModel.getId());
		request.setAttribute("radioList", list);
		response.setContentLength(1024*1024+list.size());		
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta name="viewport" content="width=device-width,initial-scale=1.0,maxnimum-scale=1.0,user-scalable=0">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/notice.css" />
<title>系统公告</title>
<script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
<style type="text/css">
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

	<div class="divcss5">
		<div class="div_left">
			<div class="left1"></div>
			<div class="left2">
				<div id="menu">
					<div>
					<ul>
						<c:forEach items="${radioList}" var="radio">
							<li <c:if test="${radio.id==show_id}" >class="li1"</c:if>>${radio.title }</li>
						</c:forEach>
					</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="div_right">
			<div class="right1">				
				<div class="right_top"></div>
				<div ><a href="uniwebview://close"><span class="btn-close"> </span></a></div>
			</div>
			<c:forEach items="${radioList}" var="radio">
				<div class="right2"
					<c:if test="${radio.id!=show_id}" >style="display: none"</c:if>><div class="reght2_div">${radio.content}</div></div>
			</c:forEach>
			<!-- <div class="right3"><a href="uniwebview://close"><span class="btn-pay">返回</span></a></div> -->			
		</div>
		
	</div>

</body>
<script type="text/javascript">
$(function(){
/****遍历*****/
$(".divcss5").find("#menu ul li").each(function(index,element){
/****绑定事件*******/
$(this).mousemove(function(e){
	
/****触发事件的显示控制****/
//$(this).addClass("right2").siblings().removeClass();
$(".div_right").find(".right2").eq(index).show().siblings(".right2").hide();
//$(this).parent().parent().parent().find(".div_right").find(".right2").eq(index).show().siblings(".right2").hide();
//alert($(".div_right").find(".right2"));
})
})
})
</script>
</html>
<%
	}
%>