<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
	<th>회원번호</th>
	<th>회원이름</th>
	<th>전화번호</th>
	<th>주소</th>
	<th>가입일자</th>
	<th>삭제</th>
	<th>수정</th>
</tr>
<c:forEach items="${list }" var="list">
<tr>
	<td><option>${list.num}</option></td>
	<td><option>${list.name}</option></td>
	<td><option>${list.phone}</option></td>
	<td><option>${list.addr}</option></td>
	<td><option>${list.regdate}</option></td>
	<td><a href="${pageContext.request.contextPath}/delete?num=${list.num}">삭제</a></td>
	<th><a href="${pageContext.request.contextPath}/update?num=${list.num}">수정</a></th>
</tr>
</c:forEach>
</table>
</body>
</html>