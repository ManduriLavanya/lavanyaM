package com.Bridgelabz.Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleTest {

	@Test
	void test() {
		String[] str= {"ban","can","an","fan","don"};
		assertEquals("fan",Bubble.bubble(str));
	}

}
