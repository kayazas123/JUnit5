package com.az.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class StringTest {
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Initializing DB");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Close DB connections");
	}
	
	
	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("Initializing data = "+info.getDisplayName());
	}
	
	@AfterEach
	void afterEach(TestInfo info) {
		System.out.println("Cleanup data = "+info.getDisplayName());
	}

	@Test
	void lenth_basic() {
		int l = "ABCD".length();
		assertEquals(l, 4);
	}
	
	@Test
	void toUpperCaseTest() {
		String str = "abcd";
		assertEquals("ABCD", str.toUpperCase());
		assertNotNull(str.toUpperCase());
	}
	
	@Test
	void contains_test() {
		String str = "abcdefg";
		assertTrue(str.contains("abc"));
	}
	
	@Test
	void split_basic() {
		String str = "abc def ghi jkl";
		String[] actual = str.split(" ");
		String[] expectedRsult = new String[] {"abc","def","ghi","jkl"};
		assertArrayEquals(expectedRsult, actual);
	}
}
