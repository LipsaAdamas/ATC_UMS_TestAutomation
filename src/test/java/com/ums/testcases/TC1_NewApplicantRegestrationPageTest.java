package com.ums.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.ums.pages.ApplicantLoginPage;
import com.ums.pages.BasicDetailsPage;
import com.ums.pages.OtpVerifyPage;
import com.ums.pages.ReadInstuctionPage;
import com.ums.pages.RegistationPage;


public class TC1_NewApplicantRegestrationPageTest extends BaseClass {

	String expectedUserName="GOLU BHARTI ";
	ReadInstuctionPage ip;
	RegistationPage rp;
	JavascriptExecutor js;
	
	@BeforeMethod
		public void Setup() throws InterruptedException {
			driver.get(applicantLoginUrl);
			
			ApplicantLoginPage ap = new ApplicantLoginPage(driver);
			ap.clickOnCreateNewAccount();
			Thread.sleep(3000);
			ReadInstuctionPage ip = new ReadInstuctionPage(driver);
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(3000);
			ip.ClickOnReadInstucation();
		}
	
	@Test(priority = 1)
	public void TC1A_UMS_FirstNameAndLastName_Mandatory()
			throws IOException, InterruptedException {

		
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("14");
		rp.SelectMonth();
		rp.EntertYear("1998");
//		rp.SelectYear(DOBYear);
		
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
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Document";
		Assert.assertEquals(actualTitle, expectedTitle, "Title doesn't match.");
		
	}
	@Test(priority = 2)
	public void TC1B_UMS_FirstNameLastName_ValidInput()
			throws IOException, InterruptedException {

		
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("Golu");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("Bharti");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("14");
		rp.SelectMonth();
		rp.EntertYear("1998");
//		rp.SelectYear(DOBYear);
		
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
	//enabled = false
	@Test(priority = 3)
	public void TC1C_UMS_FirstNameLastName_InvalidInput() throws InterruptedException {
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("Golu#@");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("Bharti*(");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("14");
		rp.SelectMonth();
		rp.EntertYear("1998");
//		rp.SelectYear(DOBYear);
		
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
	@Test(priority = 4)
	public void TC1D_UMS_DayField_ValidNumbers() throws InterruptedException {
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("Golu");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("Bharti");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("14");
		rp.SelectMonth();
		rp.EntertYear("1998");
//		rp.SelectYear(DOBYear);
		
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
	@Test(priority = 5)
	public void TC1E_UMS_MonthField_ValidMonth() throws InterruptedException {
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("Golu");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("Bharti");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("2");
		
		rp.EntertYear("2000");
//		rp.SelectYear(DOBYear);
		
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
		String actualURL=driver.getCurrentUrl();
		String expectedURL=signupUrl;
		 Assert.assertEquals(actualURL, expectedURL, "URL doesn't match.");
		
	}
	@Test(priority = 6)
	public void TC1F_UMS_YearField_ValidNumbers() throws InterruptedException {
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("Golu");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("Bharti");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("2");
		rp.SelectMonth();
		rp.EntertYear("");
//		rp.SelectYear(DOBYear);
		
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
		String actualURL=driver.getCurrentUrl();
		String expectedURL=signupUrl;
		 Assert.assertEquals(actualURL, expectedURL, "URL doesn't match.");
		
	}
	@Test(priority = 7)
	//@Test(priority = 1)
	public void TC1G_UMS_ProgrammeSelection_Mandatory() throws InterruptedException {
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("Golu");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("Bharti");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("2");
		rp.SelectMonth();
		rp.EntertYear("2000");
//		rp.SelectYear(DOBYear);
		
		logger.info("Date of Birth Entered");
		//rp.SelectProgramme("UG");
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
		String actualURL=driver.getCurrentUrl();
		String expectedURL=signupUrl;
		 Assert.assertEquals(actualURL, expectedURL, "URL doesn't match.");
		
	}
	@Test(priority = 8)
	//@Test(priority = 1)
	public void TC1H_UMS_ProgrammeSelection_DisplayList() throws InterruptedException {
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("Golu");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("Bharti");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("2");
		rp.SelectMonth();
		rp.EntertYear("2000");
//		rp.SelectYear(DOBYear);
		
		logger.info("Date of Birth Entered");
		//rp.SelectProgramme("UG");
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
		String actualURL=driver.getCurrentUrl();
		String expectedURL=signupUrl;
		 Assert.assertEquals(actualURL, expectedURL, "URL doesn't match.");
		
	}
	@Test(priority = 9)
	//@Test(priority = 1)
	public void TC1I_UMS_AdmissionTo_DisplayList() throws InterruptedException {
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("Golu");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("Bharti");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("2");
		rp.SelectMonth();
		rp.EntertYear("2000");
//		rp.SelectYear(DOBYear);
		
		logger.info("Date of Birth Entered");
		//rp.SelectProgramme("UG");
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
		String actualURL=driver.getCurrentUrl();
		String expectedURL=signupUrl;
		 Assert.assertEquals(actualURL, expectedURL, "URL doesn't match.");
		
	}
	@Test(priority = 10)
	//@Test(priority = 1)
	public void TC1J_UMS_EmailAddress_Mandatory() throws InterruptedException {
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("Golu");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("Bharti");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("2");
		rp.SelectMonth();
		rp.EntertYear("2000");
//		rp.SelectYear(DOBYear);
		
		logger.info("Date of Birth Entered");
		rp.SelectProgramme("UG");
		logger.info("Programme Selected");
		rp.EnterEmail("");
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
		String actualURL=driver.getCurrentUrl();
		String expectedURL=signupUrl;
		 Assert.assertEquals(actualURL, expectedURL, "URL doesn't match.");
		
	}
	@Test(priority = 11)
	//@Test(priority = 1)
	public void TC1K_UMS_EmailAddress_ValidFormat() throws InterruptedException {
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("Golu");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("Bharti");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("2");
		rp.SelectMonth();
		rp.EntertYear("2000");
//		rp.SelectYear(DOBYear);
		
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
     @Test(priority = 12)
	//@Test(priority = 1)
	public void TC1L_UMS_EmailAddress_InvalidFormat() throws InterruptedException {
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("Golu");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("Bharti");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("2");
		rp.SelectMonth();
		rp.EntertYear("2000");
//		rp.SelectYear(DOBYear);
		
		logger.info("Date of Birth Entered");
		rp.SelectProgramme("UG");
		logger.info("Programme Selected");
		rp.EnterEmail("gmail.zips@com");
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
		String actualURL=driver.getCurrentUrl();
		String expectedURL=signupUrl;
		 Assert.assertEquals(actualURL, expectedURL, "URL doesn't match.");
		
	}
	@Test(priority = 13)
	public void TC1M_UMS_MobileNumber_Mandatory() throws InterruptedException {
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("Golu");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("Bharti");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("2");
		rp.SelectMonth();
		rp.EntertYear("2000");
//		rp.SelectYear(DOBYear);
		
		logger.info("Date of Birth Entered");
		rp.SelectProgramme("UG");
		logger.info("Programme Selected");
		rp.EnterEmail("lipsadas108@gmail.com");
		logger.info("Email Entered");
		//rp.EnterMobileNo("6304061157");
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
		String actualURL=driver.getCurrentUrl();
		String expectedURL=signupUrl;
		 Assert.assertEquals(actualURL, expectedURL, "URL doesn't match.");
		
	}
	@Test(priority = 14)
	public void TC1N_UMS_MobileNumber_ValidNumbers() throws InterruptedException {
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("Golu");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("Bharti");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("2");
		rp.SelectMonth();
		rp.EntertYear("2000");
//		rp.SelectYear(DOBYear);
		
		logger.info("Date of Birth Entered");
		rp.SelectProgramme("UG");
		logger.info("Programme Selected");
		rp.EnterEmail("lipsadas108@gmail.com");
		logger.info("Email Entered");
		rp.EnterMobileNo("63040611&^*");
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
		String actualURL=driver.getCurrentUrl();
		String expectedURL=signupUrl;
		 Assert.assertEquals(actualURL, expectedURL, "URL doesn't match.");
		
	}
	@Test(priority = 15)
	public void TC1O_UMS_Password_Mandatory() throws InterruptedException {
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("Golu");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("Bharti");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("2");
		rp.SelectMonth();
		rp.EntertYear("2000");
//		rp.SelectYear(DOBYear);
		
		logger.info("Date of Birth Entered");
		rp.SelectProgramme("UG");
		logger.info("Programme Selected");
		rp.EnterEmail("lipsadas108@gmail.com");
		logger.info("Email Entered");
		rp.EnterMobileNo("6304061157");
		logger.info("Mobile num Entered");
		//rp.EnterPassWord("Onepiece@1");

		logger.info("PassWord Entered");
		//rp.EnterConfirmPassword("Onepiece@1");
		logger.info("Confirm Password Entered");

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(1000);
		rp.ClickOnReadInstuctionCB();

		rp.ClickOnRegister();
		String actualURL=driver.getCurrentUrl();
		String expectedURL=signupUrl;
		 Assert.assertEquals(actualURL, expectedURL, "URL doesn't match.");
		
	}
	@Test(priority = 16)
	public void TC1P_UMS_Password_ValidCriteria() throws InterruptedException {
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("Golu");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("Bharti");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("2");
		rp.SelectMonth();
		rp.EntertYear("2000");
//		rp.SelectYear(DOBYear);
		
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
	@Test(priority = 17)
	//@Test(priority=1)
	public void TC1Q_UMS_Password_InvalidCriteria() throws InterruptedException {
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName("Golu");
		logger.info("First Name Entered");
		rp.EnterMiddleName("Kumar");
		rp.EnterLastName("Bharti");
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("2");
		rp.SelectMonth();
		rp.EntertYear("2000");
//		rp.SelectYear(DOBYear);
		
		logger.info("Date of Birth Entered");
		rp.SelectProgramme("UG");
		logger.info("Programme Selected");
		rp.EnterEmail("lipsadas108@gmail.com");
		logger.info("Email Entered");
		rp.EnterMobileNo("6304061157");
		logger.info("Mobile num Entered");
		rp.EnterPassWord("PASSWORD");

		logger.info("PassWord Entered");
		rp.EnterConfirmPassword("PASSWORD");
		logger.info("Confirm Password Entered");

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(1000);
		rp.ClickOnReadInstuctionCB();

		rp.ClickOnRegister();
		String actualURL=driver.getCurrentUrl();
		String expectedURL=signupUrl;
		 Assert.assertEquals(actualURL, expectedURL, "URL doesn't match.");
		
	}
	
	@Test(priority=18)
		public void TC1R_UMS_ConfirmPassword_Mandatory() throws InterruptedException {
			RegistationPage rp = new RegistationPage(driver);
			rp.EnterFirstName("Golu");
			logger.info("First Name Entered");
			rp.EnterMiddleName("Kumar");
			rp.EnterLastName("Bharti");
			logger.info("Last Name Entered");

			Thread.sleep(1000);
			rp.EnterDay("2");
			rp.SelectMonth();
			rp.EntertYear("2000");
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
			//rp.EnterConfirmPassword("Onepiece@1");
			logger.info("Confirm Password Entered");

			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(1000);
			rp.ClickOnReadInstuctionCB();

			rp.ClickOnRegister();
			String actualURL=driver.getCurrentUrl();
			String expectedURL=signupUrl;
			 Assert.assertEquals(actualURL, expectedURL, "URL doesn't match.");
			
		}
		@Test(priority=19)
		public void TC1S_UMS_ConfirmPassword_MatchPassword() throws InterruptedException {
			RegistationPage rp = new RegistationPage(driver);
			rp.EnterFirstName("Golu");
			logger.info("First Name Entered");
			rp.EnterMiddleName("Kumar");
			rp.EnterLastName("Bharti");
			logger.info("Last Name Entered");

			Thread.sleep(1000);
			rp.EnterDay("2");
			rp.SelectMonth();
			rp.EntertYear("2000");
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
		@Test(priority=20)
		public void TC1T_UMS_ConfirmPassword_NonMatching() throws InterruptedException {
			RegistationPage rp = new RegistationPage(driver);
			rp.EnterFirstName("Golu");
			logger.info("First Name Entered");
			rp.EnterMiddleName("Kumar");
			rp.EnterLastName("Bharti");
			logger.info("Last Name Entered");

			Thread.sleep(1000);
			rp.EnterDay("2");
			rp.SelectMonth();
			rp.EntertYear("2000");
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
			rp.EnterConfirmPassword("Pieceone@1");
			logger.info("Confirm Password Entered");

			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(1000);
			rp.ClickOnReadInstuctionCB();

			rp.ClickOnRegister();
			String actualURL=driver.getCurrentUrl();
			String expectedURL=signupUrl;
			 Assert.assertEquals(actualURL, expectedURL, "URL doesn't match.");
			
		}
		@Test(priority=21)
		public void TC1U_UMS_TermsAndConditions_Mandatory() throws InterruptedException {
			RegistationPage rp = new RegistationPage(driver);
			rp.EnterFirstName("Golu");
			logger.info("First Name Entered");
			rp.EnterMiddleName("Kumar");
			rp.EnterLastName("Bharti");
			logger.info("Last Name Entered");

			Thread.sleep(1000);
			rp.EnterDay("2");
			rp.SelectMonth();
			rp.EntertYear("2000");
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
			rp.EnterConfirmPassword("Pieceone@1");
			logger.info("Confirm Password Entered");

			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(1000);
			rp.ClickOnReadInstuctionCB();

			rp.ClickOnRegister();
			String actualURL=driver.getCurrentUrl();
			String expectedURL=signupUrl;
			 Assert.assertEquals(actualURL, expectedURL, "URL doesn't match.");
			
		}
		
	
	
}
