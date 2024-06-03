package com.ums.admission.testcases;

import org.testng.annotations.Test;

import com.ums.pages.ApplicantLoginPage;
import com.ums.pages.LoginPage;

import com.ums.pages.WelcomePage;

public class TC_MyAccountPageTest extends BaseClass {
	LoginPage lp;
	WelcomePage wp;
	ApplicantLoginPage ap;

	@Test(priority = 0)
	public void verifyAdminLink() {
		// String expectedUrl="https://ums-qa.adamasuniversity.ac.in/admission/login";
		// open url
		driver.get(url);

		logger.info("Url Opened");

		wp = new WelcomePage(driver);
		wp.clickOnAdminLogin();
		logger.info("clicked on Admin Login");
		wp.clickOnApplicantLogin();
		logger.info("clicked on Applicant Login");
//		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
//		 Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "The current URL does not match the expected URL.");
//		 
		ap = new ApplicantLoginPage(driver);
		ap.clickOnCreateNewAccount();

	}

	@Test(priority = 1)
	public void verifyLoginPage() {
		driver.get(url);
		lp = new LoginPage(driver);
		lp.enterUserName("admin@adamas.com");
		logger.info("clicked on Applicant Login");
		lp.enterPassWord("Arinjeet@1990");
		lp.clickOnLoginbtn();
	}

}
