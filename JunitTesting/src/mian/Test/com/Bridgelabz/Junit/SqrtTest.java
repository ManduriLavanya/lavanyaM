package com.Bridgelabz.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SqrtTest {

	@Test
	void test() {
		assertEquals(5,Sqrt.sqrt(25));
	}

}