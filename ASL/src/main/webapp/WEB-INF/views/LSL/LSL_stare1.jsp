<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="year1">
	<h2>연도별 1급 종목별 합격률</h2>
	<table class="tbl_count">
		<thead>
			<tr>
				<th class="sort-alpha">응시종목</th>
				<th class="sort-alpha">응시자수(명)</th>
				<th class="sort-alpha">합격률(%)</th>
			</tr>
		</thead>
		<tbody id="tbl_body">
			<c:forEach items="${LSL_stare1 }" var="stare1">
			<tr>
				<td> <c:out value="${stare1.QF_ITM_NM }" /> </td>
				<td> <c:out value="${stare1.count }" /> </td> 
				<td> <c:out value="${stare1.pass }" /> </td>	
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<!-- <script type="text/javascript">
        //[!] 배경색 변경을 jQuery 플러그인으로 업그레이드하자.
        $.fn.alternateRowColors = function () {
            $('tbody tr:odd', this).removeClass('even').addClass('odd');
            $('tbody tr:even', this).removeClass('odd').addClass('even');
            return this;
        };
        
        $(document).ready(function () {
            $('table.tbl_count').each(function () {
                var $table = $(this);
                // 플러그인 호출                   
                $table.alternateRowColors();
                // start table sort
                $('th', $table).each(function (column) {
                    // 헤더의 CSS 클래스가 sort-alpha로 설정되어있다면, ABC순으로 정렬
                    if ($(this).is('.sort-alpha')) {
                        // 클릭시 정렬 실행
                        var direction = -1; //
                        $(this).click(function () {
                            direction = -direction; //
                            var rows = $table.find('tbody > tr').get(); // 현재 선택된 헤더관련 행 가져오기
                            
                            // 자바스크립트의 sort 함수를 사용해서 오름차순 정렬
                            rows.sort(function (a, b) {
                                var keyA = $(a).children('td').eq(column).text().toUpperCase();
                                var keyB = $(b).children('td').eq(column).text().toUpperCase();

                                if (keyA < keyB) return -direction; //
                                if (keyA > keyB) return direction; //
                                return 0;
                            });
                            // 정렬된 행을 테이블에 추가
                            $.each(rows, function (index, row) { $table.children('tbody').append(row) });
                            $table.alternateRowColors(); // 재정렬
                        });
                    }
                }); // end table sort                    
            }); // end each()               
        });   // end ready()  
    </script>
-->