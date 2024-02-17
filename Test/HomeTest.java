package com.Test;

import org.testng.annotations.Test;

import com.POM.HomePage;

public class HomeTest extends HomePage {

	@Test
	public void verifyHome() {
		LoginTest lt = new LoginTest();
		lt.verifyTest();
		
		HomePage hp = new HomePage();
		hp.Admin();
		hp.pim();
		hp.leave();
		
	}
}
