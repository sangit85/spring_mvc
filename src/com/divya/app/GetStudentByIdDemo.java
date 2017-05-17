package com.divya.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.divya.dao.StudentDAOImpl;
import com.divya.pojos.Student;

public class GetStudentByIdDemo {
	public static void main(String[] args) {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter Student Id that U want to Search: ");
	try {
	int a=Integer.parseInt(br.readLine());
	
	
	StudentDAOImpl obj=new StudentDAOImpl();
	Student stud=obj.getStudentById(a);
	if(stud==null){
		System.out.println("Student having id : "+a+" doesnt exist");
	}
	else {
		System.out.println(stud);
	}
	
	
	} 
	catch (Exception e) {
		e.printStackTrace();
	} 
	
	}

}
