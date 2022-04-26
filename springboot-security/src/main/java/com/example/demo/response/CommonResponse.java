package com.example.demo.response;

import java.io.Serializable;


import lombok.Data;


@Data
public class CommonResponse implements Serializable{
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageBn() {
		return messageBn;
	}

	public void setMessageBn(String messageBn) {
		this.messageBn = messageBn;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

	private boolean status;
	
	private String message;
	
	private String messageBn;
	
	private Object data;
	
	
	
	
}
