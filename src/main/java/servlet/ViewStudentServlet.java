package servlet;

import java.io.IOException;
import java.util.List;

import dao.StudentDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/viewstudents")
public class ViewStudentServlet extends HttpServlet{
	private static final long serialVersionUID=1L;
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		StudentDAO dao= new StudentDAO();
		List<Student> list=dao.getAllStudents();
		request.setAttribute("studentList", list);
		request.getRequestDispatcher("ViewStudents.jsp").forward(request, response);
		
		
		
		
	}
	

}
