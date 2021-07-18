<script>
	//array명.sort();
	rankArray.sort(function (a1, a2) {
	    //var idx = 0; // 이름
	    var idx = 1; // 응시수

	    switch (idx) {
	        case 0: // 이름 - 문자열 정렬 (사실 기본이라 아무것도 안해도 됨)
	            a1[idx] = a1[idx].toString().toLowerCase();
	            a2[idx] = a2[idx].toString().toLowerCase();
	            break;
	        case 1: // 나이 - 정수변환
	            a1[idx] = parseInt(a1[idx]);
	            a2[idx] = parseInt(a2[idx]);
	            break;
	    }

	    return (a1[idx]>a2[idx]) ? -1 : ( (a1[idx]<a2[idx] ) ? 1 : 0);
	});

</script>