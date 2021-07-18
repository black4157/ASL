<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="total_year">
	<select name="year" class="select" id="select">
		<option>연도를 선택해주세요.</option>
		<c:forEach items="${listYear}" var="AslVO">
			<c:set var="listYear" value="${AslVO.EFC_YY }" ></c:set>
				<option> <c:out value="${listYear }" /></option>
		</c:forEach>
	</select>
	
	<input type="button" id="btn" value="검색"/>
</div>

	
<div class="wt_graph">

	<%@ include file="./DSL_graph1.jsp" %>

	<%@ include file="./DSL_graph2.jsp" %>

</div>

<div class="wt_stare">

	<%@ include file="./DSL_stare1.jsp" %>

	<%@ include file="./DSL_stare2.jsp" %>

</div>

<!-- 버튼리스너 -->
<script>
	$(document).ready(function() {
		$("#btn").on("click",function(event) {
			self.location = "DSL_Define?year=" + $("select option:selected").val();
			
		});
	});
	
</script>