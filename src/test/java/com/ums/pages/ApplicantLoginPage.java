package com.ums.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicantLoginPage  {
	WebDriver ldriver;
	public ApplicantLoginPage(WebDriver rdriver) {
		
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	@FindBy(xpath="//a[@class='sbold btn btn-success']")
	WebElement CreateNewAccount;
	public void clickOnCreateNewAccount() {
		CreateNewAccount.click();
	}
	@FindBy(xpath="//input[@id='application_no']")
	WebElement UserName;
	public void enterUserName(String un) {
		UserName.sendKeys(un);
	}
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	public void enterPassword(String pw) {
		password.sendKeys(pw);
	}
	@FindBy(xpath="//button[@id='btn_login']")
	WebElement Signin;
	public void clickOnSignin() {
		Signin.click();
	}
}
