<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div><!-- items.jsp -->
	<h1>판매상품목록</h1>
	<ul>
		<c:forEach var="a" items="${list }">
			<li>${a }</li>
		</c:forEach>
	</ul>
</div>