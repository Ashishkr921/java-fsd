package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.service.UserAuthService;

class UserAuthServiceTest {

	@Test
	@DisplayName("Check the user's details")
	void testCheckUser() {
		//fail("Not yet implemented");
		UserAuthService es = new UserAuthService();
		String result = es.checkUser("Saveri@gmail.com", "123");
		assertEquals("success", result);	
		String result1 = es.checkUser("ram@gmail.com", "123");
		assertEquals("failure", result1);
	}

}
