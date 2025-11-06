<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date,com.think.util.MD5" %>
<%
	String cpOrderId =  request.getParameter("cpOrderId");
String price =  request.getParameter("price");
String ts =  request.getParameter("ts");
String appuserid =  request.getParameter("appuserid");
String sign =  request.getParameter("sign");
if(cpOrderId!=null)
{
	String[] userInfo = cpOrderId.split("-");

	if (userInfo.length > 5) {
		appuserid = userInfo[4];
	}
	String appsecret = "880365basdfasa4E2bertwrt83dCb";
	String origin = cpOrderId + price + ts + appsecret;
	String newSign = MD5.MD5Encode(origin);
	float price_num = Float.parseFloat(price);
	System.out.println("newSign=" + newSign + " sign=" + sign+"price_num"+price_num);
	String status="";
	if (newSign.equals(sign) && price_num>0) {
	response.sendRedirect("http://pay.coofun.cn:8082/servlet/AiBeiCpServerServlet?cpOrderId="+cpOrderId+"&appuserid="+appuserid+"&price="+price+"&ts="+ts+"&sign="+sign);
	}
	else
	{
		if(price_num<=1.00)
		{
			status="充值金额必须大于零";
		}
	}
	
%>
<!DOCTYPE html>
<!-- saved from url=(0057)http://ipay.test.happyapk.com:8081/iapppay/SimplePay.html -->
<html><head lang="en"><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta charset="UTF-8">
		<title>游戏网页支付</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<meta name="format-detection" content="telephone=no">
		<link rel="stylesheet" href="ipay_files/pay-index.css">
		<link rel="stylesheet" href="ipay_files/style.css">

	</head>

	<body style="padding: 0;">
		<header>
			<img src="ipay_files/header_03.jpg"><h2>深圳酷饭科技有限公司</h2>
			<p>游戏网页支付</p>
		</header>
		<div class="main">
				<div class="experience-pay">
					<h2>游戏网页支付</h2>
					<p>订单编号：<%=cpOrderId %></p>
					<p>订单金额：<%=price %>元<%=status %></p>
				</div>
				<%
				if (newSign.equals(sign)&& price_num>0) {
		
	%>
				<div class="verify-pay">
					<input type="button" value="确认支付" class="btn-pay">
				</div>
	<%}
	else
	{
	%>
				<div class="verify-pay">
					订单未通过验证
				</div>
	<%	
	} 
	
	}%>

			
		</div>
		<div class="content" id="content" style="display: none;"></div>
		<!-- <div class="more-pay">
			<a href="javascript:;">体验更多计费方式</a>
		</div> -->
	
	<script type="text/javascript" src="ipay_files/jquery-1.11.3.js"></script>
	<script type="text/javascript"  src="ipay_files/aibei_v1.1.0.js"></script>
	<script>
		$(document).ready(function() {
			//点击任意处  关闭list
			$(".content").click(function() {
				$(".pattern-pay").hide()
				$(this).hide()
			});
			//点击确认支付 list显示
			$(".btn-pay").click(function(){
				//$("#pattern-pay").slideDown()
				//$(".content").show()
				window.location.href="servlet/AiBeiCpServerServlet?cpOrderId=<%=cpOrderId %>&appuserid=<%=appuserid %>&price=<%=price %>&ts=<%=ts%>&sign=<%=sign%>";
				
			});
			//点击任意处  关闭list
			$(".content").click(function() {
				$(".more").hide()
				$(this).hide()
			});
			//点击确认支付 list显示
			$(".more-pay").click(function(){
				$("#more").slideDown();
				$(".content").show()
			});
			$(".pay").click(function(){
				var target = $(this);
				var paytype = target.attr("paytype");
				
				//IAPPPAY.invokeDirectPay("http://localhost/PayWeb/servlet/AiBeiCpServerServlet?cpOrderId=<%=cpOrderId %>","1", <%=appuserid %>,paytype,<%=price %>,"GoldPay");
				//IAPPPAY.invokeLinkPay("http://localhost/PayWeb/servlet/AiBeiCpServerServlet?cpOrderId=<%=cpOrderId %>","1", <%=appuserid %>,<%=price %>,"GoldPay");
				//alert(paytype);
			});
		});

	</script>
</body></html>