<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript">
	var AvgScore2 = new Array();
</script>
   
<!-- 배열에 jstl값 넣기 (2급) -->
<c:forEach items="${PSL_AvgScore2 }" var="AVG2">
	<script>
		AvgScore2.push("${ AVG2.avg }");
	</script>
</c:forEach>

<!-- 2급그래프 출력 -->
<div class="wt_graph2">
	<h2 class="graph_title">2급 연도별 평균합격점</h2>
	<div class="wt_avg">
		<script>
			function avg(AvgScore) {
			    var result = 0.0;
			    for (var i = 0; i < AvgScore.length; i++) {
			        result += parseFloat(AvgScore[i]);
			    }
			    return Math.round(result / parseFloat(AvgScore.length));
			}
			document.write(Year1[0] + "년 ~ " + Year1[3] + "년까지의 평균 : " + avg(AvgScore2));
		</script>
	</div>
	<div id="columnchart_values2"></div>
</div>


<!-- 구글차트 스크립트 -->
<script>
	google.charts.load("current", {packages:['corechart']});
	google.charts.setOnLoadCallback(drawChart);
	function drawChart() {
		var data = google.visualization.arrayToDataTable([
		  ["시행연도", "합격점수", { role: "style" } ],
		  [Year1[0], parseFloat(AvgScore2[0]), "silver"],
		  [Year1[1], parseFloat(AvgScore2[1]), "gold"],
		  [Year1[2], parseFloat(AvgScore2[2]), "red"],
		  [Year1[3], parseFloat(AvgScore2[3]), "bule"]
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
	      	title: "연도",
	      },
          vAxis: {
	        title: "평균점수(점)",
	        minValue: 320
	      },
	      TextStyle: {  
                 fontName: "Verdana",
                 fontSize: 24, 
                 bold: true,    
                 italic: false   
              },
		};
		var chart = new google.visualization.ColumnChart(document.getElementById("columnchart_values2"));
		chart.draw(view, options);
	}
</script>