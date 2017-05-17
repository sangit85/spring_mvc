package com.divya.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.divya.dao.StudentDAOImpl;
import com.divya.pojos.Student;

public class DeleteStudentDemo {
	public static void main(String[] args) {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter Student Id that u want to delete : ");
	try {
	int a=Integer.parseInt(br.readLine());
	
	StudentDAOImpl obj=new StudentDAOImpl();
	System.out.println(obj.deleteStudent(a));
	
	
	} 
	catch (Exception e) {
		e.printStackTrace();
	} 
	
	}

}
