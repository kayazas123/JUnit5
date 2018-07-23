package com.az.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import math.test.MathImpl;

public class MatchTest {
	
	@Test
	void testMax() {
		int a = 5;
		int b = 6;
		int expected = 5;
		assertEquals(expected, new MathImpl().min(a, b));
	}
	
	
	@Test
	void testMin() {
		int a = 5;
		int b = 6;
		int expected = 6;
		assertEquals(expected, new MathImpl().max(a, b));
	}

}
