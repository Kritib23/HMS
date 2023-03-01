package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	
	private static Connection conn;
	
	public static Connection getConn()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://10.5.18.71/20CS30028","20CS30028","20CS30028");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
