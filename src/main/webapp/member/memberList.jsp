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

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<!-- <script src="../../assets/js/ie-emulation-modes-warning.js"></script> -->

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<%@ include file="/include/commonCss.jsp" %>    
<%@ include file="/include/jquery.jsp" %>
<script>
$(function(){
	
	//회원 tr 태그 click 이벤트 처리
	$("#memberList tr").click(function(){
		//this : tr
		var mem_id = $(this).find("td:eq(0)").text();
		$("#mem_id").val(mem_id);
		$("#frm").submit();
	});
	
});
</script>    
</head>

<body>
	<%@ include file="/layout/header.jsp"%>

<form id="frm" method="get" action="${pageContext.request.contextPath }/getMember">
	<input type="hidden" id="mem_id" name="mem_id" > 
</form>

	<div class="container-fluid">
		<div class="row">
			<%@ include file="/layout/left.jsp"%>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h2 class="sub-header">회원 리스트</h2>
				<div class="table-responsive">
					<table class="table table-striped table-hover">
						<thead>
							<tr>
								<th>ID</th>
								<th>사용자이름</th>
								<th>주소1</th>
								<th>생일</th>
							</tr>
						</thead>
						<tbody id="memberList">
							<!-- memberList 출력 -->

							<c:forEach items="${memberList }" var="member">
								<tr>
									<td>${member.mem_id}</td>
									<td>${member.mem_name}</td>
									<td>${member.mem_add1}</td>
									<td><fmt:formatDate value="${member.mem_bir}"
											pattern="yyyy-MM-dd" /></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<!-- pageNavigation -->
				${pageNav }
				
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>

	<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
	<!-- <script src="../../assets/js/vendor/holder.js"></script> -->

	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<!-- <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script> -->
</body>
</html>
