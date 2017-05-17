package com.divya.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.divya.dao.StudentDAOImpl;
import com.divya.pojos.Student;

public class AddStudentDemo {
	public static void main(String[] args) {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter Student Id : ");
	try {
	int a=Integer.parseInt(br.readLine());
	
	System.out.println("Enter Student Name : ");
	String b=br.readLine();
	
	System.out.println("Enter Student Course : ");
	String c=br.readLine();
	
	Student stud=new Student(a,b,c);
	
	StudentDAOImpl obj=new StudentDAOImpl();
	System.out.println(obj.addStudent(stud));
	
	
	} 
	catch (Exception e) {
		e.printStackTrace();
	} 
	
	}

}
