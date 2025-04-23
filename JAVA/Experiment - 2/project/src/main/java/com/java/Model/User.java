package com.java.Model;

public abstract class User {
	
	private String userID;
	private String Name;
	private Boolean isDelete;
	private String password;
	
	

	public void setPassword(String password) {
		this.password = password;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}
	

	
	User(String userID, String name,String password){
		this.userID = userID;
		this.Name = name;
		this.password = password;
		this.isDelete = false;
		
	}
	
	
	public Boolean getIsDelete() {
		return isDelete;
	}

	public String getPassword() {
		return password;
	}
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", Name=" + Name + ", isDelete=" + isDelete + ", password=" + password + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}



	
	
	

	abstract String printRole();
	abstract void displayInfo();
	
	

}
