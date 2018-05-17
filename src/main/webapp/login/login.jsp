<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    
    <title>Signin Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="../css/signin.css" rel="stylesheet">

	<%@ include file="/include/jquery.jsp" %>
	<%@ include file="/include/jscookie.jsp" %>
	<script>
	$(function(){
		$("#signinbtn").click(function(){
			console.log("signinbtn");
			//전송전 데이터 정리 
			var checked = $("#remember").prop("checked");
			if(checked)
				$("#remember").val("check");	
		
		 	$("#frm").submit();
		});
	})
	//cookie : cookie 이름
	//return : cookie 값
	function getCookie(cookieName){
		cookieName = cookieName + "=";
		var cookies = document.cookie.split("; ");
		//cookies : { userId=brown, remember=true, userId2=sally}
		
		for(var i = 0; i < cookies.length; i++){
			var cookie = cookies[i];		// cookie : userId=brown, remember=true, userId2=sally
			if(cookie.indexOf(cookieName) >= 0 )
				return cookie.substring(cookieName.length);
		}
	}
	
	//cookie 설정
	function setCookie(cookieName, cookieValue, expires){
		var today = new Date();
		today.setDate( today.getDate() + expires);
		document.cookie = cookieName + "=" + encodeURIComponent(cookieValue) + "; " +
		                  "path=/; " + "expires=" + today.toGMTString();
	}
	
	//cookie 삭제
	function deleteCookie(cookieName){
		setCookie(cookieName, "", -1);
		console.log("deleteCookie");
	}
	
	//화면 로딩시 쿠키에 설정된 사용자 값을 확인하여 설정해준다.
	function initUserId(){
		var userId = getCookie("userId");
		var remember = getCookie("remember");
		
		//아이디를 remeber
		if(remember == "true"){
			$("#userId").val(userId);	//사용자 아이디를 설정해준다.
			$("#password").focus();		//비밀번호 입력창으로 focus
			$("#remember").prop("checked", "checked" /*true*/ );	//remember me checkbox check
		}
	}
	
	//event 핸들러 초기화
	function initEvent(){
		
		//siginin btn 클릭 이벤트
		
	}
	
	
	</script>
  </head>
  <body>
    <div class="container">
      <form id="frm" class="form-signin" action="<%=request.getContextPath()%>/loginServlet" method="get">
        <h2 class="form-signin-heading">Please sign in</h2>
       
        <label for="mem_id" class="sr-only">UserId</label>
        <input type="text" id="mem_id" name="mem_id" class="form-control" placeholder="아이디를 입력해주세요" required autofocus>
        
        <label for="mem_pass" class="sr-only">Password</label>
        <input type="password" id="mem_pass" name="mem_pass" class="form-control" placeholder="비밀번호를 입력하세요" required>
        
         <div class="checkbox">
          <label>
            <input type="checkbox" id="remember" name="remember" value=""> Remember me
          </label>
        </div>
        
        <button id="signinbtn" class="btn btn-lg btn-primary btn-block" type="button">Sign in</button>
      </form>

    </div> <!-- /container -->

  </body>
</html>
    