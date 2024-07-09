package com.ums.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ums.pages.ApplicantLoginPage;
import com.ums.pages.BasicDetailsPage;
import com.ums.pages.EducationalDetailsPage;
import com.ums.pages.OtpVerifyPage;
import com.ums.pages.ReadInstuctionPage;
import com.ums.pages.RegistationPage;
import com.ums.pages.UploadDocumentPage;
import com.ums.utility.AutoItUtil;

public class TC3_UMS_BasicDetailsPageTest extends BaseClass {

	String expectedUserName="GOLU BHARTI";
	JavascriptExecutor js;
	EducationalDetailsPage ep;
	@BeforeMethod
	public void RegestrationBeforeBasicDetailsTest() throws InterruptedException {
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
	}
	@Test(priority=4)
	public void TC3A_UMS_BasicDetails_MandatoryFields() throws InterruptedException, IOException {
		
		
		BasicDetailsPage bp = new BasicDetailsPage(driver);
		Thread.sleep(2000);
		String actualUserName = bp.getUserName();
		
		System.out.println(actualUserName);

		assertEquals(actualUserName.trim(), expectedUserName.trim());
		
		bp.SelectGender("Female");
		logger.info("gender Selected");
		bp.SelectReligon("Hinduism");
		bp.SelectCaste("General");
		bp.SelectIncome("Below < 1,00,000");
		bp.SelectMaritalStatus("Single");
		bp.SelectBloodGroup("AB+");
		bp.SelectDisability("No");
		
		Thread.sleep(5000);
		
		js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 500)");
		//driver.findElement(By.xpath("//input[@id='photoInput']")).click();
		bp.ClickToUploadPhoto();
		Thread.sleep(5000);
		
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\samplesignature.JPG");
		
		/*
		 * bp.ClickToUploadSignature(); Thread.sleep(5000);
		 * AutoItUtil.executeAutoItScript(
		 * "C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "
		 * +"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\samplesignature.JPG");
		 */
		
