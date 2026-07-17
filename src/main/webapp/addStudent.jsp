<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Add Students</h2>
<form action="addStudent method="post">
   
   <table align="center">
   <tr>
   <td>Name</td>
   <td><input type="text" name="name"></td>
   </tr>
   <tr>
   <td>Email</td>
   <td><input type="email" name="email"></td>
   </tr>
   <tr>
   <td>Courses</td>
   <td><input type="text" name="course"></td>
   </tr>
   <tr>
   <td>Marks</td>
   <td><input type="number" step="0.01" name="marks"></td>
   </tr>
   <tr>
   <td colspan=2 align="center">
   <td><input type="submit" value="savestudents"></td>
   </tr>
   </table>
</form>

</body>
</html>