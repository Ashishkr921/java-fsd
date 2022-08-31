package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.dao.LoginDAO;

@Service
public class LoginService {
	@Autowired
	LoginDAO loginDao;
	
	public String signIn(Login login) {
		if(loginDao.signIn(login)>0) {
			return "success";
		}
		else {
			return "Failure Try Again";
		}
	}
	
	public String signUp(Login login) {
		if(loginDao.signUp(login)>0) {
			return "Account created successfully";
		}
		else {
			return " Failure Try Again";
		}
	}
}
