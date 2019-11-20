package com.java.sookang.dto;

public class CourseApplicationDto {

	String sSTUDENT_ID;
	String sOPENING_SUBJECT_ID;
	String sSUBJECT_ID;
	String sSUBJECT_NAME;
	String sPROFESSOR_NAME;
	String sLECTURE_TIME;
	String sLECTURE_ROOM;
	String sSCORE;
	
	public CourseApplicationDto() {
		// TODO Auto-generated constructor stub
	}
	
	public CourseApplicationDto(String sSTUDENT_ID, String sOPENING_SUBJECT_ID, String sSUBJECT_ID, String sSUBJECT_NAME, String sPROFESSOR_NAME, 
			String sLECTURE_TIME, String sLECTURE_ROOM, String sSCORE) {
		// TODO Auto-generated constructor stub
		this.sSTUDENT_ID = sSTUDENT_ID;
		this.sOPENING_SUBJECT_ID = sOPENING_SUBJECT_ID;
		this.sSUBJECT_ID = sSUBJECT_ID;
		this.sSUBJECT_NAME = sSUBJECT_NAME;
		this.sPROFESSOR_NAME = sPROFESSOR_NAME;
		this.sLECTURE_TIME = sLECTURE_TIME;
		this.sLECTURE_ROOM = sLECTURE_ROOM;
		this.sSCORE = sSCORE;
		
	}

	public String getsSTUDENT_ID() {
		return sSTUDENT_ID;
	}

	public void setsSTUDENT_ID(String sSTUDENT_ID) {
		this.sSTUDENT_ID = sSTUDENT_ID;
	}

	public String getsOPENING_SUBJECT_ID() {
		return sOPENING_SUBJECT_ID;
	}

	public void setsOPENING_SUBJECT_ID(String sOPENING_SUBJECT_ID) {
		this.sOPENING_SUBJECT_ID = sOPENING_SUBJECT_ID;
	}

	public String getsSUBJECT_ID() {
		return sSUBJECT_ID;
	}

	public void setsSUBJECT_ID(String sSUBJECT_ID) {
		this.sSUBJECT_ID = sSUBJECT_ID;
	}

	public String getsSUBJECT_NAME() {
		return sSUBJECT_NAME;
	}

	public void setsSUBJECT_NAME(String sSUBJECT_NAME) {
		this.sSUBJECT_NAME = sSUBJECT_NAME;
	}

	public String getsPROFESSOR_NAME() {
		return sPROFESSOR_NAME;
	}

	public void setsPROFESSOR_NAME(String sPROFESSOR_NAME) {
		this.sPROFESSOR_NAME = sPROFESSOR_NAME;
	}

	public String getsLECTURE_TIME() {
		return sLECTURE_TIME;
	}

	public void setsLECTURE_TIME(String sLECTURE_TIME) {
		this.sLECTURE_TIME = sLECTURE_TIME;
	}

	public String getsLECTURE_ROOM() {
		return sLECTURE_ROOM;
	}

	public void setsLECTURE_ROOM(String sLECTURE_ROOM) {
		this.sLECTURE_ROOM = sLECTURE_ROOM;
	}

	public String getsSCORE() {
		return sSCORE;
	}

	public void setsSCORE(String sSCORE) {
		this.sSCORE = sSCORE;
	}
}
