package com.Bridgelabz.Functional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOf3Test {

	@Test
	void test() {
		int a[]= {1,2,3,4 ,-5 ,9};
		assertEquals(true,SumOf3.sum(a));
	}

}
