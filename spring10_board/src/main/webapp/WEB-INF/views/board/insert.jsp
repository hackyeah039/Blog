<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/board/insert.jsp</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath }/board/insert">
	작성자<br>
	<input type="text" name="writer"><br>
	제목<br>
	<input type="text" name="title"><br>
	내용<br>
	<textarea rows="5" cols="50" name="content"></textarea><br>
	<input type="submit" value="등록">
</form>
</body>
</html>