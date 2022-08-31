package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.service.OperationClass;

class OperationTest {

	@Test
	void testAdd() {
		//fail("Not yet implemented");
		OperationClass op=new OperationClass();
		int result=op.add(100, 200);
		assertEquals(300,result);
	}

	@Test
	void testSub() {
		//fail("Not yet implemented");
		OperationClass op=new OperationClass();
		int result=op.sub(200, 100);
		assertEquals(100,result);
	}

	@Test
	void testMul() {
		//fail("Not yet implemented");
		OperationClass op=new OperationClass();
		int result=op.mul(100, 200);
		assertEquals(20000,result);
	}

	@Test
	void testDiv() {
		//fail("Not yet implemented");
		OperationClass op=new OperationClass();
		int result=op.div(100, 50);
		assertEquals(2,result);
	}

}
