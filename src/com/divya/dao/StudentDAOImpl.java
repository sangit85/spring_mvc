package com.divya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.divya.extras.ConnectionProvider;
import com.divya.pojos.Student;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public String addStudent(Student stud) throws ClassNotFoundException, SQLException  {
		Connection conn=ConnectionProvider.getConn();	
		PreparedStatement ps=conn.prepareStatement("insert into Stud_table values(?,?,?)");
		ps.setInt(1,stud.getStudId());
		ps.setString(2,stud.getStudName());
		ps.setString(3,stud.getCourse());
		int i=ps.executeUpdate();
		if(i!=0){
			return "Record Inserted Succesfully";
		}
		else {
			return "Problem in Inserting Record";
		}
		
	}

	@Override
	public String deleteStudent(int id) throws ClassNotFoundException,SQLException {
		Connection conn=ConnectionProvider.getConn();
		PreparedStatement ps=conn.prepareStatement("delete from Stud_table where sid=?");
		ps.setInt(1,id);
		int i=ps.executeUpdate();
		if(i!=0){
			return "Record Deleted Succesfully";
		}
		else{
		return "Record having Id : "+id+" doesnt exist";
		}
	}

	@Override
	public String updateStudent(String c, int id)throws ClassNotFoundException, SQLException  {
		Connection conn=ConnectionProvider.getConn();
		PreparedStatement ps=conn.prepareStatement("update Stud_table set scourse=? where sid=?");
		ps.setString(1,c);
		ps.setInt(2,id);
		int i=ps.executeUpdate();
		if(i!=0){
			return "Record Updated Succesfully";
		}
		else{
		return "Record having Id : "+id+" doesnt exist";
		}
		
	}

	@Override
	public Student getStudentById(int id) throws ClassNotFoundException, SQLException {
		Connection conn=ConnectionProvider.getConn();
		PreparedStatement ps=conn.prepareStatement("select * from stud_table where sid=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			int idd=rs.getInt(1);
			String n=rs.getString(2);
			String c=rs.getString(3);
			Student s=new Student(idd,n,c);
			return s;
		}
		else {
			return null;
		}
	}

	List<Student> studList=new ArrayList<>();
	@Override
	public List<Student> getAllStudents() throws ClassNotFoundException, SQLException {
		Connection conn=ConnectionProvider.getConn();
		PreparedStatement ps=conn.prepareStatement("select * from stud_table");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			int idd=rs.getInt(1);
			String n=rs.getString(2);
			String c=rs.getString(3);
			Student s=new Student(idd,n,c);
			studList.add(s);
		}
		
		return studList;
	}

}