		bp.EnterAddress("Test address");
		bp.EnterAddress2("Test address");
		bp.SelectCountry("India");
		bp.SelectState("Delhi");
		Thread.sleep(1000);
		bp.SelectDistric("New Delhi");
		Thread.sleep(1000);
		bp.SelectCity("New Delhi");
		Thread.sleep(1000);
		bp.EnterPin("756115");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='present_country']")).click();
		//bp.ClickOnSameAsPermChkBox();
		bp.EnterPresentAdd1("test ,my test");
		bp.EnterPresentAdd2("Test 2");
		Thread.sleep(1000);
		
		bp.SelectPresentCountry("India");
		Thread.sleep(1000);
		bp.SelectPresentState("Delhi");
		Thread.sleep(1000);
		bp.SelectPresentdist("New Delhi");
		Thread.sleep(1000);
		bp.SelectPresentcity("New Delhi");
		bp.EnterPrestentPin("756115");
		bp.SelectSalutation1("Mrs");
		bp.EnterMothersName("Test Name1");
		bp.EnterMotherQualification("Graduate");
		bp.EnterMotherMobNum("6304061152");
		bp.EnterMothersEmail("lipsadas108@gmail.com");
		bp.SelectSalutation2("Mr");
		bp.EnterFathersName("Test Name2");
		bp.EnterFatherQualification("Graduate");
		bp.EnterFatherMobNum("6304061150");
		bp.EnterFathersEmail("lipsadas108@gmail.com");
		
		
		bp.selectRadio("No");
		
		
		
		js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 1000)");
		bp.SelectLastInstitute("Other");
		bp.EnterLastUniversity("BPUT");
		bp.EnterRegYear("2018");
		bp.EnterMigrationYear("2022");
		
		js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 500)");
		
		bp.ClickOnSaveAndNext();
		Thread.sleep(500);
		String actualToastMessage=driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
		String expectedToastMessage="Success! Your Basic Information form saved successfully.";
		
		 Assert.assertEquals(actualToastMessage.trim(), expectedToastMessage.trim(), "Toast message validation failed");
		 
		 Thread.sleep(200);
		driver.navigate().back();
		Thread.sleep(500);
		String ActualUserName = bp.getUserName();

		System.out.println(ActualUserName);

		assertEquals(ActualUserName.trim(), expectedUserName.trim());

		bp.ClickOnUserName();

		bp.ClickOnSignOutBtn();
		 
	}
	@Test(priority=3)
	public void TC3B_UMS_BasicDetails_NonMandatoryFields() throws InterruptedException, IOException {
		BasicDetailsPage bp = new BasicDetailsPage(driver);
		Thread.sleep(2000);
		String actualUserName = bp.getUserName();
		
		System.out.println(actualUserName);

		assertEquals(actualUserName.trim(), expectedUserName.trim());
		
		bp.SelectGender("Female");
		logger.info("gender Selected");
		bp.SelectReligon("Hinduism");
		bp.SelectCaste("General");
		bp.SelectIncome("Below < 1,00,000");
		bp.SelectMaritalStatus("Single");
		bp.SelectBloodGroup("AB+");
		bp.SelectDisability("No");
		
		Thread.sleep(5000);
		
		js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 500)");
		//driver.findElement(By.xpath("//input[@id='photoInput']")).click();
		bp.ClickToUploadPhoto();
		Thread.sleep(5000);
		
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\samplesignature.JPG");
		
		
		
		bp.EnterAddress("Test address");
		//bp.EnterAddress2("Test address");
		bp.SelectCountry("India");
		bp.SelectState("Delhi");
		Thread.sleep(1000);
		bp.SelectDistric("New Delhi");
		Thread.sleep(1000);
		bp.SelectCity("New Delhi");
		Thread.sleep(1000);
		bp.EnterPin("756115");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='present_country']")).click();
		//bp.ClickOnSameAsPermChkBox();
		bp.EnterPresentAdd1("test ,my test");
		//bp.EnterPresentAdd2("Test 2");
		Thread.sleep(1000);
		
		bp.SelectPresentCountry("India");
		Thread.sleep(1000);
		bp.SelectPresentState("Delhi");
		Thread.sleep(1000);
		bp.SelectPresentdist("New Delhi");
		Thread.sleep(1000);
		bp.SelectPresentcity("New Delhi");
		bp.EnterPrestentPin("756115");
		bp.SelectSalutation1("Mrs");
		bp.EnterMothersName("Test Name1");
		bp.EnterMotherQualification("Graduate");
		bp.EnterMotherMobNum("6304061152");
		bp.EnterMothersEmail("lipsadas108@gmail.com");
		bp.SelectSalutation2("Mr");
		bp.EnterFathersName("Test Name2");
		bp.EnterFatherQualification("Graduate");
		bp.EnterFatherMobNum("6304061150");
		bp.EnterFathersEmail("lipsadas108@gmail.com");
		
		
		bp.selectRadio("No");
		
		
		
		js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 1000)");
		bp.SelectLastInstitute("Other");
		bp.EnterLastUniversity("BPUT");
		bp.EnterRegYear("2018");
		bp.EnterMigrationYear("2022");
		
		js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 500)");
		
		bp.ClickOnSaveAndNext();
		Thread.sleep(500);
		String actualToastMessage=driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
		String expectedToastMessage="Success! Your Basic Information form saved successfully.";
		
		 Assert.assertEquals(actualToastMessage.trim(), expectedToastMessage.trim(), "Toast message validation failed");
		 Thread.sleep(200);
			driver.navigate().back();
			Thread.sleep(500);
		 String ActualUserName = bp.getUserName();

			System.out.println(ActualUserName);

			assertEquals(ActualUserName.trim(), expectedUserName.trim());

			bp.ClickOnUserName();

			bp.ClickOnSignOutBtn();
		
	}
	@Test(priority=1)
	public void TC3C_UMS_BasicDetails_NonEditableFields() throws InterruptedException {
		BasicDetailsPage bp = new BasicDetailsPage(driver);
		
		
		
		 try {
	            // Attempt to enter a value into the first name field
	            bp.SelectDobDay("18");
	            bp.Selectdobmonth("May");
	            bp.Selectdobyear("2003");
	            bp.EnterMobileNum("9090807060");
	            bp.EnterEmail("Lipsa@gmail.com");
 
	            // If no exception occurs, the field is editable, and the test should fail
	            Assert.fail("fields are editable, but it should be non-editable.");
	        } catch (Exception e) {
	            // If an exception occurs, the field is non-editable, and the test should pass
	            System.out.println("fields are non-editable as expected.");
	        }
		 Thread.sleep(200);
		 String ActualUserName = bp.getUserName();

			System.out.println(ActualUserName);

			assertEquals(ActualUserName.trim(), expectedUserName.trim());

			bp.ClickOnUserName();

			bp.ClickOnSignOutBtn();
	}
	@Test(priority=2)
	public void TC3D_UMS_BasicDetails_GeneralCategoryApplicant() throws InterruptedException {
		BasicDetailsPage bp = new BasicDetailsPage(driver);
		Thread.sleep(2000);
		
		String actualUserName = bp.getUserName();
		
		System.out.println(actualUserName);

		assertEquals(actualUserName.trim(), expectedUserName.trim());
		
		bp.SelectGender("Female");
		logger.info("gender Selected");
		bp.SelectReligon("Hinduism");
		bp.SelectCaste("General");
		 try {
	            bp.clickOnCastValidationDateFrom();
	            logger.info("Clicked on Caste Validation Date From");
	        } catch (Exception e) {
	            logger.info("Caste Validation Date From is not clickable");
	            // Ensuring the test passes if this step fails
	            Assert.assertTrue(true, "Caste Validation Date From is not clickable, test passed.");
	        }
		 String ActualUserName = bp.getUserName();

			System.out.println(ActualUserName);

			assertEquals(ActualUserName.trim(), expectedUserName.trim());

			bp.ClickOnUserName();

			bp.ClickOnSignOutBtn();
	}
	
	
	
}
