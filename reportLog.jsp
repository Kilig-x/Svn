<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.qq.open.OpenApiV3Utils" %><%@ page import="com.think.util.HttpsUtil"%><%@ page import="com.think.util.HttpsUtil"%><%@ page import="com.think.util.HttpsUtil"%>
<%
String openid = request.getParameter("openid");
String openkey = request.getParameter("openkey");
String returnStr=OpenApiV3Utils.report(openid, openkey,  request );
HttpsUtil.writeData(returnStr, response);	
%>