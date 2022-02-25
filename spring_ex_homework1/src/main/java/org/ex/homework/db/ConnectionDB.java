package org.ex.homework.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	public static Connection getConnection() {
		try {
			Class.forName("org.h2.Driver");
			return DriverManager.getConnection("jdbc:h2:tcp://localhost/D:\\spring_workspace\\db\\stsEx1","sa","");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not Found...");
		} catch (SQLException e) {
			System.out.println("SQL exeption ...");
		}
		return null;
	}
	
	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
