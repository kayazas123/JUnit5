package com.az.junit;


import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestingExceptions {
	
	@Test()
	@DisplayName("When length is null throw NPE")
	void length_basic() {
		String str = null;
		assertThrows(NullPointerException.class, 
				() -> str.length());
	}
	

}
