<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>/views/insert.jsp</title>
</head>
<body>
<h1>글작성</h1>
<form method="post" action="/test/insert2">
	<input type="text" name="writer" value="작성자">
	<input type="text" name="title" value="제목">
	<input type="text" name="content" value="내용">
	<input type="submit" value="등록">
</form>
</body>
</html>