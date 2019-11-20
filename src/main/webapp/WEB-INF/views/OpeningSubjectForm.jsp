<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<title>UserLogin</title>
	<link rel="stylesheet" href="resources/styles/Scustom.css">
</head>
<body>

<div class="studentreg-form">
	<form action="OpeningSubjectReg" method="POST">
		<h2 class="text-center">강의개설 폼</h2>	
		
		<hr>
		<div class="form-row">
  			<div class="form-group col-md-4">
    			<label for="OPENING_SUBJECT_ID">개설과목 아이디</label>
    			<input type="text" class="form-control" id="OPENING_SUBJECT_ID" name="OPENING_SUBJECT_ID" placeholder="OPENING_SUBJECT_ID">
  			</div>
  			<div class="form-group col-md-4">
    			<label for="PROFESSOR_ID">교수 아이디</label>
    			<input type="text" class="form-control" id="PROFESSOR_ID" name="PROFESSOR_ID" placeholder="PROFESSOR_ID">
  			</div>
  			<div class="form-group col-md-4">
    			<label for="PROFESSOR_NAME">교수 이름</label>
    			<input type="text" class="form-control" id="PROFESSOR_NAME" name="PROFESSOR_NAME" placeholder="PROFESSOR_NAME">
 			</div>
 		</div>
 		<div class="form-row">
 			<div class="form-group col-md-4"">
    			<label for="SUBJECT_ID">과목 아이디</label>
    			<input type="text" class="form-control" id="SUBJECT_ID" name="SUBJECT_ID" placeholder="SUBJECT_ID">
 			</div>
 			<div class="form-group col-md-4"">
    			<label for="SUBJECT_NAME">과목 이름</label>
    			<input type="text" class="form-control" id="SUBJECT_NAME" name="SUBJECT_NAME" placeholder="SUBJECT_NAME">
 			</div>
 			<div class="form-group col-md-4"">
    			<label for="LECTURE_TIME">강의 시간</label>
    			<input type="text" class="form-control" id="LECTURE_TIME" name="LECTURE_TIME" placeholder="LECTURE_TIME">
 			</div>
 		</div>
 		<div class="form-row">
 			<div class="form-group col-md-4">
    			<label for="LECTURE_ROOM">강의실</label>
    			<input type="text" class="form-control" id="LECTURE_ROOM" name="LECTURE_ROOM" placeholder="LECTURE_ROOM">
 			</div>
 			<div class="form-group col-md-4">
    			<label for="SCORE">학점</label>
    			<input type="text" class="form-control" id="SCORE" name="SCORE" placeholder="SCORE">
 			</div>
 			<div class="form-group col-md-4">
    			<label for="ALLOWED_PERSONNEL">허용인원</label>
    			<input type="text" class="form-control" id="ALLOWED_PERSONNEL" name="ALLOWED_PERSONNEL" placeholder="ALLOWED_PERSONNEL">
 			</div>
 		 </div>
  		<hr>
  
		<button type="submit" class="btn btn-primary">개설하기</button>

	</form>
</div>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>