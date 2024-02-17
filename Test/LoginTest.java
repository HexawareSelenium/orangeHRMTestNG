package com.Test;

import org.testng.annotations.Test;

import com.Generic.DriverUtils;
import com.POM.LoginPage;

public class LoginTest extends LoginPage {
	
	@Test
	public void verifyTest() {
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage lp= new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.submitButton();
	}

}
