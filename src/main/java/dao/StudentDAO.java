package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.DBConnection;
import model.Student;

public class StudentDAO {

	public boolean addStudent(Student student) {
	 boolean status=false;
	try {
		Connection con=DBConnection.getConnection();
		
		String sql="INSERT INTO student(name,email,course,marks)VALUES(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, student.getName());
		ps.setString(2, student.getEmail());
		ps.setString(3,student.getCourse());
		ps.setDouble(4, student.getMarks());
		
		int rows= ps.executeUpdate();
		if(rows>0) {
			status=true;
			
			
		}
		ps.close();
		con.close();
	}catch(Exception e) {
		e.printStackTrace();
		
		
	}
	return status;
	
		
	}
	public List<Student> getAllStudents()
	{
		List<Student> list= new ArrayList<>();
		try {
			Connection con=DBConnection.getConnection();
			String sql="SELECT * FROM student";
			
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Student student=new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setEmail(rs.getString("email"));
				student.setCourse(rs.getString("course"));
				student.setMarks(rs.getDouble("marks"));
				list.add(student);
				
				
			}
			rs.close();
			ps.close();
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	public Student getStudentById(int id) {
		Student student=null;
		try {
			Connection con=DBConnection.getConnection();
			String sql="SELECT * FROM student WHERE id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				student=new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setEmail(rs.getString("email"));
				student.setCourse(rs.getString("course"));
				student.setMarks(rs.getDouble("marks"));
			}
			rs.close();
			ps.close();
			con.close(); 
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		  return student;
	}
	public boolean updateStudent(Student student) {
		boolean status=false;
		try {
			Connection con=DBConnection.getConnection();
			String sql="UPDATE student SET name=?,email=?,course=?,marks=?,WHERE id=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,student.getName());
			ps.setString(2, student.getCourse());
			ps.setString(3, student.getEmail());
			ps.setDouble(4, student.getMarks());
			ps.setInt(5, student.getId());
			
			
			int rows=ps.executeUpdate();
			if(rows>0) {
				status=true;
			}
			ps.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		} return status;
	}
		
		public boolean deleteStudent(int id) {
			boolean status=false;
			try {
				Connection con=DBConnection.getConnection();
				String sql="DELETE FROM student WHERE id=?";
				
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, id);
				int rows=ps.executeUpdate();
				if(rows>0)
				{
					status=true;
				
				
			}
				ps.close();
				con.close();
		}catch(Exception e)
			{
			  e.printStackTrace();
			}
			return status;
	}
		 {
			// TODO Auto-generated method stub
			
		}
}
