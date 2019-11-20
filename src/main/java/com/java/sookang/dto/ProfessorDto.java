package com.java.sookang.dto;

public class ProfessorDto {

	String sId;
	String sPassword;
	String sName;
	String sDate;
	
	public ProfessorDto() {
		// TODO Auto-generated constructor stub
	}
	
	public ProfessorDto(String sId, String sPassword, String sName, String sDate) {
		// TODO Auto-generated constructor stub
		this.sId = sId;
		this.sPassword = sPassword;
		this.sName = sName;
		this.sDate = sDate;
	}

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsDate() {
		return sDate;
	}

	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	
}