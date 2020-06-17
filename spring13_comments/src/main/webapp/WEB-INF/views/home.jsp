<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/home.jsp</title>
<style type="text/css">
	.comments{
		width:400px;
		padding:3px;
		border:1px solid #aaa;
		margin: 5px;
		border-radius: 5px;
	}
</style>
<script type="text/javascript" src="/spring13/resources/js/jquery-3.5.1.js"></script>
</head>
<body>
<h1>영화정보</h1>
<div>
	<h1>${title }</h1>
</div>
<div id="movieComments">
	<!-- 댓글목록 -->
	<div id="commList">
	</div>
	<!-- 페이징처리 -->
	<div id="page">
	</div>
	<div id="commAdd">
		아이디 <input type="text" id="writer"><br>
		영화평 <textarea rows="3" cols="40" id="content"></textarea><br>
		<input type="button" value="등록" id="addBtn">
	</div>
</div>
</body>
<script type="text/javascript">
	$(function(){
		getList(1);
		
		$("#addBtn").click(function(){
			var id=$("#writer").val();
			var comments=$("#content").val();
			
			insert(1,id,comments);
		})
	});
	function update(num,comments,id){
		$.ajax({
			url: "/spring13/comments/update",
			data:{num:num,comments:comments,id:id},
			dataType: "xml",
			success: function(data){
				var addbtn=$("#addbtn").val();
				var writer=$("#writer").val();
				var content=$("#content").val();
				addbtn="수정";
				content=$(data).find("content").text();
				writer=$(data).find("writer").text();
			}
		})
	}
	function remove(num){
		$.ajax({
			url: "/spring13/comments/delete",
			data:{num:num},
			dataType: "text",
			success: function(data){
				getList(1);
			}
		})
	}
	function insert(mnum,id,comments){
		$.ajax({
			url: "/spring13/comments/insert",
			data:{mnum:mnum,id:id,comments:comments},
			dataType: "text",
			success: function(data){
				getList(1);
			}
		})
	}
	function getList(pageNum){
		$("#commList").empty();
		$.ajax({
			url:"/spring13/comments/list",
			data:{pageNum:pageNum,mnum:${mnum}},
			dataType:"xml",
			success:function(data){
				$(data).find("list").each(function(){
					var num=$(this).find("num").text();
					var mnum=$(this).find("mnum").text();
					var id=$(this).find("id").text();
					var comments=$(this).find("comments").text();
					var html="<div class='comments'>[작성자]" + id +"<br>" +
					          comments+ "<a href='javascript:remove("+num+");'>삭제</a><br> <a href='javascript:update("+num+","+comments+","+id+");'>수정</a>"+
					          "</div>";
					$("#commList").append(html);
				});
				//페이징처리
				var pageHTML="";
				var startPageNum=parseInt($(data).find("startPageNum").text());
				var endPageNum=parseInt($(data).find("endPageNum").text());
				var pageCount=parseInt($(data).find("pageCount").text());
				
				if(startPageNum>5){
					pageHTML += "<a href='javascript:getList("+ (startPageNum-1) +")'>이전</a>";
				}
				for(var i=startPageNum;i<=endPageNum;i++){
					if(i==pageNum){ 
						pageHTML += "<a href='javascript:getList("+ i +")'><span style='color:red'>[" + i +"]</span></a>";
					}else{	
						pageHTML += "<a href='javascript:getList("+ i +")'><span style='color:gray'>[" + i +"]</span></a>";
					}
				}
				if(endPageNum<pageCount){
					pageHTML += "<a href='javascript:getList("+ (endPageNum+1) +")'>다음</a>";
				}
				$("#page").html(pageHTML);
			}
		});
	}
	
</script></html>