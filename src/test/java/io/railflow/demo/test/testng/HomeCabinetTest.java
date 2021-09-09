package io.railflow.demo.test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeCabinetTest {

	@Test
	public void changePassword() {
		throw new RuntimeException("Unexpected exception");
	}

	@Test
	public void changePasswordFailOnIncorrectConfirmation() {
		System.out.println("change password failed with incorrect confirmation");
	}

	@Test
	public void changePasswordFailOnIncorrectPassword() {
		System.out.println("change password fail with incorrect password");
	}

	@Test
	public void changeEmail() {
		System.out.println("Change email");
	}

	@Test
	public void changeEmailFailOnInvalidEmail() {
		Assert.fail("Email is empty");
	}
}
