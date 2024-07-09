package com.ums.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeeManagementPage {

	
	
		WebDriver ldriver;

		// Constructor
		public FeeManagementPage(WebDriver rdriver) {

			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		
		@FindBy(xpath="//span[@class='title'][normalize-space()='Fees Management']")
		WebElement FeesManagement;
		public void ExpandFeesManagement() {
			FeesManagement.click();
		}
		@FindBy(xpath="//a[@class='nav-link nav-toggle' and contains(@href,'payment-under-verification')]")
		WebElement PaymentUnderVerification;
		public void ClickOnPaymentUnderVerification() {
			PaymentUnderVerification.click();
		}
		@FindBy(xpath="//input[@id='application_no']")
		WebElement ApplicationNum;
		public void EnterApplicationNum(String Appnum) {
			ApplicationNum.sendKeys(Appnum);
		}
		@FindBy(xpath="//button[@id='btn_submit_search']")
		WebElement SearchApplication;
		public void ClickOnSearch() {
			SearchApplication.click();
		}
		@FindBy(xpath="//a[@class='btn btn-sm yellow-gold']")
		WebElement Reset;
		public void ClickOnReset() {
			Reset.click();
		}
}
