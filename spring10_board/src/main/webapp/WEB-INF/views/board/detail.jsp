<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>상세글 보기</h1>
<table border="1" width="500">
	<tr>
		<td>글번호</td>
		<td>${vo.num }</td>
	</tr>
	<tr>
		<td>작성자</td>
		<td>${vo.writer }</td>
	</tr>
	<tr>
		<td>제목</td>
		<td>${vo.title }</td>
	</tr>
	<tr>
		<td>글내용</td>
		<td>${vo.content }</td>
	</tr>
	<tr>
		<td>조회수</td>
		<td>${vo.hit }</td>
	</tr>
	<tr>
		<td>이전글</td>
		<td><a href="/spring10/board/detail?num=${prev.num }">${prev.title }</a></td>
	</tr>
	<tr>
		<td>다음글</td>
		<td><a href="/spring10/board/detail?num=${next.num }">${next.title }</a></td>
	</tr>
</table>
</body>
</html>