package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends BasePage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
	public WebElement adminButton;
	
	@FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--secondary")
	public WebElement addButton;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
	public WebElement role;
	
//	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
//	public WebElement selectRole;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	public WebElement empName;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
	public WebElement status;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
	public WebElement username;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
	public WebElement password;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
	public WebElement confirmPassword;
	
	public void Admin() {
		adminButton.click();
	}
	
	public void addUser() {
		addButton.click();
	}
	
	public void role() {
		role.click();
	}
	
	public void empName() {
		empName.click();
	}
	
	public void status() {
		status.click();
	}
	
	public void userName(String str) {
		username.click();
		username.sendKeys(str);
	}
	
	public void password(String str) {
		password.click();
		password.sendKeys(str);
	}
	
	public void confirmPassword(String str) {
		confirmPassword.click();
		confirmPassword.sendKeys(str);
	}
}
