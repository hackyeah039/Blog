<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>webapp/WEB-INF/views/showWeather.jsp</title>
</head>
<body>
<h1>날씨정보</h1>
${result }
<a href="${pageContext.request.contextPath }/main.jsp">main.jsp</a>
</body>
</html>