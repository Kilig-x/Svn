<%@page import="com.alibaba.fastjson.JSONObject" %>
<%@page import="java.net.URLDecoder" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date,com.think.util.MD5" %>
<%@ page import="java.util.*" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.think.util.HttpsUtil" %>
<%@ page import="com.coolfun.service.PaymentServiceImpl" %>
<%@ page import="com.coolfun.service.PublicCacheManger" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="com.think.util.Base64" %>
<%@ page import="com.alibaba.fastjson.JSONObject,com.alibaba.fastjson.JSONArray" %>
<%@ page import="com.think.model.AccountModel" %>
<%
    String path = request.getContextPath();
    String basePath = "https://" + request.getServerName() + path + "/";
    System.out.println(basePath + request.getRequestURI() + "?" + request.getQueryString());
    String publisher = request.getParameter("publisher");
    String time = request.getParameter("time");
    String sign = request.getParameter("sign");

    String key = "cf80411";
    String md5_str = publisher + time + key;
    String newMd5Sign = MD5.MD5EncodeUTF8(md5_str);
    boolean check = newMd5Sign.equalsIgnoreCase(sign);
    if (check) {
        AccountModel accountModel = new AccountModel();
        accountModel.setPublisher(publisher);
        List<Map<String, Object>> map = PaymentServiceImpl.getInstance().getPublicService().getScriptFolder(accountModel);
        String jsonString = JSONArray.toJSONString(map);
        HttpsUtil.writeData(jsonString, response);
    }
%>