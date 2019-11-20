package com.java.sookang.dto;

public class LCDto {

	String InlineRadioOptions;
	String Id;
	String Password;
	
	public LCDto() {
		// TODO Auto-generated constructor stub
	}
	
	public LCDto(String inlineRadioOptions, String Id, String Password) {
		// TODO Auto-generated constructor stub
		this.InlineRadioOptions = inlineRadioOptions;
		this.Id = Id;
		this.Password = Password;
	}

	public String getInlineRadioOptions() {
		return InlineRadioOptions;
	}

	public void setInlineRadioOptions(String inlineRadioOptions) {
		InlineRadioOptions = inlineRadioOptions;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
}