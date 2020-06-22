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
<div>
	<div id="header">
		<ul>
			<li><a href="/test/">홈으로</a></li>
			<li><a href="/test/insert">글작성</a></li>
		</ul>
	</div>
	<div id="content">
		<h1>게시판</h1>
		<span><a href="/test/">홈으로</a></span>
	</div>
	<table>
		<tr>
			<th>글번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>삭제</th>
		</tr>
	<c:forEach var="vo" items="${list }">
		<tr>
			<td>${vo.num }</td>
			<td>${vo.writer }</td>
			<td>${vo.title }</td>
			<td><a href="/test/delete?num=${vo.num }">삭제</a></td>
		</tr>
	</c:forEach>
	</table>
	
	<div>
	<form method="post" action="/test/">
		<select name="field">
			<option value="title" <c:if test="${field=='title' }">selected</c:if>>제목</option>
			<option value="writer" <c:if test="${field=='writer' }">selected</c:if>>내용</option>
			<option value="all" <c:if test="${field=='all' }">selected</c:if>>제목+내용</option>
		</select>
		<input type="text" name="keyword" value="${keyword }">
		<input type="submit" value="검색">
	</form>
	</div>
	<div>
	<c:choose>
		<c:when test="${pu.startPageNum>5}">
			<a href="/test?pageNum=${pu.startPageNum-1 }">[pre]</a>
		</c:when>
		<c:otherwise>
			이전
		</c:otherwise>
	</c:choose>
	</div>
	<div>
	<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
		<c:choose>
			<c:when test="${i==pu.pageNum }">
				<a href="/test?pageNum=${i}&field=${field}&keyword=${keyword}">${i }</a>
			</c:when>
			<c:otherwise>
				<a href="/test?pageNum=${i }&field=${field}&keyword=${keyword}">${i }</a>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	</div>
	<div>
	<c:choose>
		<c:when test="${pu.endPageNum<pu.totalPageCount}">
			<a href="/test?pageNum=${pu.endPageNum+1 }">[next]</a>
		</c:when>
		<c:otherwise>
			이후
		</c:otherwise>
	</c:choose>
	</div>
</div>
</body>
</html>