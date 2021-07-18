<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
	google.charts.load('current', {
		'packages' : [ 'bar' ]
	});
	google.charts.setOnLoadCallback(drawChart);

	function drawChart() {
		var data = google.visualization.arrayToDataTable([
				[ "Year", rankArray[0][0], rankArray[1][0], rankArray[2][0] ],
				[ "2016", rankArray[0][1], rankArray[1][1], rankArray[2][1] ],
				[ "2017", rankArray[0][1], rankArray[1][1], rankArray[2][1]] ]);

		var options = {
			width : 600,
			height : 400,
			legend : {
				position : "none"
			},
			backgroundColor : "#f0f0f0",
			hAxis : {
				title : "연도",
			},
			vAxis : {
				title : "응시수"
			},
			bars : 'vertical' // Required for Material Bar Charts.
		};

		var chart = new google.charts.Bar(document
				.getElementById('barchart_material'));

		chart.draw(data, google.charts.Bar.convertOptions(options));
	}
</script>
</head>
<body>
	<div id="barchart_material"></div>
</body>
</html> --%>
