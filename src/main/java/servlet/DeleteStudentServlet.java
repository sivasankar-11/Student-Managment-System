package servlet;

import java.io.IOException;

import dao.StudentDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID=1L;
      
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		StudentDAO dao= new StudentDAO();
		
		dao.deleteStudent(id);
		response.sendRedirect("viewstudents");
		
		
	}
}
