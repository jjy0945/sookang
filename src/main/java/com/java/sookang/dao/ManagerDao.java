package com.java.sookang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.sookang.dto.ProfessorDto;
import com.java.sookang.dto.StudentDto;


public class ManagerDao {

	DataSource dataSource;
	
	public ManagerDao() {
		
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void Reg(String Id, String Password, String Rnumber, String Name, String Grade, String Dept) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "insert into STUDENT (STUDENT_ID, STUDENT_PW, STUDENT_RESIDENCE_NUM, STUDENT_NAME, STUDENT_GRADE, STUDENT_DEPT) values (?, ?, ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, Id);
			preparedStatement.setString(2, Password);
			preparedStatement.setString(3, Rnumber);
			preparedStatement.setString(4, Name);
			preparedStatement.setInt(5, Integer.parseInt(Grade));
			preparedStatement.setString(6, Dept);
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
	
	public void PReg(String Id, String Password, String Name, String Date) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "insert into PROFESSOR (PROFESSOR_ID, PROFESSOR_PW, PROFESSOR_NAME, PROFESSOR_DATE) values (?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, Id);
			preparedStatement.setString(2, Password);
			preparedStatement.setString(3, Name);
			preparedStatement.setString(4, Date);
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
	
public ArrayList<StudentDto> List() {
		
		ArrayList<StudentDto> dtos = new ArrayList<StudentDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select STUDENT_ID, STUDENT_PW, STUDENT_RESIDENCE_NUM, STUDENT_NAME, STUDENT_GRADE, STUDENT_DEPT from STUDENT order by STUDENT_ID asc";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				String Id = resultSet.getString("STUDENT_ID");
				String Password = resultSet.getString("STUDENT_PW");
				String Rnumber = resultSet.getString("STUDENT_RESIDENCE_NUM");
				String Name = resultSet.getString("STUDENT_NAME");
				int Grade = resultSet.getInt("STUDENT_GRADE");
				String Dept = resultSet.getString("STUDENT_DEPT");
				
				StudentDto dto = new StudentDto(Id, Password, Rnumber, Name, Grade, Dept);
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
	
public ArrayList<ProfessorDto> pList() {
	
	ArrayList<ProfessorDto> dtos = new ArrayList<ProfessorDto>();
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	
	try {
		connection = dataSource.getConnection();
		
		String query = "select PROFESSOR_ID, PROFESSOR_PW, PROFESSOR_NAME, PROFESSOR_DATE from PROFESSOR order by PROFESSOR_ID asc";
		preparedStatement = connection.prepareStatement(query);
		resultSet = preparedStatement.executeQuery();
		
		while (resultSet.next()) {
			String Id = resultSet.getString("PROFESSOR_ID");
			String Password = resultSet.getString("PROFESSOR_PW");
			String Name = resultSet.getString("PROFESSOR_NAME");
			String Date = resultSet.getString("PROFESSOR_DATE");
			
			ProfessorDto dto = new ProfessorDto(Id, Password, Name, Date);
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
	
}