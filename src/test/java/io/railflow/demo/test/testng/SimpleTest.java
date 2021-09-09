package io.railflow.demo.test.testng;

import java.io.IOException;

import org.testng.annotations.Test;

public class SimpleTest {

	@Test
	public void testPassed() throws IOException {
		System.out.println("Test passed");
	}

	@Test
	public void testFailed() throws IOException {
		System.out.println("Test failed");
		throw new RuntimeException("Exception message");
	}
}
