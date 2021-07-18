<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">
	<title>건강운동관리사</title>
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
		<h1> 건 강 운 동 관 리 사 </h1>
		<div id="define">
			<h3 id="h3">● 자격 정의</h3>
			<p>&emsp;&emsp;개인의 체력적 특성에 적합한 운동형태, 강도, 빈도 및 시간 등 운동수행 방법에 대하여 지도ㆍ관리하는 사람.</p>
		</div>
	</section>
	
	<section id="section2">
		<h3 id="h3">● 필기</h3>
		<%@ include file="./HEM_wt.jsp" %>
	</section>
	
	<section id="section3">
		<h3 id="h3">● 실기</h3>
		<%@ include file="./HEM_ft.jsp" %>
	</section>
	
	<!-- footer -->
	<%@ include file="../include/footer.jsp" %>
	
	<%@ include file="../include/FloatingMenu.jsp" %>
</body>
</html>