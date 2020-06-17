<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>업데이트</h1>
<form method="post" action="/spring11/realupdate" enctype="multipart/form-data">
	번호<br>
	<input type="text" name="filenum" value="${filenum}" blocked><br>
	작성자<br>
	<input type="text" name="writer" placeholder="작성자를 수정해주세요."><br>
	제목<br>
	<input type="text" name="title" placeholder="제목을 수정해주세요."><br>
	내용<br>
	<textarea rows="5" cols="50" name="content" placeholder="내용을 수정해주세요"></textarea><br>
	첨부파일<br>
	<input type="file" name="file1"><br>
	<input type="submit" value="수정">
</form>
</body>
</html>