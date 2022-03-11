package com.lq.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.lq.testclasses.ClassToTest;

class MyFirstTestCase {

	@Test
	void test() {
		System.out.println("test");
		ClassToTest ctt = new ClassToTest();
		assertEquals(true, ctt.methodToTest());
	}

}
