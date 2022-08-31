package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bean.Employee;
import com.service.EmployeeService;

class EmployeeServiceTest {

	@Test
	@DisplayName("Check User details testing")
	void testCheckUser() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		String result = es.checkUser("Saveri@gmail.com", "123");
		assertEquals("success", result);	
		String result1 = es.checkUser("ram@gmail.com", "123");
		assertEquals("failure", result1);
	}
}