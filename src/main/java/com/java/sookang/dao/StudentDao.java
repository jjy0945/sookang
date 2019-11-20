package com.java.sookang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.sookang.dto.CourseApplicationDto;
import com.java.sookang.dto.StudentDto;


public class StudentDao {

	DataSource dataSource;
	
	public StudentDao() {
		
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public StudentDto SInfoView(String Id) {
		// TODO Auto-generated method stub
		
		StudentDto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
	
		try {
			
			connection = dataSource.getConnection();
			
			String query = "select * from STUDENT where STUDENT_ID = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, Id);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				String sSTUDENT_ID = resultSet.getString("STUDENT_ID");
				String sSTUDENT_PW = resultSet.getString("STUDENT_PW");
				String sSTUDENT_RESIDENCE_NUM = resultSet.getString("STUDENT_RESIDENCE_NUM");
				String sSTUDENT_NAME = resultSet.getString("STUDENT_NAME");
				int sSTUDENT_GRADE = resultSet.getInt("STUDENT_GRADE");
				String sSTUDENT_DEPT = resultSet.getString("STUDENT_DEPT");
				
				dto = new StudentDto(sSTUDENT_ID, sSTUDENT_PW, sSTUDENT_RESIDENCE_NUM, sSTUDENT_NAME, sSTUDENT_GRADE, sSTUDENT_DEPT);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return dto;
	}
	
	public void SModify(String Password, String Id) {
		// TODO Auto-generated method stub
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "update STUDENT set STUDENT_PW = ? where STUDENT_ID = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, Password);
			preparedStatement.setString(2, Id);
			preparedStatement.executeUpdate();
			
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
	}
	
	public void OSSignUp(String sId, String sOPENING_SUBJECT_ID, String sSUBJECT_ID, String sSUBJECT_NAME, String sPROFESSOR_NAME, String sLECTURE_TIME, String sLECTURE_ROOM, String sSCORE) {
		// TODO Auto-generated method stub
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "insert into COURSE_APPLICATION_DETAILS(STUDENT_ID, OPENING_SUBJECT_ID, SUBJECT_ID, SUBJECT_NAME, PROFESSOR_NAME, LECTURE_TIME, LECTURE_ROOM, SCORE) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, sId);
			preparedStatement.setInt(2, Integer.parseInt(sOPENING_SUBJECT_ID));
			preparedStatement.setString(3, sSUBJECT_ID);
			preparedStatement.setString(4, sSUBJECT_NAME);
			preparedStatement.setString(5, sPROFESSOR_NAME);
			preparedStatement.setString(6, sLECTURE_TIME);
			preparedStatement.setString(7, sLECTURE_ROOM);
			preparedStatement.setInt(8, Integer.parseInt(sSCORE));
			preparedStatement.executeUpdate();
			
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
	}
	
	public ArrayList<CourseApplicationDto> CADList() {
		
		ArrayList<CourseApplicationDto> dtos = new ArrayList<CourseApplicationDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select STUDENT_ID, OPENING_SUBJECT_ID, SUBJECT_ID, SUBJECT_NAME, PROFESSOR_NAME, LECTURE_TIME, "
					+ "LECTURE_ROOM, SCORE from COURSE_APPLICATION_DETAILS";
			
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String sSTUDENT_ID = resultSet.getString("STUDENT_ID");
				String sOPENING_SUBJECT_ID = resultSet.getString("OPENING_SUBJECT_ID");
				String sSUBJECT_ID = resultSet.getString("SUBJECT_ID");
				String sSUBJECT_NAME = resultSet.getString("SUBJECT_NAME");
				String sPROFESSOR_NAME = resultSet.getString("PROFESSOR_NAME");
				String sLECTURE_TIME = resultSet.getString("LECTURE_TIME");
				String sLECTURE_ROOM = resultSet.getString("LECTURE_ROOM");
				String sSCORE = resultSet.getString("SCORE");
				
				CourseApplicationDto dto = new CourseApplicationDto(sSTUDENT_ID, sOPENING_SUBJECT_ID, sSUBJECT_ID, sSUBJECT_NAME, sPROFESSOR_NAME, sLECTURE_TIME, 
						sLECTURE_ROOM, sSCORE);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return dtos;
	}

	public void CADDel(String sSTUDENT_ID, String sOPENING_SUBJECT_ID) {
	// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
		
			connection = dataSource.getConnection();
			String query = "delete from COURSE_APPLICATION_DETAILS where STUDENT_ID = ? and OPENING_SUBJECT_ID = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, sSTUDENT_ID);
			preparedStatement.setInt(2, Integer.parseInt(sOPENING_SUBJECT_ID));
			preparedStatement.executeUpdate();
		
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
	}
	
}
