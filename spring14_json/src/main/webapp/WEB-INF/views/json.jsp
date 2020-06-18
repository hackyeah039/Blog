<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/json.jsp</title>
<script type="text/javascript" src="/spring13/resources/js/jquery-3.5.1.js"></script>
<script>
	$(function(){
		$("input=[name=check]").click(function(){
			var num=$("#num").val();
			$.getJSON({
				url: "/spring14/json/find/"+num,
				dataType: "json",
				success: function(data){
					$(data).each(function(i,json) {
						
					})
				} 
			})
		})
	})
</script>
</head>
<body>
<input type="text" id="num">
<input type="button" name="check" value="확인">
<div id="result"></div>
</body>
</html>