<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="year1">
	<h2>연도별 종목별 응시자수</h2>
	<table class="tbl_count">
		<thead>
			<tr>
				<th class="sort-alpha">응시종목</th>
				<th class="sort-alpha">응시자수(명)</th>
				<th class="sort-alpha">합격률(%)</th>
			</tr>
		</thead>
		<tbody id="tbl_body">
			<c:forEach items="${SSL_ftstare1 }" var="stare1">
			<tr>
				<td> <c:out value="${stare1.QF_ITM_NM }" /> </td>
				<td> <c:out value="${stare1.count }" /> </td> 
				<td> <c:out value="${stare1.pass }" /> </td>	
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>