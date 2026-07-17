<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="dao.StudentDAO" %>
    <%@ page import="model.Student"%>
    
    <%
    int id=Integer.parseInt(request.getParameter("id"));
    StudentDAO dao=new StudentDAO();
    Student student=dao.getStudentById(id);%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert  </title>
</head>
<body>
<h2 align="ceneter">Update Student</h2>
<form action="updateStudent" method="post">
<input type="hidden" name="id" vaue="<%=student.getId() %>">
<table align="center">
<tr>
<td>Name</td>
<td>
<input type="text" name="name" value="<%=student.getName() %>">
</td>
</tr>
<tr>
<td>Email</td>
<td>
<input type="email" name="email" value="<%=student.getEmail() %>">
</td>
</tr>
<tr>
<td>Course</td>
<td>
<input type="text" name="course" value="<%=student.getCourse() %>">
</td>
</tr>
<tr>
<td>Marks</td>
<td>
<input type="number" name="marks" step="0.01" value="<%=student.getMarks() %>">
</td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="Update">
</td>
</tr>

</table>
</form>

</body>
</html>