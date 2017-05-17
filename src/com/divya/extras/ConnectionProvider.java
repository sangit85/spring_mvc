package com.divya.extras;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	private static Connection conn=null;
	
	private ConnectionProvider(){
		
	}
	
	public static Connection getConn() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","divya","divya123");
		return conn;
	}
}
