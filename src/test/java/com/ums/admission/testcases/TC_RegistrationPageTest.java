package com.ums.admission.testcases;

import static org.testng.Assert.*;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ums.pages.ApplicantLoginPage;
import com.ums.pages.BasicDetailsPage;
import com.ums.pages.OtpVerifyPage;
import com.ums.pages.ReadInstuctionPage;
import com.ums.pages.RegistationPage;
import com.ums.utility.ReadExcelFile;

public class TC_RegistrationPageTest extends BaseClass {

	// String expectedUserName="LIPSA DAS ";
	JavascriptExecutor js;

	@Test(dataProvider = "RegDataProvider")
	public void Registration(String FirstName, String MiddleName, String LastName, String Programme,
			String EmailAddress, String Password, String ConfirmPassword, String expectedUserName)
			throws IOException, InterruptedException {

		driver.get(applicantLoginUrl);

		ApplicantLoginPage ap = new ApplicantLoginPage(driver);
		ap.clickOnCreateNewAccount();
		Thread.sleep(3000);
		ReadInstuctionPage ip = new ReadInstuctionPage(driver);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(3000);
		ip.ClickOnReadInstucation();
		RegistationPage rp = new RegistationPage(driver);
		rp.EnterFirstName(FirstName);
		logger.info("First Name Entered");
		rp.EnterMiddleName(MiddleName);
		rp.EnterLastName(LastName);
		logger.info("Last Name Entered");

		Thread.sleep(1000);
		rp.EnterDay("14");
		rp.SelectMonth();
		rp.EntertYear("1998");
//		rp.SelectYear(DOBYear);

		logger.info("Date of Birth Entered");
		rp.SelectProgramme(Programme);
		logger.info("Programme Selected");
		rp.EnterEmail(EmailAddress);
		logger.info("Email Entered");
		rp.EnterMobileNo("6304061157");
		logger.info("Mobile num Entered");
		rp.EnterPassWord(Password);

		logger.info("PassWord Entered");
		rp.EnterConfirmPassword(ConfirmPassword);
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

	@DataProvider(name = "RegDataProvider")
	public String[][] RegDataProvider() {
		System.out.println(System.getProperty("user.dir"));
		String fileName = System.getProperty("user.dir") + "\\TestData\\NewApplicantRegestationDataSheet.xlsx";
		int ttlRows = ReadExcelFile.getRowCount(fileName, "RegestationSheet");
		int ttlColumns = ReadExcelFile.getColCount(fileName, "RegestationSheet");
		String data[][] = new String[ttlRows - 1][ttlColumns];
		for (int i = 1; i < ttlRows; i++) {
			for (int j = 0; j < ttlColumns; j++) {
				data[i - 1][j] = ReadExcelFile.getCellValue(fileName, "RegestationSheet", i, j);
			}
		}
		return data;

	}

}
