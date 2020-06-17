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
<table>
	<tr style="border: 1px solid black">
		<th>파일숫자</th>
		<th>회원</th>
		<th>파일제목</th>
		<th>파일내용</th>
		<th>원래파일이름</th>
		<th>저장된 파일이름</th>
		<th>파일사이즈</th>
		<th>이미지</th>
		<th>수정</th>
		<th>삭제</th>
		<th>다운로드</th>
	</tr>
	<c:forEach var="vo" items="${list}">
		<tr style="border: 1px solid black">
			<td>${vo.filenum }</td>
			<td>${vo.writer }</td>
			<td>${vo.title }</td>
			<td>${vo.content }</td>
			<td>${vo.orgfilename }</td>
			<td>${vo.savefilename }</td>
			<td>${vo.filesize }</td>
			<c:choose>
				<c:when test="${vo.orgfilename!=null}">
					<td><img src="/spring11/resources/upload/${vo.savefilename }"/></td>
				</c:when>
				<c:otherwise>
					<td>이미지X</td>
				</c:otherwise>			
			</c:choose>
			<td><a href="/spring11/delete?filenum=${vo.filenum }&savefilename=${vo.savefilename}">삭제</a></td>
			<td><a href="/spring11/update?filenum=${vo.filenum }">수정</a></td>
			<td><a href="/spring11/download?filenum=${vo.filenum }">다운로드</a></td>
		</tr>
	</c:forEach>
</table>


<form method="post" action="/spring11/file/list">
	<input type="checkbox" name="field" value="title"   <c:if test="${field=='title'}">checked</c:if>>제목</input>
	<input type="checkbox" name="field" value="writer"  <c:if test="${field=='writer'}">checked</c:if>>작성자</input>
	<input type="checkbox" name="field" value="content" <c:if test="${field=='content'}">checked</c:if>>내용</input>
	<input type="text" name="keyword" value=${keyword }>
	<input type="submit" value="검색">
</form>

<c:choose>
	<c:when test="${pu.startPageNum>4 }">
		<a href="list?pageNum=${pu.startPageNum-1}&field=${field}&keyword=${keyword}">[이전]</a>
	</c:when>
	<c:otherwise>
		이전
	</c:otherwise>
</c:choose>	
	<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
		<a href="/spring11/file/list?pageNum=${i }&keyword=${keyword}&field=${field}">${i} </a>
	</c:forEach>
<c:choose>
	<c:when test="${pu.endPageNum<pu.totalPageCount}"> 
		<a href="/spring11/file/list?pageNum=${pu.endPageNum+1}&field=${field}&keyword=${keyword}">[이후]</a>
	</c:when>
	<c:otherwise>
		이후
	</c:otherwise>
</c:choose>
</body>
</html>