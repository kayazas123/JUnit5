package com.az.junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class PerformanceTesting {
	
	@Test
	void performancceTest() {
		//Increase .ofMills value to check perforamce
		assertTimeout(Duration.ofMillis(10), () -> {
			for(int i=0;i< 1000000;i++) {
				assertNotNull(Integer.valueOf(i));
			}
		});
	}

	
}
