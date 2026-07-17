<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List" %>
    <%@page import="model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Students</title>

</head>

<body>
<h2 align="center"> Student List</h2>
<table border="1" align="center">
<tr>
  <th>ID</th>
  <th>NAME</th>
  <th>Email</th>
  <th>Course</th>
  <th>Marks</th>
  <th>Edit</th>
  <th>Delete</th>
  </tr>
  <%
  List<Student> list=(List<Student>)request.getAttribute("studentList");
    for(Student s:list){
    	
    
  %>
  <tr>
  <td><%=s.getId() %></td>
  <td><%=s.getName() %></td>
  <td><%=s.getEmail() %></td>
  <td><%=s.getCourse() %></td>
  <td><%=s.getMarks() %></td>
  <td><a href="editStudent.jsp?id=<%=s.getId() %>">Edit</a></td>
  <td><a href="deleteStudent?id="<%=s.getId()%>">delete</a></td>
  </tr>
  <% 
  }%>
</table>

</body>
</html>