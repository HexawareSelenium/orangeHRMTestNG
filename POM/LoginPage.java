package com.POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage extends BasePage {
	
	WebDriver driver;
	
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public WebElement submit;

	@Test(priority=1)
	public void enterUsername(String str) {
		username.sendKeys(str);
	}
	
	@Test(priority=2)
	public void enterPassword(String str) {
		password.sendKeys(str);
	}
	
	@Test(priority=3)
	public void submitButton() {
		submit.click();
	}
}
