<%@page import="com.think.util.MD5"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%><%@ page
	import="com.coolfun.service.IPublicService,com.coolfun.service.PaymentServiceImpl,com.think.model.PaymentLogModel"%>
<%
	String returnStr = "fail";
	if (request.getParameter("orderId") != null)
	{
		String orderId = request.getParameter("orderId");		
		IPublicService publicService = PaymentServiceImpl.getInstance().getPublicService();		
		PaymentLogModel paymentLogModel = publicService.getPaymentLogModel(orderId);
		if (paymentLogModel != null)
		{
			if (!paymentLogModel.isSuccess())
			{
				publicService.reloadPlayerPoint(paymentLogModel.getServer_id(), paymentLogModel.getUser_id());
				paymentLogModel.setSuccess(true);
				if (publicService.updatePaymentLogModel(paymentLogModel))
				{
					returnStr = "success";
				}
			}
		}
	}
	System.out.println("returnStr=" + returnStr);
%><%=returnStr%>