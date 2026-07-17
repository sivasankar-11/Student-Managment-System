package servlet;

import java.io.IOException;


import dao.StudentDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/updatestudent")
public class UpdateStudentServlet extends HttpServlet{
	private static final long serialVersionUID=1L;
		protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String course =request.getParameter("course");
		double marks=Double.parseDouble(request.getParameter("marks"));
		
		
		Student student=new Student();
		student.setId(id);
		student.setName(name);
		student.setEmail(email);
		student.setCourse(course);
		student.setMarks(marks);
		
		StudentDAO dao=new StudentDAO();
		dao.updateStudent(student);
		response.sendRedirect("viewstudents");
		
		
				
	}

}
