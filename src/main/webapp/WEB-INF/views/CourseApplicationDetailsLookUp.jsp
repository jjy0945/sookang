<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<title>Home</title>
	<link rel="stylesheet" href="resources/styles/custom.css">
</head>
<script>
		function expireSession()
		{
  			window.location = "/sookang/Logout";
  			alert("장시간 응답이 없어 로그인 페이지로 이동합니다.");
		}
		setTimeout('expireSession()', <%= request.getSession().getMaxInactiveInterval() * 1000 %>);
</script>
<body>
<div class="jumbotron text-center mb-0"> 
	
	<img src="resources/logo.png" width="150px" height="150px">
	<h1>한국대학교 수강신청 페이지</h1>
	<br>
	<p>한국대학교의 수강신청 페이지입니다. (학생)</p>
	
</div> 

<nav id="b" class="navbar navbar-expand-sm navbar-dark"> 
	<a id="c" href="#" class="navbar-brand">홈으로</a> 
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar"> 
	<span class="navbar-toggler-icon"></span></button> 
	
	<div class="collapse navbar-collapse justify-content-center" id="collapsibleNavbar"> 
	
		<ul class="navbar-nav" > 
				<li class="nav-item"><a id="c" href="Logout" class="nav-link">로그아웃</a></li> 
			<li class="nav-item"><a id="c" href="StudentModForm" class="nav-link">사용자 정보 수정</a></li> 
			<li class="nav-item"><a id="c" href="OpeningSubjectInfoS" class="nav-link">수강 신청</a></li> 
			<li class="nav-item"><a id="c" href="CourseApplicationDetailsInfo" class="nav-link">수강 신청 취소</a></li> 
			<li class="nav-item"><a id="c" href="CourseApplicationDetailsLookUp" class="nav-link">수강 신청 조회</a></li>
		</ul> 
	</div> 
</nav>


<div id="a" class="container-fluid">
        <div class="row">
            <div class="font-weight-bold text-center col-4">열정</div>
            <div class="font-weight-bold text-center col-4">비전</div>
            <div class="font-weight-bold text-center col-4">성장</div>
        </div>
</div>   

<div id="d" class="container-fluid">
 	<table class="table table-striped table-bordered table table-hover">

	<thead>
    	<tr>
      	<th style="width:10%">학생 아이디</th>
      	<th style="width:10%">개설과목 아이디</th>
      	<th style="width:10%">과목 아이디</th>
      	<th style="width:15%">과목 이름</th>
      	<th style="width:15%">교수이름</th>
      	<th style="width:15%">강의 시간</th>
      	<th style="width:15%">강의실</th>
      	<th style="width:10%">학점</th>
    	</tr>
	</thead>

	<tbody>
		<c:forEach items="${CADlist}" var="dto">
    	<tr>
      	<td>${dto.sSTUDENT_ID}</td>
      	<td>${dto.sOPENING_SUBJECT_ID}</td>
      	<td>${dto.sSUBJECT_ID}</td>
      	<td>${dto.sSUBJECT_NAME}</td>
      	<td>${dto.sPROFESSOR_NAME}</td>
      	<td>${dto.sLECTURE_TIME}</td>
      	<td>${dto.sLECTURE_ROOM}</td>
      	<td>${dto.sSCORE}</td>
		</c:forEach>
	</tbody>

	</table>
</div>


  

 
  
    


   <footer id="sticky-footer" class="py-4">
    <div class="container-fluid text-center">
      <h6>03030 서울시 XX동 150번길 2 한국대학교 | Tel. 02-111-2222 | Fax. 02-222-3333
      <br> 
		Copyright 2019 Hankuk National University All Rights Reserved.</h6>
    </div>
  </footer>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>