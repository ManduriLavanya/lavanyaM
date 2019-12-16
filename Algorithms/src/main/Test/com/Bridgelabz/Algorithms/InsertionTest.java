package com.Bridgelabz.Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InsertionTest {

	@Test
	void test() {
		String[] str= {"ban","can","an","fan","don"};
		assertEquals("fan",Insertion.insert(str,5));
	}

}
