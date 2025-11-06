<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="com.coolfun.service.PaymentServiceImpl"%>
<%@ page import="com.think.model.FacebookGeneralModel"%>
<%
	String general_id = "90001";

String content = "招募了名将XXX！快来一起玩啊！";
String title = "招募了名将XXX";
if (request.getParameter("general_id") != null) {
	general_id = request.getParameter("general_id");
	FacebookGeneralModel model = PaymentServiceImpl.getInstance()
	.getFacebookGeneralModelById(Integer.parseInt(general_id));
	if (model != null) {
		title = String.format(model.getTitle(), model.getGeneral_name());
		content = String.format(model.getContent(), model.getGeneral_name());
	}
}
String imageUrl = "https://cf8res.coofun.cn/images/general-" + general_id + ".jpg";
request.setAttribute("title", title);
request.setAttribute("content", content);
request.setAttribute("imageUrl", imageUrl);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<!-- <meta property="og:url" content="这里填写链接地址，注释掉默认就是当前链接" /> -->
<meta property="og:type" content="website" />
<meta property="og:title" content="${title}" />
<meta property="og:description" content="${content}" />
<meta property="og:image" content="${imageUrl}" />
<meta property="og:image:type" content="image/jpeg">
<title>${title}</title>
<script type="text/javascript">
	var u = navigator.userAgent;
	console.log(navigator.userAgent.match())
	var isAndroid = u.indexOf('Android') > -1 || u.indexOf('Adr') > -1; //android终端	
	var isiOS = !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/); //ios终端
	function redirect() {		
		if (isAndroid == true) {
			location.href = "https://play.google.com/store/apps/details?id=com.chuanglian.sgfml";
            console.log("安卓手机")
        } else if(isiOS == true) {
        	location.href = "https://apps.apple.com/us/app/%E4%B8%89%E5%9C%8B%E6%AD%A6%E8%81%96%E8%A8%98-%E8%B6%99%E9%9B%B2%E9%96%8B%E5%B1%803d%E5%9C%8B%E6%88%B0%E7%AD%96%E7%95%A5%E5%8D%A1%E7%89%8Cslg/id1542314866";
            console.log("苹果手机")
        }else{
        	location.href = "https://play.google.com/store/apps/details?id=com.chuanglian.sgfml";
            console.log("不是手机")
        }
	}
	var count = 1;
				                var countdown = setInterval(CountDown, 1000);		
				                function CountDown() {	
		                    		if (count == 0) {										
										 redirect();
		                       	 		 clearInterval(countdown);
		                   			 }
		                   			 count--;
                   			  
		               			 };
</script>
</head>
<body>
	<div class="div1">
		<a
			href="https://play.google.com/store/apps/details?id=com.chuanglian.sgfml"><img
			width="1280px" height="672px" src="${imageUrl}"></img></a><h1>${content}</h1>
	</div>
</body>
</html>