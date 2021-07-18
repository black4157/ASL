<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">
	<title>노인스포츠지도사</title>
	<link rel="stylesheet" href="/resources/css/style.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	
	<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	
	<script type="text/javascript" src="/resources/js/quickScript.js"></script>
</head>

<body>
	
	<!-- 메뉴바 -->
	<%@ include file="../include/DropMenu.jsp" %>
	
	<section id="section1">
		<h1> 노 인 스 포 츠 지 도 사 </h1>
		<div id="define">
			<h3 id="h3">● 자격 정의</h3>
			<p>&emsp;&emsp;노인의 신체적ㆍ정신적 변화 등에 대한 지식을 갖추고 해당 자격종목에 대하여 노인을 대상으로 생활체육을 지도하는 사람을 말함.</p>
		</div>
	</section>
	
	<section id="section2">
		<h3 id="h3">● 필기</h3>
		<%@ include file="./SSL_wt.jsp" %>
	</section>
	
	<section id="section3">
		<h3 id="h3">● 실기</h3>
		<%@ include file="./SSL_ft.jsp" %>
	</section>
	
	<!-- footer -->
	<%@ include file="../include/footer.jsp" %>
	
	<%@ include file="../include/FloatingMenu.jsp" %>
</body>
</html>