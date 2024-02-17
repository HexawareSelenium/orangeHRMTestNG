package com.Test;

import org.testng.annotations.Test;

import com.POM.AdminPage;

public class AdminTest extends AdminPage {

	@Test
	
	public void verifyAdmin() {
		LoginTest lt = new LoginTest();
		lt.verifyTest();
		
		AdminPage ap = new AdminPage();
		ap.Admin();
		ap.addUser();
		ap.role();
//		ap.empName();
//		ap.status();
		ap.userName("user1");
		ap.password("user1234");
		ap.confirmPassword("user1234");
	}
}
