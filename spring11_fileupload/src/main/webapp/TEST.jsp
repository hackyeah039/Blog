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
		<option >���ñ�1</option>
		<option <c:if test="${field=='���ñ�2' }">selected</c:if>>���ñ�2</option>
		<option selected>���ñ�3</option>
	</select>
	<input type="text" placeholder="keyword" >
	<input type="submit" value="���">
</form>
<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
	<a href="list?pageNum=${i }&field=${field}&keyword=${keyword}">[i]</a>
</c:forEach>
</body>
</html>