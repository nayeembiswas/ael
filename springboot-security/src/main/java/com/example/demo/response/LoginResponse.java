package com.example.demo.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {

	public String token;
	public Integer id;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "LoginResponse [token=" + token + ", id=" + id + "]";
	}
	public LoginResponse(String token, Integer id) {
		this.token = token;
		this.id = id;
	}

	
	
	
}
