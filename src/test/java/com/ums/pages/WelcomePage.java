package com.ums.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	// Create an Object of webdriver
	WebDriver ldriver;

	// Create constructor
	public WelcomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//span[@class='nav-text font-size-lg  font-weight-bolder text-center']")
	WebElement Adminlogin;

	// identify Action on webelement
	public void clickOnAdminLogin() {
		Adminlogin.click();
	}
	@FindBy(xpath = "(//a[@class='nav-link text-white mb-0'])[1]")
	WebElement ApplicantLogin;
	
	public void clickOnApplicantLogin() {
		ApplicantLogin.click();
	}

}
