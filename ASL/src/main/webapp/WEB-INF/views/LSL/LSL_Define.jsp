<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">
	<title>생활스포츠지도사</title>
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<link rel="stylesheet" href="/resources/css/style.css" type="text/css">
	
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
		<h1> 생 활 스 포 츠 지 도 사 </h1>
		<div id="define">
			<h3 id="h3">● 자격 정의</h3>
			<p>&emsp;&emsp;"체육지도자"란 학교ㆍ직장ㆍ지역사회 또는 체육단체 등에서 체육을 지도할 수 있도록
			국민체육진흥법에 따라 해당 자격을 취득한 사람을 말한다.</p>
		</div>
	</section>
	
	<section id="section2">
		<h3 id="h3">● 필기</h3>
		<%@ include file="./LSL_wt.jsp" %>
	</section>
	
	<section id="section3">
		<h3 id="h3">● 실기</h3>
		<%@ include file="./LSL_ft.jsp" %>
	</section>
	
	<%@ include file="../include/footer.jsp" %>
	
	<%@ include file="../include/FloatingMenu.jsp" %>

</body>
</html>