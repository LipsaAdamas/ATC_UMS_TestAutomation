package com.ums.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IncompleteApplicationPage {

	
	
	WebDriver ldriver;
	public static String applicationNo;

	// Constructor
	public IncompleteApplicationPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
}
