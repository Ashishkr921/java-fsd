package com.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Login;
import com.service.LoginService;

@Controller    //this is like servlet
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="signIn", method=RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest req, Login login) {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		login.setEmail(email);
		login.setPassword(password);
		
		String result=loginService.signIn(login);
		
		ModelAndView mav=new ModelAndView();
		
		if (result.equals("success")){
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("fail.jsp");
		}
		
		return mav;
	}
	
	@RequestMapping(value="signUp", method=RequestMethod.POST)
	public ModelAndView signUp(HttpServletRequest req, Login login) {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		login.setEmail(email);
		login.setPassword(password);
		
		String result=loginService.signUp(login);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("obj", result);
		mav.setViewName("loginDB.jsp");
		return mav;
	}
	
	
	/*@RequestMapping(value="CheckUser", method=RequestMethod.POST)
	
	public ModelAndView checkUserDetails(HttpServletRequest req) {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		ModelAndView mav=new ModelAndView();
		
		if (email.equals("Saveri@gmail.com") && password.equals("123")){
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("fail.jsp");
		}
		
		return mav;
	}*/
}
