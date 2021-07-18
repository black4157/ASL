
$(document).ready(function() {
	var currentPosition = parseInt($("#floatMenu").css("top"));
	$(window).scroll(function() {
		var position = $(window).scrollTop();
		$("#floatMenu").stop().animate({
			"top" : position + currentPosition + "px"
		}, 1000);
	});
	
	$('#top1, #home1, #bottom1').click(function() {
		var id = $(this).attr("href");
		var offset = 60;
		var target = $(id).offset().top - offset;
		$('html,body').animate({
			scrollTop : target
		}, 500);
		event.preventDefault();
	});
	
	var menuOffset = $("#menu").offset();
	$(window).scroll(function() {
		if ($(document).scrollTop() > menuOffset.top) {
			$("#menu").css({"position": "fixed", "top": "0", "z-index": "100", "width": "100%"})
		} else {
			$("#menu").css({"position": "relative", "z-index": "100", "width": "100%"})
		}
	});
});

$(function(){
	var Page = new Array;
	Page[0] = "LSL";
	Page[1] = "DSL";
	Page[2] = "PSL";
	Page[3] = "SSL";
	Page[4] = "YSL";
	Page[5] = "HEM";
	
	var url = location.href;
	var getAr0 = url.indexOf(Page[0]);
	var getAr1 = url.indexOf(Page[1]);
	var getAr2 = url.indexOf(Page[2]);
	var getAr3 = url.indexOf(Page[3]);
	var getAr4 = url.indexOf(Page[4]);
	var getAr5 = url.indexOf(Page[5]);
	
	if(getAr0 != -1){
		$("li:eq(0) a").addClass("on");
	}
	if(getAr1 != -1){
		$("li:eq(1) a").addClass("on");
	}
	if(getAr2 != -1){
		$("li:eq(2) a").addClass("on");
	}
	if(getAr3 != -1){
		$("li:eq(3) a").addClass("on");
	}
	if(getAr4 != -1){
		$("li:eq(4) a").addClass("on");
	}
	if(getAr5 != -1){
		$("li:eq(5) a").addClass("on");
	}
});

