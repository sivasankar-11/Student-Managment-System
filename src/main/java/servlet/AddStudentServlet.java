package servlet;

import java.io.IOException;

import dao.StudentDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

public class AddStudentServlet  extends HttpServlet{
    
    	private static final long  serialVersionUID = 1L;
    	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws  ServletException,IOException {
    		String name=request.getParameter("name");
    		String email=request.getParameter("email");
    		String course=request.getParameter("course");
    		double marks=Double.parseDouble(request.getParameter("marks"));
    		
    		Student student=new Student();
    		student.setName(name);
    		student.setEmail(email);
    		student.setCourse(course);
    		student.setMarks(marks);
    		
    		StudentDAO dao=new StudentDAO();
    		boolean status=dao.addStudent(student);
    		
    		if(status) {
    			response.sendRedirect("viewStudents");
    			
    			
    		}
    		else {
    			response.getWriter().println("student not added");
    		}
    		
    	
    }
}
