<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- SpringMVC를 사용해서 두수합의 결과를 WEB_INF/result.jsp에 출력되도록 해보세요. -->
<h1>두수합 구하기</h1>
<form method="post" action="sum">
	정수1 <input type="text" name="num1"><br>
	정수2 <input type="text" name="num2"><br>
	<input type="submit" value="두수합">
</form>
</body>
</html>