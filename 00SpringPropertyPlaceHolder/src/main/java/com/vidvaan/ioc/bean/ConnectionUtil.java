package com.vidvaan.ioc.bean;

public class ConnectionUtil {

	private String url;
	private String driver;
	private String username;
	private String password;

	public void setUrl(String url) {
		this.url = url;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void getConnection() {
		System.out.println("Url : " + url);
		System.out.println("Driver : " + driver);
		System.out.println("Username : " + username);
		System.out.println("Password : " + password);
	}

}
