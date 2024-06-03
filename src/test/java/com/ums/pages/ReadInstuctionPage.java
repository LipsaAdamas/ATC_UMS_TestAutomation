package com.ums.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadInstuctionPage {
	WebDriver ldriver;
	public ReadInstuctionPage(WebDriver rdriver) {
		
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
}
	
@FindBy(xpath="//a[@href='https://ums-qa.adamasuniversity.ac.in/admission/signup']")
WebElement ReadInstuction;
public void ClickOnReadInstucation() {
	ReadInstuction.click();
}


}
