package com.service;

public class UserAuthService {
	public String checkUser(String emailid, String password) {
		if(emailid.equals("Saveri@gmail.com") && password.equals("123")) {
			return "success";
		}else {
			return "failure";
		}
	}
}
