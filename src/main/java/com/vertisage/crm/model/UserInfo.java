package com.vertisage.crm.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInfo {

	@JsonProperty("USERNAME")
	private String userName;
	private String fullName;
	
	public UserInfo() {
		
	}
	public UserInfo(String userName,String fullName) {
		
		this.userName=userName;
		this.fullName=fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
}
