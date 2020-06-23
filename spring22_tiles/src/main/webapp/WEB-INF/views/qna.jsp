<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
	<c:forEach var="list2" items="${list }">
		<ul>
			<li>${list2 }</li>
		</ul>
	</c:forEach>
</div>