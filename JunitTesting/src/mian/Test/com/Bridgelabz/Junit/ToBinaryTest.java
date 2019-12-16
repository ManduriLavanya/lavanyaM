package com.Bridgelabz.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ToBinaryTest {

	@Test
	void test() {
		assertEquals(101,ToBinary.Bin(5));
	}

}
