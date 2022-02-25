package org.ex.homework.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.ex.homework.db.ConnectionDB;

public class MemberDao {
	public static final String LOGIN = "SELECT * FROM USER WHERE ID = ? & pwd = ?";
	public static Connection conn = null;
	public static ResultSet rs = null;
	public static Statement stmt = null;
	public static PreparedStatement pstmt = null;
	
	
	
	public void init() {
		
	}
	
	public void login(MemberDto dto) {
		MemberDto member = null;
		conn = ConnectionDB.getConnection();
		try {
			pstmt = conn.prepareStatement(LOGIN);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				String id = rs.getString(3);
				String pw = rs.getString(4);
				String email = rs.getString(5);

				member = new MemberDto(no, name, id, pw, email);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
