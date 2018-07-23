package com.az.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class RepeatATest {
	
	@Test
	@RepeatedTest(value = 5)
	void repeat(TestInfo info) {
		System.out.println("Repeating.... "+info.getTestMethod());
		assertEquals(5, "ABCDE".length());
	}

}
