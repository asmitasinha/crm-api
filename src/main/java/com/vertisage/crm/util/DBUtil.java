package com.vertisage.crm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vertisage.crm.model.UserInfo;

public class DBUtil {

	public static Connection getConnection() throws SQLException {
		
		Connection con =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/crmdb","root","Krrish02");  
		if(con !=null && con.isClosed()==false) {
			System.out.println("Connected");
		}
			
		return con;
	}
	
	public static List<UserInfo> getUserInfo() throws SQLException {
		Connection con=getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs= stmt.executeQuery("select * from user");
		ArrayList<UserInfo> userList= new ArrayList<UserInfo>();
		
		while(rs.next()) {
		
			UserInfo userInfo=new UserInfo(rs.getString("userName"),rs.getString("fullName"));
			userList.add(userInfo);
			System.out.println("Full Name: "+rs.getString("fullName"));	
		
		}
		
		return userList;

	}
	public static void main(String []args) {
		try {
			List<UserInfo> userList=getUserInfo();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
