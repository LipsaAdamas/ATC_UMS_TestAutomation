package com.ums.admission.testcases;

import org.testng.annotations.Test;

import com.ums.pages.ApplicantLoginPage;
import com.ums.pages.LoginPage;

import com.ums.pages.WelcomePage;

public class TC_MyApplicantLoginTest extends BaseClass {
	LoginPage lp;
	WelcomePage wp;
	ApplicantLoginPage ap;
	
	@Test
	public void verifyAdminLink() {
		//String expectedUrl="https://ums-qa.adamasuniversity.ac.in/admission/login";
		// open url
		driver.get(url);
		logger.info("Url Opened");

		 wp = new WelcomePage(driver);
		wp.clickOnAdminLogin();
		logger.info("clicked on Admin Login");
		wp.clickOnApplicantLogin();
		logger.info("clicked on Applicant Login");
		
		ap=new ApplicantLoginPage(driver);
		ap.clickOnCreateNewAccount();
		
	}
}
