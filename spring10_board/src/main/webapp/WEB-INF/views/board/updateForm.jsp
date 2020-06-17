<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원수정</h1>
<%int num=Integer.parseInt(request.getParameter("num"));%>
<form method="post" action="/spring10/board/real">
	<input type="text" value=<%=num %> name="num" hidden>
	<input type="text" placeholder="회원아이디" name="writer">
	<input type="text" placeholder="글제목" name="title">
	<input type="text" placeholder="글컨텐츠" name="content">
	<input type="submit" value="등록">
</form>
</body>
</html>