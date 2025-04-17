package Lab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import Example.jdbc.Department;
import Example.jdbc.jdbcDao;
import Example.jdbc.jdbcUtils;

public class StudentDao implements jdbcDao<Student, Integer>{

	@Override
	public Collection<Student> getAll() {
		// TODO Auto-generated method stub
		Collection<Student>allStudents=new ArrayList<Student>();
		try(
				Connection dbConection=jdbcUtils.buildConnection();
				Statement stmt=dbConection.createStatement();
				ResultSet rs =stmt.executeQuery("select * from student")
						)
		{
			while(rs.next())
			{
				int rollno=rs.getInt(1);
				String name=rs.getString(2);
				String city=rs.getString(3);
				Student students=new Student( rollno,name,city);
				allStudents.add(students);
			}	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			return allStudents ;
 
	}

	@Override
	public Student getone(Integer rollno) {
		// TODO Auto-generated method stub
		Student foundstudent=null;
		String sqlQuery="select * from student  where rollno=?";
		try(
				Connection dbconnection =jdbcUtils.buildConnection();
				PreparedStatement pstmt= dbconnection.prepareStatement(sqlQuery);
				)
		{
			pstmt.setInt(1,rollno);
			ResultSet rs= pstmt.executeQuery();
			if(rs.next())
			{
				int rollNo=rs.getInt(1);
				String name=rs.getString(2);
				String city=rs.getString(3);
				 foundstudent=new Student(rollno,name,city);
				 
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return  foundstudent;
		
	}

	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		String sqlQurey ="insert into student values(?,?,?)";
		try(
				Connection dbconnection =jdbcUtils.buildConnection();
				PreparedStatement pstmt= dbconnection.prepareStatement(sqlQurey);
				){
			int rollno=student.getRollno();
			String name=student.getName();
			String city=student.getCity();
			
			pstmt.setInt(1,rollno);
			pstmt.setString(2, name);
			pstmt.setString(3, city);
			
			int updateCount=pstmt.executeUpdate();
			System.out.println(updateCount+"record instered");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void update(Student K) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer key) {
		// TODO Auto-generated method stub
		
	}

}
