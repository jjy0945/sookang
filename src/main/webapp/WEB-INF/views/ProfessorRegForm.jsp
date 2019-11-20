<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<title>UserLogin</title>
	<link rel="stylesheet" href="resources/styles/Rcustom.css">
</head>
<body>

<div class="studentreg-form">
	<form action="ProfessorReg" method="POST">
		<h2 class="text-center">교수등록 폼</h2>	
		
		<hr>
		
  		<div class="form-group">
    		<label for="Id">아이디</label>
    		<input type="text" class="form-control" id="Id" name="Id" placeholder="Id">
  		</div>
  		<div class="form-group">
    		<label for="Password">비밀번호</label>
    		<input type="password" class="form-control" id="Password" name="Password" placeholder="Password">
  		</div>
  		<div class="form-group">
    		<label for="Name">이름</label>
    		<input type="text" class="form-control" id="Name" name="Name" placeholder="Name">
  		</div>
 		<div class="form-group">
    		<label for="Date">임용일</label>
    		<input type="text" class="form-control" id="Date" name="Date" placeholder="Date">
 		</div>
  
  		<hr>
  
		<button type="submit" class="btn btn-primary">등록하기</button>

	</form>
</div>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>