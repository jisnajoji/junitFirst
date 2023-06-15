package com.example.unittesting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class  UnittestingApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testMethod() {
		UnittestingApplication unittestingApplication = new UnittestingApplication();
		assertEquals(5, unittestingApplication.add(2,3));
	}

}
