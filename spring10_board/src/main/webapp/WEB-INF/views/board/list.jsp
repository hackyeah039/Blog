<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board/list.jsp</title>
</head>
<body>
<h1>게시글목록</h1>
<table border="1" width="500">
	<tr>
		<th>글번호</th>
		<th>작성자</th>
		<th>제목</th>
		<th>작성일</th>
		<th>수정</th>
		<th>삭제</th>
	</tr>
	<c:forEach var="vo" items="${list }">
		<tr>
			<td>${vo.num }</td>
			<td>${vo.writer }</td>
			<td><a href="/spring10/board/detail?num=${vo.num }">${vo.title }</a></td>
			<fmt:formatDate value="${vo.regdate }" pattern="yyyy-MM-dd" var="regdate"/>
			<td>${regdate }</td>
			<td><a href="/spring10/board/update?num=${vo.num }">수정</a></td>
			<td><a href="/spring10/board/delete?num=${vo.num }">삭제</a></td>
		</tr>
	</c:forEach>
</table>
<!-- 검색 -->
<div>
	<form method="post" action="/spring10/list">
		<select name="field">
			<option value="title"<c:if test="${field=='title' }">selected</c:if>>
				제목</option>
			<option value="writer"<c:if test="${field=='writer' }">selected</c:if>>
				작성자</option>
			<option value="content"<c:if test="${field=='content' }">selected</c:if>>
				내용</option>
		</select>
		<input type="text" name="keyword" value="${keyword }">
		<input type="submit" value="검색">
	</form>
</div>

<c:choose>
	<c:when test="${pu.startPageNum>4 }">
		<a href="list?pageNum=${pu.startPageNum-1}&field=${field}&keyword=${keyword}">[이전]</a>
	</c:when>
	<c:otherwise>
		이전
	</c:otherwise>
</c:choose>
<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
		<a href="list?pageNum=${i }&field=${field}&keyword=${keyword}">${i }</a>
</c:forEach>
<c:choose>
	<c:when test="${pu.endPageNum<pu.totalPageCount }">
		<a href="list?pageNum=${pu.endPageNum+1 }&field=${field}&keyword=${keyword}">[이후]</a>
	</c:when>
	<c:otherwise>
		이후
	</c:otherwise>
</c:choose>


<h1><a href="${pageContext.request.contextPath }">메인으로 돌아가기</a></h1>
</body>
</html>