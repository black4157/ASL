<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">
	<title>장애인스포츠지도사</title>
	
	<link rel="stylesheet" href="/resources/css/style.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	
	<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	
	<script type="text/javascript" src="/resources/js/quickScript.js"></script>
</head>

<body id="body">
	
	<!-- 메뉴바 -->
	<%@ include file="../include/DropMenu.jsp" %>
	
	<section id="section1">
		<h1> 장 애 인 스 포 츠 지 도 사 </h1>
		<div id="define">
			<h3 id="h3">● 자격 정의</h3>
			<p>&emsp;&emsp;장애유형에 따른 운동방법 등에 대한 지식을 갖추고 해당 자격종목에 대하여 장애인을 대상으로 전문체육이나 생활체육을 지도하는 사람을 말함.</p>
			<p id="title">(1급은 2019년 데이터만 있습니다.) </p>
			<p id="title">(스키는 알파인스키, 바이애슬론, 크로스컨트리를 포함한 것입니다.) </p>
		</div>
	</section>
	
	<section id="section2">
		<h3 id="h3">● 필기</h3>
		<%@ include file="./DSL_wt.jsp" %>
	</section>
	
	<section id="section3">
		<h3 id="h3">● 실기</h3>
		<%@ include file="./DSL_ft.jsp" %>
	</section>
	
	<!-- footer -->
	<%@ include file="../include/footer.jsp" %>
	
	<%@ include file="../include/FloatingMenu.jsp" %>
</body>
</html>