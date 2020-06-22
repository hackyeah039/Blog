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
			<li><a href="/test/">Ȩ����</a></li>
			<li><a href="/test/insert">���ۼ�</a></li>
		</ul>
	</div>
	<div id="content">
		<h1>�Խ���</h1>
		<span><a href="/test/">Ȩ����</a></span>
	</div>
	<table>
		<tr>
			<th>�۹�ȣ</th>
			<th>�ۼ���</th>
			<th>����</th>
			<th>����</th>
		</tr>
	<c:forEach var="vo" items="${list }">
		<tr>
			<td>${vo.num }</td>
			<td>${vo.writer }</td>
			<td>${vo.title }</td>
			<td><a href="/test/delete?num=${vo.num }">����</a></td>
		</tr>
	</c:forEach>
	</table>
	
	<div>
	<form method="post" action="/test/">
		<select name="field">
			<option value="title" <c:if test="${field=='title' }">selected</c:if>>����</option>
			<option value="writer" <c:if test="${field=='writer' }">selected</c:if>>����</option>
			<option value="all" <c:if test="${field=='all' }">selected</c:if>>����+����</option>
		</select>
		<input type="text" name="keyword" value="${keyword }">
		<input type="submit" value="�˻�">
	</form>
	</div>
	<div>
	<c:choose>
		<c:when test="${pu.startPageNum>5}">
			<a href="/test?pageNum=${pu.startPageNum-1 }">[pre]</a>
		</c:when>
		<c:otherwise>
			����
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
			����
		</c:otherwise>
	</c:choose>
	</div>
</div>
</body>
</html>