<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Tutorial</title>
</head>
<body>
	<h1>Welcome to Spring MVC Course</h1>
	<p>
	Spring boot makes project creation easier <br><br>
	Spring boot is the most common framework in the market
	</p>	
	<!--  <h1>Get two integers from the user</h1>
	<form action="add">
		Enter first integer: <input type="text" name="n1">
		<br><br>
		Enter second integer: <input type="text" name="n2">
		<br> <br>
		<input type="submit">
	</form> -->
	
<!--	<h1>Add Student</h1>
	<form action="addStudent" method="post">
		Enter student's id: <input type="text" name="id">
		<br><br>
		Enter student's name: <input type="text" name="name">
		<br><br>
		<input type="submit">
	</form>   -->
	
	<!--<h1>Get All Students</h1>
	<form action="getStudent" method="get">
		Enter student's id: <input type="text" name="id">
		<br><br>
		Enter student's name: <input type="text" name="name">
		<br><br>
		<input type="submit">
	</form>   -->
	
	<h1>Get spesific student by using the id</h1>
	<form action="getStudentWithId" method="get">
		Enter student id to get the information: <input type="text" name="id"> <br> <br>
		<input type="submit">
	</form>
	
</body>
</html>