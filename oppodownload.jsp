<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%><%@ page import="java.util.*,com.think.util.MD5"%><%
	
%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
long ts = System.currentTimeMillis();
String key = "dX7aezdbajKG0G88COkosSs0K";
String appsecret = "330365be61aC3eaf6a4E2bed91283dCb";
String pkg= "com.coolfun.game.nearme.gamecenter";
Random r= new Random();
int salt= r.nextInt(10000);
int times=0;
String origin = "signature:"+pkg+"/"+key+"/"+appsecret+"/"+salt+"/"+ts+"/"+times;
String sign = MD5.MD5Encode(origin);
String url = "http://i.open.game.oppomobile.com/gameopen/download/v1/pkg?sign="+sign+"&ts="+ts+"&key="+key+"&salt="+salt+"&times=0&pkg="+pkg;
response.sendRedirect(url);
%>
