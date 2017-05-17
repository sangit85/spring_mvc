package com.divya.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.divya.dao.StudentDAOImpl;
import com.divya.pojos.Student;

public class UpdateStudentDemo {
	public static void main(String[] args) {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter Id of Student that U want to update: ");
	try {
	int a=Integer.parseInt(br.readLine());
	
	
	System.out.println("Enter New Course : ");
	String b=br.readLine();
	
	
	
	StudentDAOImpl obj=new StudentDAOImpl();
	System.out.println(obj.updateStudent(b, a));
	
	
	} 
	catch (Exception e) {
		e.printStackTrace();
	} 
	
	}

}
