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
<c:choose>
	<c:when test="${result==1}">
		<h1>삭제가 완료되었습니다.</h1>
	</c:when>
	<c:otherwise>
		<h1>삭제가 실패하였습니다.</h1>
	</c:otherwise>
</c:choose>
</body>
</html>