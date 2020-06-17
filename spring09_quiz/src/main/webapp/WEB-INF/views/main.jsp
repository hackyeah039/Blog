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
<h1>메인입니다.</h1>
<ul>
	<c:choose>
		<c:when test="${sessionScope.id==null }">
			<li><a href="${pageContext.request.contextPath }/login">로그인</a></li>
		</c:when>
		<c:otherwise>
			<li><a href="${pageContext.request.contextPath }/logout">로그아웃</a></li>
		</c:otherwise>
	</c:choose>
	<li><a href="${pageContext.request.contextPath }/insert">회원가입</a></li>
	<li><a href="${pageContext.request.contextPath }/list">목록조회</a></li>
</ul>
</body>
</html>