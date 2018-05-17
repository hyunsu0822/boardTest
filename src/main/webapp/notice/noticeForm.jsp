<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<!-- <link rel="icon" href="../../favicon.ico"> -->

<title>Dashboard Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link
	href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="<%=request.getContextPath()%>/css/dashboard.css"
	rel="stylesheet">

<%@ include file="/include/jquery.jsp" %>

<script>


$(function(){
		
	//화면 로딩시 회원 아이디 입력칸에 focus
	$("#mem_id").focus();
	
	
	//insertNotice 게시판 추가 버튼
	$("#insertNotice").click(function(){
		//validation
		if($("#category_seq").val().trim() == "" ){
			alert("게시판 번호가 입력되지 않았습니다.");
			$("#category_seq").focus();
			return false;
		}
		
		if($("#ntc_name").val().trim() == "" ){
			alert("게시판 명이 입력되지 않았습니다.");
			$("#ntc_name").focus();
			return false;
		}
		
	
		//submit
		$("#frm").submit();
	});
});	
</script>    
</head>

<body>
	<%@ include file="/layout/header.jsp"%>

	<div class="container-fluid">
		<div class="row">
			<%@ include file="/layout/left.jsp"%>

			<!-- <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main"> -->
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<form id="frm" action="${pageContext.request.contextPath}/insertNotice"
					  method="post" class="form-horizontal" role="form"
					  enctype="multipart/form-data">
					  
					<div class="form-group">
						<label for="noticeNum" class="col-sm-2 control-label">게시판번호</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="category_seq" name="category_seq"
								placeholder="게시판번호">
						</div>
					</div>
					
					<div class="form-group">
						<label for="noticeName" class="col-sm-2 control-label">게시판명</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="ntc_name" name="ntc_name"
								placeholder="게시판명">
						</div>
					</div>

					<div class="form-group">
						<label for="noticeYn" class="col-sm-2 control-label">활성화 여부</label>
						<div class="col-sm-1">
							Y :<input type="radio" size="" class="form-control" id="atv_yn" name="atv_yn">
							N :<input type="radio" class="form-control" id="atv_yn" name="atv_yn">
						</div>
					</div>
					
					
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button id="insertNotice" type="button" class="btn btn-default">게시판 등록</button>
						</div>
					</div>
					
				</form>
			</div>
		</div>
	</div>
	
	<script
		src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>	
</body>
</html>
