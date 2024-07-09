package com.ums.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Create an Object of webdriver
	WebDriver ldriver;

	// Create constructor
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@name='email']")
	WebElement UserName;

	// action on web element
	public void enterUserName(String username) {
		UserName.sendKeys(username);
	}

	@FindBy(xpath = "//input[@name='password']")
	WebElement PassWord;

	// action on web element
	public void enterPassWord(String password) {
		PassWord.sendKeys(password);
	}

	@FindBy(xpath = "//button[@name='login']")
	WebElement Loginbtn;

	// action on webelement
	public void clickOnLoginbtn() {
		Loginbtn.click();
	}
}