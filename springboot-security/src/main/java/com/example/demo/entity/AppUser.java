package com.example.demo.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Data;


@Data
@Entity
@Table(name = "APP_USER")
public class AppUser implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;

	@Column(name = "ACTIVE", columnDefinition = "boolean default true")
	private Boolean active = true;

	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(AppUser.class);
	
	@Column(name = "USERNAME", length=50, nullable = false, unique = true)
	private String username;
	
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	@Column(name = "EMAIL", length=100)
	private String email;
	
	@Column(name = "MOBILE", length=20)
	private String mobile;


	@Column(name = "IS_ACCOUNT_EXPIRED", columnDefinition = "boolean default false")
	private Boolean accountExpired = false;

	@Column(name = "IS_CREDENTIALS_EXPIRED", columnDefinition = "boolean default false")
	private Boolean credentialsExpired = false;

	@Column(name = "IS_ACCOUNT_LOCKED", columnDefinition = "boolean default false")
	private Boolean accountLocked = false;

	public AppUser(Integer id, Boolean active, String username, String password, String email, String mobile,
			Boolean accountExpired, Boolean credentialsExpired, Boolean accountLocked) {
		this.id = id;
		this.active = active;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.accountExpired = accountExpired;
		this.credentialsExpired = credentialsExpired;
		this.accountLocked = accountLocked;
	}
	
	

	public AppUser() {
	}



	@Override
	public String toString() {
		return "AppUser []";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Boolean getAccountExpired() {
		return accountExpired;
	}

	public void setAccountExpired(Boolean accountExpired) {
		this.accountExpired = accountExpired;
	}

	public Boolean getCredentialsExpired() {
		return credentialsExpired;
	}

	public void setCredentialsExpired(Boolean credentialsExpired) {
		this.credentialsExpired = credentialsExpired;
	}

	public Boolean getAccountLocked() {
		return accountLocked;
	}

	public void setAccountLocked(Boolean accountLocked) {
		this.accountLocked = accountLocked;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static Logger getLog() {
		return LOG;
	}
	
	
	
	
	
}
