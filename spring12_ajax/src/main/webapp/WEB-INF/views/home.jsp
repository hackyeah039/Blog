<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/spring12/resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#btn1").click(function(){
			$.ajax({
				url: "/spring12/members/xml",
				dataType: "xml",
				success: function(data){
					$(data).find("member").each(function(i, element) {
						var num= $(this).find("num").text();
						var name=$(this).find("name").text();
						var phone=$(this).find("phone").text();
						var addr=$(this).find("addr").text();
						var regdate=$(this).find("regdate").text();
						$("#list").append("숫자는 :"+num+" 이름은 : "+name+"번호는 : "+phone+"주소는  : "+addr+" 날짜는 : "+regdate+"<br>")
					})
				}
				
			})
		})
		$("#btn2").click(function(){
			var id=$("input[name=name1]").val();
			var email=$("input[name=email]").val();
			$.ajax({
				url: "/spring12/idcheck/xml",
				dataType: "xml",
				success: function(data){
					$(data).find("member").each(function(){
						var name=$(this).find("name").text();
						var num=$(this).find("num").text();
						var phone=$(this).find("phone").text();
						var addr=$(this).find("addr").text();
						var regdate=$(this).find("regdate").text();
						var remail=$(this).find("email").text();
						if(id==name && email==remail){
							$("#result").html("name :"+name+" num : "+num+" phone: "+phone+" addr: "+addr +" regdate :" +regdate +" email : "+remail);
						}
					})
				}
				
			})
		})
	});
</script>
</head>
<body>
<input type="button" id="btn1" value="버튼1">
<div id="list">
</div>
<br>
<!-- 이름과 이메일을 받아서 해당하는 id를 조회해서 result에 출력해 보세요 -->
<h1>아이디찾기</h1>
이름<input type="text" name="name1"><br>
이메일<input type="text" name="email"><br>
<input type="button" id="btn2" value="버튼2"><br>
<div id="result"/>
</body>
</html>







