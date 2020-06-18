<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="/spring13/resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	$(function(){
		$("input[name=addr]").keyup(function(){
			var value=$("input[name=addr]").val();
			$.getJSON({
				url: "/spring13/comments/json/"+value,
				dataType: "json",
				success: function(data){
					if(data.length==0){
						$("#result").html("정보가 없습니다");
					}else{
						$(data).each(function(i,json) {
							$("#result").html(" mnum : "+json.mnum+" name : "+json.mname+" email : "+json.memail+" phone :" +json.mphone + " addr : "+json.maddr+" reg : "+json.reg);						
						});
					}
				}
			})
		})
	})
</script>
<title>Insert title here</title>
</head>
<body>
<!-- 사는지역을 입력받아 해당지역에 거주하는 회원목록 출력하기 
jackson 
-->
거주지  <input type="text" name="addr"><br>
<div id="result"></div>
</body>
</html>