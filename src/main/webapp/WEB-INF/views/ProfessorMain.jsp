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
	<p>한국대학교의 수강신청 페이지입니다. (교수)</p>
	<p>(${session.getAttribute("Id")})님, 환영합니다.</p> 
</div> 

<nav id="b" class="navbar navbar-expand-sm navbar-dark"> 
	<a id="c" href="#" class="navbar-brand">홈으로</a> 
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar"> 
	<span class="navbar-toggler-icon"></span></button> 
	
	<div class="collapse navbar-collapse justify-content-center" id="collapsibleNavbar"> 
	
		<ul class="navbar-nav" > 
			<li class="nav-item"><a id="c" href="Logout" class="nav-link">로그아웃</a></li> 
			<li class="nav-item"><a id="c" href="ProfessorModForm" class="nav-link">사용자 정보 수정</a></li> 
			<li class="nav-item"><a id="c" href="OpeningSubjectForm" class="nav-link">강의 개설</a></li> 
			<li class="nav-item"><a id="c" href="OpeningSubjectInfo" class="nav-link">강의 개설 취소</a></li> 
			<li class="nav-item"><a id="c" href="OpeningSubjectInfoLookUp" class="nav-link">강의 개설 조회</a></li>
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
 	<br>
    <h5 class="mt-0">Lorem ipsum dolor sit amet, consectetur adipiscing elit</h5>
    Phasellus sed dui fringilla, tempor risus eu, placerat diam. Mauris libero orci, consequat maximus pharetra eu, vehicula in nibh. Duis a diam eu odio hendrerit eleifend. Mauris quis varius ante. Cras lobortis nunc erat. Sed eget odio venenatis, porta purus in, suscipit diam. Mauris in feugiat lacus. Praesent in blandit justo. Phasellus eleifend, ex vitae feugiat egestas, mi libero congue lacus, sit amet rhoncus nisi metus eget arcu. 
    <br>
    <br>
    <h5 class="mt-0">Donec varius non diam efficitur convallis.</h5>
    Vivamus dictum dapibus felis et consectetur. Curabitur sit amet porta dui. Etiam eget nibh dui. Donec gravida tempor nisi a sollicitudin. Aliquam et interdum nisl, in eleifend augue. Quisque maximus mi id orci lobortis, blandit facilisis justo ultrices. Aliquam vitae volutpat ex. Suspendisse fringilla eu enim nec elementum. Curabitur lobortis hendrerit aliquet. 
  	<br>
  	<br>
  	<h5 class="mt-0">Curabitur accumsan faucibus tortor eu ullamcorper.</h5>
    <p>Donec nisi augue, convallis eu ultricies ut, semper vel lorem. Pellentesque congue magna iaculis, aliquam velit mattis, venenatis ante. Donec laoreet egestas neque vitae fermentum. Nullam sit amet erat cursus, ullamcorper sapien ut, tempus lacus. In fringilla est eu nisl lacinia aliquet. Maecenas molestie consectetur ex vel mollis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus et massa id lorem aliquam vehicula ac sit amet mauris. Aliquam eleifend risus in orci posuere vehicula. In consectetur lorem vitae tellus euismod vulputate.</p>
    <p class="mb-0">Donec sed odio dui. Nullam quis risus eget urna mollis ornare vel eu leo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.</p>
  	<br>
  	<h5 class="mt-0">Nam fermentum nunc non mauris mollis imperdiet.</h5>
  	Curabitur at magna nec nisl dapibus varius. Donec dignissim placerat urna, et sollicitudin ex molestie vitae. In tincidunt, massa maximus porttitor pellentesque, quam ex malesuada nulla, pharetra vestibulum dolor lectus vitae ipsum. Etiam nec auctor massa, sit amet interdum lacus. Vestibulum eu maximus sapien. Phasellus scelerisque imperdiet porta. Sed nisl elit, pellentesque et consectetur in, sagittis a nunc. Nullam lobortis arcu id purus elementum hendrerit. Sed id tincidunt est. Sed dictum scelerisque nisl vitae tincidunt. Curabitur rhoncus eros maximus, consectetur augue tempor, vestibulum leo. Nulla facilisi. Sed consectetur velit sit amet est tempor volutpat. 
  	<br>
  	<br>
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