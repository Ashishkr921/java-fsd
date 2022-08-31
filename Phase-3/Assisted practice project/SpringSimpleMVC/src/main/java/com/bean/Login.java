package com.bean;

import org.springframework.stereotype.Component;

@Component
public class Login {
	String email;
	String Password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Login [email=" + email + ", Password=" + Password + "]";
	}
	
	
}
