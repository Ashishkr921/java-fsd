package com.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnitHookMethods {
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		System.out.println("Before all test");
	}
	
	@AfterAll
	static void setUpAfterClass() throws Exception{
		System.out.println("After all test");
	}
	
	@BeforeEach
	static void setUp() throws Exception{
		System.out.println("Before each test");
	}
	
	@AfterEach
	static void tearDown() throws Exception{
		System.out.println("After Each test");
	}
	
	@Test
	void test1(){
		System.out.println("Test 1");
	}
	
	@Test
	void test2(){
		System.out.println("Test 2");
	}
}
