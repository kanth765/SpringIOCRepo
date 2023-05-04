package com.ciq.pojo;

public class GreetingMessage {

	private int id;
	private String message;

	public GreetingMessage() {
		// TODO Auto-generated constructor stub
	}

	public GreetingMessage(int id) {
		this.id = id;
	}
	public GreetingMessage(int id, String message) {
		this.id = id;
		this.message = message;
	}

	public GreetingMessage(String message, int id) {
		this.id = id;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "GreetingMessage [id=" + id + ", message=" + message + "]";
	}

}
