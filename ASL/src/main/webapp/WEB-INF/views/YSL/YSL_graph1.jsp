<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript">
	var Year1 = new Array();
	var AvgScore1 = new Array();
</script>
   
<c:forEach items="${YSL_AvgScore1 }" var="AVG1">
	<script>
		Year1.push("${AVG1.EFC_YY}");
		AvgScore1.push("${ AVG1.avg }");
	</script>
</c:forEach>

<!-- 1급그래프 출력 -->
<div class="wt_graph1">
	<h2 class="graph_title">연도별 평균합격점</h2>
	<div class="wt_avg">
		<script>
			function avg(AvgScore) {
			    var result = 0.0;
			    for (var i = 0; i < AvgScore.length; i++) {
			        result += parseFloat(AvgScore[i]);
			    }
			    return Math.round(result / parseFloat(AvgScore.length));
			}
			document.write(Year1[0] + "년 ~ " + Year1[3] + "년까지의 평균 : " + avg(AvgScore1));
		</script>
	</div>
	<div id="columnchart_values1"></div>
</div>

<!-- 구글차트 스크립트 -->
<script>
	google.charts.load("current", {packages:['corechart']});
	google.charts.setOnLoadCallback(drawChart);
	function drawChart() {
		var data = google.visualization.arrayToDataTable([
		  ["시행연도", "합격점수", { role: "style" } ],
		  [Year1[0], parseFloat(AvgScore1[0]), "silver"],
		  [Year1[1], parseFloat(AvgScore1[1]), "gold"],
		  [Year1[2], parseFloat(AvgScore1[2]), "red"],
		  [Year1[3], parseFloat(AvgScore1[3]), "bule"]
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
		  bar: {groupWidth: "95%"},
		  legend: { position: "none" },
		  backgroundColor: "#F0F8FF",
		  hAxis: {
	      	title: "연도"
	      },
          vAxis: {
	        title: "평균점수(점)",
	       	minValue: 260
	      },
	      textStyle: {  
                 fontName: "Verdana",
                 fontSize: 24, 
                 bold: true,    
                 italic: false   
              },
		};
		var chart = new google.visualization.ColumnChart(document.getElementById("columnchart_values1"));
		chart.draw(view, options);
	}
</script>