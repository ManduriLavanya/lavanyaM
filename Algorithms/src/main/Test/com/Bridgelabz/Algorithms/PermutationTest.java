package com.Bridgelabz.Algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PermutationTest {

	@Test
	void test() {
		
		char[] c= {'a','b','c','d'};
		assertEquals(24,Permutation.permutations(c,0));
	}

}
