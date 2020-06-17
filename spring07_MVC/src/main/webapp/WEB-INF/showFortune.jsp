<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WEB-INF/showFortune.jsp</title>
</head>
<body>
<h1>당신의 운세</h1>
<h2>${result}</h2>
<a href="${pageContext.request.contextPath}/main.jsp">main.jsp</a>
</body>
</html>