<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home.jsp</title>
</head>
<body>
<ul>
	<li><a href="/spring10/insert">글등록</a></li>
	<li><a href="/spring10/list">글목록</a></li>
</ul>
<h1>최신글</h1>
<table>
<tr>
	<th>아이디</th>
	<th>제목</th>
	<th>컨텐츠</th>
	<th>조회수</th>
</tr>
<c:forEach var="listd" items="${vo}">
<tr>
	<td>${listd.writer }</td>
	<td>${listd.title }</td>
	<td>${listd.content }</td>
	<td>${listd.hit }</td>
</tr>
</c:forEach>
</table>
</body>
</html>