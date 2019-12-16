package com.Bridgelabz.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonthlyPaymentTest {

	@Test
	void test() {
		assertEquals(530,MonthlyPayment.Month(50000,5,10));
	}

}
