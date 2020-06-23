<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="realUpdate">
	<input type="text" name="num" value="<%=request.getParameter("num")%>"><br> 
	<input type="text" name="name" value="회원이름" required><br>
	<input type="text" name="phone" value="회원전화번호" required><br> 
	<input type="text" name="addr" value="회원주소" required><br>
	<input type="submit">
</form> 
</body>
</html>