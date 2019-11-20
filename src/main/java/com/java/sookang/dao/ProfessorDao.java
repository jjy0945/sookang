package com.java.sookang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.sookang.dto.OpeningSubjectDto;
import com.java.sookang.dto.ProfessorDto;


public class ProfessorDao {

	DataSource dataSource;
	
	public ProfessorDao() {
		
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public ProfessorDto PInfoView(String Id) {
		// TODO Auto-generated method stub
		
		ProfessorDto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
	
		try {
			
			connection = dataSource.getConnection();
			
			String query = "select * from PROFESSOR where PROFESSOR_ID = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, Id);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				String PROFESSOR_ID = resultSet.getString("PROFESSOR_ID");
				String PROFESSOR_PW = resultSet.getString("PROFESSOR_PW");
				String PROFESSOR_NAME = resultSet.getString("PROFESSOR_NAME");
				String PROFESSOR_DATE = resultSet.getString("PROFESSOR_DATE");
				
				dto = new ProfessorDto(PROFESSOR_ID, PROFESSOR_PW, PROFESSOR_NAME, PROFESSOR_DATE);
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
	
	
	public void PModify(String Password, String Id) {
		// TODO Auto-generated method stub
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "update PROFESSOR set PROFESSOR_PW = ? where PROFESSOR_ID = ?";
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
	
	
	public void OSReg(String OPENING_SUBJECT_ID, String PROFESSOR_ID, String PROFESSOR_NAME, String SUBJECT_ID, String SUBJECT_NAME, 
			String LECTURE_TIME, String LECTURE_ROOM, String SCORE, String ALLOWED_PERSONNEL) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "insert into OPENING_SUBJECT (OPENING_SUBJECT_ID, PROFESSOR_ID, PROFESSOR_NAME, SUBJECT_ID, SUBJECT_NAME, "
					+ "LECTURE_TIME, LECTURE_ROOM, SCORE, ALLOWED_PERSONNEL) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(OPENING_SUBJECT_ID));
			preparedStatement.setString(2, PROFESSOR_ID);
			preparedStatement.setString(3, PROFESSOR_NAME);
			preparedStatement.setString(4, SUBJECT_ID);
			preparedStatement.setString(5, SUBJECT_NAME);
			preparedStatement.setString(6, LECTURE_TIME);
			preparedStatement.setString(7, LECTURE_ROOM);
			preparedStatement.setInt(8, Integer.parseInt(SCORE));
			preparedStatement.setInt(9, Integer.parseInt(ALLOWED_PERSONNEL));
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
	
	
	public ArrayList<OpeningSubjectDto> OSList() {
		
		ArrayList<OpeningSubjectDto> dtos = new ArrayList<OpeningSubjectDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select OPENING_SUBJECT_ID, PROFESSOR_ID, PROFESSOR_NAME, SUBJECT_ID, SUBJECT_NAME, LECTURE_TIME, LECTURE_ROOM, "
					+ "SCORE, ALLOWED_PERSONNEL from OPENING_SUBJECT";
			
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String sOPENING_SUBJECT_ID = resultSet.getString("OPENING_SUBJECT_ID");
				String sPROFESSOR_ID = resultSet.getString("PROFESSOR_ID");
				String sPROFESSOR_NAME = resultSet.getString("PROFESSOR_NAME");
				String sSUBJECT_ID = resultSet.getString("SUBJECT_ID");
				String sSUBJECT_NAME = resultSet.getString("SUBJECT_NAME");
				String sLECTURE_TIME = resultSet.getString("LECTURE_TIME");
				String sLECTURE_ROOM = resultSet.getString("LECTURE_ROOM");
				String sSCORE = resultSet.getString("SCORE");
				String sALLOWED_PERSONNEL = resultSet.getString("ALLOWED_PERSONNEL");
				
				OpeningSubjectDto dto = new OpeningSubjectDto(sOPENING_SUBJECT_ID, sPROFESSOR_ID, sPROFESSOR_NAME, sSUBJECT_ID, sSUBJECT_NAME, sLECTURE_TIME, 
						sLECTURE_ROOM, sSCORE, sALLOWED_PERSONNEL);
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
	
	public void OSDel(String sOPENING_SUBJECT_ID) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			
			connection = dataSource.getConnection();
			String query = "delete from OPENING_SUBJECT where OPENING_SUBJECT_ID = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(sOPENING_SUBJECT_ID));
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

	public void OSMod(String sLECTURE_TIME, String sLECTURE_ROOM, String sSCORE, String sALLOWED_PERSONNEL, String sOPENING_SUBJECT_ID) {
		// TODO Auto-generated method stub
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "update OPENING_SUBJECT set LECTURE_TIME = ?, LECTURE_ROOM = ?, SCORE = ?, ALLOWED_PERSONNEL = ? where OPENING_SUBJECT_ID = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, sLECTURE_TIME);
			preparedStatement.setString(2, sLECTURE_ROOM);
			preparedStatement.setInt(3, Integer.parseInt(sSCORE));
			preparedStatement.setInt(4, Integer.parseInt(sALLOWED_PERSONNEL));
			preparedStatement.setInt(5, Integer.parseInt(sOPENING_SUBJECT_ID));
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
