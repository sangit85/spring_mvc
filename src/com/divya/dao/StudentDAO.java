package com.divya.dao;

import java.sql.SQLException;
import java.util.List;

import com.divya.pojos.Student;

public interface StudentDAO {
	
	public String addStudent(Student stud) throws ClassNotFoundException, SQLException ;
	public String deleteStudent(int id) throws ClassNotFoundException, SQLException ;
	public String updateStudent(String c,int id) throws ClassNotFoundException, SQLException ;
	public Student getStudentById(int id) throws ClassNotFoundException, SQLException ;
	public List<Student> getAllStudents() throws ClassNotFoundException, SQLException;

}
