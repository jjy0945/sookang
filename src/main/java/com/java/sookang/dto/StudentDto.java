package com.java.sookang.dto;

public class StudentDto {

	String sId;
	String sPassword;
	String sRnumber;
	String sName;
	int sGrade;
	String sDept;
	
	public StudentDto() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentDto(String sId, String sPassword, String sRnumber, String sName, int sGrade, String sDept) {
		// TODO Auto-generated constructor stub
		this.sId = sId;
		this.sPassword = sPassword;
		this.sRnumber = sRnumber;
		this.sName = sName;
		this.sGrade = sGrade;
		this.sDept = sDept;
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

	public String getsRnumber() {
		return sRnumber;
	}

	public void setsRnumber(String sRnumber) {
		this.sRnumber = sRnumber;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsGrade() {
		return sGrade;
	}

	public void setsGrade(int sGrade) {
		this.sGrade = sGrade;
	}

	public String getsDept() {
		return sDept;
	}

	public void setsDept(String sDept) {
		this.sDept = sDept;
	}

}
