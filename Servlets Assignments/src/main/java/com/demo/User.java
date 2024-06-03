package com.demo;
public class User {
    private String username;
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return usertype;
	}
	public void setUserType(String userType) {
		this.usertype = userType;
	}
	private String password;
    private String usertype;
	public User() {
		super();
	}
	public User(String username, String password, String userType) {
		super();
		this.username = username;
		this.password = password;
		this.usertype = userType;
	}

    
}
