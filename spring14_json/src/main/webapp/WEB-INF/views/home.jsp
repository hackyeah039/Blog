<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="/spring14/resources/js/jquery-3.5.1.js"></script>
<title>views/home.jsp</title>
</head>
<body>
<p>
	<a href="/spring14/json">json가기</a>
</p>
<input type="button" value="btn1" id="btn1">
<div id="list">  
<!-- 회원번호를 입력받아 해당회원의 정보를 조회해 보세요 -->
회원번호 <input type="text" name="num">
<input type="button" value="조회" id="btn2">
<div id="result"></div>                                                              
</div>
</body>
<script>
	$(function(){
		$("#btn1").click(function(){
			$.ajax({
				url: "/spring14/members/list",
				dataType: "json",
				success: function(data){
					$(data).each(function(i,mem) { //i는 인덱스번호,mem은 인덱스에 해당하는  jsonObject
						/* var num=$(this).prop("num").text();
						var name=$(this).prop("name").text();
						var phone=$(this).prop("phone").text();
						var addr=$(this).prop("addr").text();
						console.log(num+":"+name+":"+phone+":"+addr) */
						var str=mem.num+","+mem.name+","+mem.phone+","+mem.addr+","+mem.regdate
						$("#list").append("<div>"+str+"</div>");
					})
				}
			})
		})
		$("#btn2").click(function(){
			var mnum=$("input[name=num]").val();
			/* 선생님 방식 :주소다음에 값을 넣어줌, 받는곳에서도 value에서 /#(num) 이런식으로 주소에서 받음, RestFul한 방식 (ResutFul)
				$.getJSON("/spring14/members/list2/"+num,function(data){ 주소다음에 값을 넣어줌, 받는곳에서도 value에서 /#(num) 이런식으로 주소에서 받음, RestFul한 방식
				if(data.code=='success'){
					$("#result").append("회원이름 : "+data.name+"<br>");
					$("#result").append("회원이름 : "+data.phone+"<br>");
				}else{
					$("#result").empty();
					alert("등록된 정보가 없어요!");
				}
			}) */
			$.ajax({
				url: "/spring14/members/list2",
				dataType: "json",
				success: function(data){
					$(data).each(function(i, json) {
						
						if(json.num==mnum){
							console.log("3")
							$("#result").html("<div>"+json.num+","+json.name+","+json.phone+","+json.addr+","+json.regdate+"</div>");
							return false;
						}else{
							console.log("2")
							$("#result").html("<div>찾으시는 회원이 없습니다.</div>");
						}
					})
				}
			})
		})
	})
</script>
</html>