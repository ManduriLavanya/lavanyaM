package com.Bridgelabz.Functional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WindChillTest {


		@Test
		void test() {
			assertEquals(-9,WindChill.wind(10.0, 20.0));
		}


}