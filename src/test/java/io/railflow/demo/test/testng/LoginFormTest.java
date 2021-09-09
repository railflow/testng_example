package io.railflow.demo.test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFormTest {

	@Test
	public void loginCorrectCredentials() {
		System.out.println("login with correct credentials");
	}

	@Test
	public void loginErrorIncorrectUserName() {
		Assert.fail("Error message was not shown");
	}

	@Test
	public void loginErrorIncorrectPassword() {
		throw new RuntimeException("Unexpected exception");
	}

	@Test
	public void loginRememberMeIsChecked() {
		System.out.println("login with remember me set to true");
	}

	@Test(enabled = false)
	public void loginFailedServiceUnavailable() {
		System.out.println("login failed");
	}

}
