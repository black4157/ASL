<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript">
	var AvgScore5 = new Array();
	var AvgScore6 = new Array();
</script>
   
<c:forEach items="${LSL_FT2 }" var="AVG1">
	<script>
		AvgScore5.push("${ AVG1.avg1 }");
		AvgScore6.push("${ AVG1.avg2 }");
	</script>
</c:forEach>

<!-- 2급그래프 출력 -->
<div class="ft_graph2">
	<h2 class="graph_title">2급 연도별 평균합격점</h2>
	<div class="ft_avg">
		<script>
			function avg(AvgScore) {
			    var result = 0.0;
			    for (var i = 0; i < AvgScore.length; i++) {
			        result += parseFloat(AvgScore[i]);
			    }
			    return Math.round(result / parseFloat(AvgScore3.length));
			}
			document.write("<p>" + Year1[0] + "년 ~ " + Year1[3] + "년까지의 실기 총 평균 : " + avg(AvgScore5) + "</p>");
			document.write("<p>" + Year1[0] + "년 ~ " + Year1[3] + "년까지의 실기 구술 평균 : " + avg(AvgScore6) + "</p>");
		</script>
	</div>
	<div id="ComboChart_values2"></div>
</div>

<!-- 구글차트 스크립트 -->
<script>
	google.charts.load('current', {'packages':['corechart']});
	google.charts.setOnLoadCallback(drawChart);
	function drawChart() {
		var data = google.visualization.arrayToDataTable([
		  ["시행연도", "실기 총 평균", "구술 평균", { role: "style" } ],
		  [Year1[0], parseFloat(AvgScore5[0]), parseFloat(AvgScore6[0]), "silver"],
		  [Year1[1], parseFloat(AvgScore5[1]), parseFloat(AvgScore6[1]), "gold"],
		  [Year1[2], parseFloat(AvgScore5[2]), parseFloat(AvgScore6[2]), "red"],
		  [Year1[3], parseFloat(AvgScore5[3]), parseFloat(AvgScore6[3]), "bule"]
		]);
		
		var view = new google.visualization.DataView(data);
		view.setColumns([0, 1,
		                 { calc: "stringify",
		                   sourceColumn: 1,
		                   type: "string",
		                   role: "annotation" },
		                 2]);
		
		var options = {
		  /* title: "none", */
		  width: 600,
		  height: 400,
		  legend: { position: "top" },
		  backgroundColor: "#fff",
		  hAxis: {
	      	title: "연도",
	      },
          vAxis: {
	        title: "평균점수(점)",
	        textStyle: {  
                  fontName: "Verdana",
                  bold: true,
               },
	      },
             seriesType: "bars",
             series: {1: {type: "line"}}
		};
		var chart = new google.visualization.ComboChart(document.getElementById("ComboChart_values2"));
		chart.draw(view, options);
	}
</script>