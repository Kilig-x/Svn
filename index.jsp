<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//WAPFORUM//DTD XHTML Mobile 1.0//EN" "http://www.wapforum.org/DTD/xhtml-mobile10.dtd">
<html>
<head>
<title>游戏支付</title>
<meta http-equiv="Content-Type"
	content="application/vnd.wap.xhtml+xml;charset=utf-8" />
<style>
#slideshow {
	width: 100%;
	height: 100%;
}

#slideshow img {
	position: absolute;
	width: 100%;
	height: 100%;
	left: 50%;
	top: 50%;
	transform: translate(-50%, -50%);
	display: block;	
	background-size: cover;
	z-index: 0;
}

#slideshow img.active {
	position: absolute;
	width: 100%;
	height: 100%;
	left: 50%;
	top: 50%;
	transform: translate(-50%, -50%);
	display: block;	
	background-size: cover;
	z-index: 1;
}

#slideshow img.last-active {
	position: absolute;
	width: 100%;
	height: 100%;
	left: 50%;
	top: 50%;
	transform: translate(-50%, -50%);
	display: block;	
	background-size: cover;
	z-index: 2;
}
</style>
<script>
	window.onload = function() {
		var slideshow = document.getElementById("slideshow");
		var slides = slideshow.getElementsByTagName("img");
		var currentSlide = 0;
		function nextSlide() {
			slides[currentSlide].className = " ";
			currentSlide = (currentSlide + 1) % slides.length;
			slides[currentSlide].className = "active";
		}
		var slideInterval = setInterval(nextSlide, 2000);
	}
</script>
</head>
<body>
	<%=new Date()%><%=request.getRemoteAddr()%>
	<%=request.getHeader("x-forwarded-for")%>
	<!-- <div id="slideshow">
		<img id="image-1" 
			src="https://cdn.coofun.cn/download/images/loading_Bg1.jpg"
			alt="Image 1" /> <img id="image-2" 
			src="https://cdn.coofun.cn/download/images/loading_Bg2.jpg"
			alt="Image 2" /> <img id="image-3" 
			src="https://cdn.coofun.cn/download/images/loading_Bg3.jpg"
			alt="Image 3" />
	</div> -->
</body>
</html>