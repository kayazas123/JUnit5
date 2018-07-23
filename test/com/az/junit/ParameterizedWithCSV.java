package com.az.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedWithCSV {
	
	@ParameterizedTest
	@ValueSource(strings = {"ABCD","ABC","AB","A"})
	@DisplayName("Parameterized Test")
	void lenght_greater_than_zero(String str) {
		assertTrue(str.length() > 0);
	}
	
	@ParameterizedTest(name = "{0} toUpperCase is {1}")
	@CsvSource(value = {"abcd,ABCD","abc,ABC","'',''","abcdefg,ABCDEFG"})
	void upperCase(String word,String capitalizedWord) {
		assertEquals(capitalizedWord, word.toUpperCase());
	}
	
	
	@ParameterizedTest
	@CsvSource(value = {"abcd,4","abc,3","'',0","abcdefg,7"})
	void length(String word,int expected) {
		assertEquals(expected, word.length());
	}
	
	
	@ParameterizedTest(name = "{0} length is {1}")
	@CsvSource(value = {"abcd,4","abc,3","'',0","abcdefg,7"})
	void nameAttributesAsParams(String word,int expected) {
		assertEquals(expected, word.length());
	}
}
