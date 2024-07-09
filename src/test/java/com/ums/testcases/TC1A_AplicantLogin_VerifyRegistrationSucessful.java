package com.ums.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ums.pages.ApplicantLoginPage;
import com.ums.pages.BasicDetailsPage;
import com.ums.pages.DashboardPage;
import com.ums.pages.LoginPage;
import com.ums.pages.OtpVerifyPage;
import com.ums.pages.ReadInstuctionPage;
import com.ums.pages.RegistationPage;

public class TC1A_AplicantLogin_VerifyRegistrationSucessful extends BaseClass {
	String ApplicationNum;
	String expectedUserName="LIPSA DAS ";
		JavascriptExecutor js;

		
		@BeforeMethod
		public void Login() {
			driver.get(applicantLoginUrl);
			
			
			
		}
		@Test(priority=1)
		public void VerifyNewApplicantRegistrationForm()
				throws IOException, InterruptedException {

			
			ApplicantLoginPage ap = new ApplicantLoginPage(driver);
			ap.clickOnCreateNewAccount();
			Thread.sleep(3000);
			ReadInstuctionPage ip = new ReadInstuctionPage(driver);
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(3000);
			ip.ClickOnReadInstucation();
			RegistationPage rp = new RegistationPage(driver);
			rp.EnterFirstName("Lipsa");
			logger.info("First Name Entered");
			rp.EnterMiddleName("Priyadarshani");
			rp.EnterLastName("Das");
			logger.info("Last Name Entered");

			Thread.sleep(1000);
			rp.EnterDay("14");
			//rp.SelectMonth();
			rp.EntertYear("1998");
//			rp.SelectYear(DOBYear);

			logger.info("Date of Birth Entered");
			rp.SelectProgramme("UG");
			logger.info("Programme Selected");
			rp.EnterEmail("lipsadas108@gmail.com");
			logger.info("Email Entered");
			rp.EnterMobileNo("6304061157");
			logger.info("Mobile num Entered");
			rp.EnterPassWord("Onepiece@1");

			logger.info("PassWord Entered");
			rp.EnterConfirmPassword("Onepiece@1");
			logger.info("Confirm Password Entered");

			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(1000);
			rp.ClickOnReadInstuctionCB();

			rp.ClickOnRegister();
			OtpVerifyPage otp = new OtpVerifyPage(driver);
			 ApplicationNum=otp.getApplicationNumber();
			otp.VerifyApplicationNumber();
			otp.EnterOTP("123456");
			otp.ClickOnSubmitBtn();

			BasicDetailsPage bp = new BasicDetailsPage(driver);
			Thread.sleep(5000);
			String actualUserName = bp.getUserName();

			System.out.println(actualUserName);

			assertEquals(actualUserName.trim(), expectedUserName.trim());

			bp.ClickOnUserName();

			bp.ClickOnSignOutBtn();

		}
		@Test(priority=2)
		public void VerifyLoginFunctionalityAfterNewAplicantRegestration() {
			ApplicantLoginPage ap = new ApplicantLoginPage(driver);
			ap.enterUserName(ApplicationNum);
			System.out.println(ApplicationNum);
			ap.enterPassword("Onepiece@1");
			ap.clickOnSignin();
		}
		private String extractApplicationNumber(String text) {
	        Pattern pattern = Pattern.compile("APP-\\d{4}-\\d{6}");
	        Matcher matcher = pattern.matcher(text);
	        if (matcher.find()) {
	            return matcher.group();
	        }
	        return null;
	    }
}
