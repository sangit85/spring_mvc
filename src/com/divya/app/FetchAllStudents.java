package com.divya.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import com.divya.dao.StudentDAOImpl;
import com.divya.pojos.Student;

public class FetchAllStudents {
	public static void main(String[] args) {
	try {
	StudentDAOImpl obj=new StudentDAOImpl();
	List<Student> list=obj.getAllStudents();
	for(Student s:list){
		System.out.println(s);
	}
	
	
	} 
	catch (Exception e) {
		e.printStackTrace();
	} 
	
	}

}
