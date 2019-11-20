package com.java.sookang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class LCDao {

	DataSource dataSource;
	
	public LCDao() {
		
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public int LoginCheck(String InlineRadioOptions, String Id, String Password) {
		// TODO Auto-generated method stub
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		
		try {
			connection = dataSource.getConnection();
			
			if(InlineRadioOptions.equals("option1")) {
				String query = "select * from STUDENT where STUDENT_ID = ? and STUDENT_PW = ?"; 
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, Id);
				preparedStatement.setString(2, Password);
				rs = preparedStatement.executeQuery();
				if(rs.next()) {
					return 1;
				}
			
			} else if(InlineRadioOptions.equals("option2")) {
				String query = "select * from PROFESSOR where PROFESSOR_ID = ? and PROFESSOR_PW = ?"; 
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, Id);
				preparedStatement.setString(2, Password);
				rs = preparedStatement.executeQuery();
				if(rs.next()) {
					return 2;
				}
	
			} else if(InlineRadioOptions.equals("option3")){
				String query = "select * from MANAGER where MANAGER_ID = ? and MANAGER_PW = ?"; 
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, Id);
				preparedStatement.setString(2, Password);
				rs = preparedStatement.executeQuery();
				if(rs.next()) {
					return 3;
				}
				
			} else {
				
				return 0;
			}
			 
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		return 0;
	}
	
}
