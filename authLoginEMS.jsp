<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%><%@ page import="com.anysdk.auth.Login"%><%
	Login login = new Login();
	login.setLoginCheckUrl("http://gameapi.coolfungame.cn/api/User/LoginOauth/");
	login.check(request, response);
%>