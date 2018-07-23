package com.az.junit;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestCase {
	
	@ParameterizedTest
	@ValueSource(strings = {"ABCD","ABC","AB","A",""})
	@DisplayName("Parameterized Test")
	void lenght_greater_than_zero(String str) {
		assertTrue(str.length() > 0);
	}

}
