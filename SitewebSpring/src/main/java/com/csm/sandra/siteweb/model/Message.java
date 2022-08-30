package com.csm.sandra.siteweb.model;

import java.time.LocalDateTime;

public class Message {
	
	private String autor; 
	private LocalDateTime timeStamp; 
	private String message;
	
	public Message(String autor, String message) {
		super();
		this.autor = autor;
		this.timeStamp = LocalDateTime.now();
		this.message = message;
	}
	

	public Message() {
	
	}


	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	

}
