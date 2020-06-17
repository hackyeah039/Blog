<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="" method="">
	<select name="field">
		<option >선택권1</option>
		<option <c:if test="${field=='선택권2' }">selected</c:if>>선택권2</option>
		<option selected>선택권3</option>
	</select>
	<input type="text" placeholder="keyword" >
	<input type="submit" value="등록">
</form>
<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
	<a href="list?pageNum=${i }&field=${field}&keyword=${keyword}">[i]</a>
</c:forEach>
</body>
</html>