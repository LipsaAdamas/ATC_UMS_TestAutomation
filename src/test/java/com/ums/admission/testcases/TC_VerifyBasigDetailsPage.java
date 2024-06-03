package com.ums.admission.testcases;


	import static org.testng.Assert.*;

	import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import com.ums.pages.ApplicantLoginPage;
	import com.ums.pages.BasicDetailsPage;
import com.ums.pages.EducationalDetailsPage;
import com.ums.pages.OtpVerifyPage;
	import com.ums.pages.ReadInstuctionPage;
	import com.ums.pages.RegestationPage;
import com.ums.utility.AutoItUtil;
import com.ums.utility.ReadExcelFile;



	public class TC_VerifyBasigDetailsPage extends BaseClass {
		
		
		//String expectedUserName="LIPSA DAS  ";
		JavascriptExecutor js;
		EducationalDetailsPage ep;
		@Test(enabled = false)
		public void VerifyRegPage() throws InterruptedException {
			
			RegestationPage rp = new RegestationPage(driver);
			rp.EnterFirstName("Lipsa");
			logger.info("First Name Entered");
			rp.EnterMiddleName("Priyadarshani");
			rp.EnterLastName("Das");
			logger.info("Last Name Entered");

			//rp.SelectDay("14");
			
			rp.SelectMonth();
			
			//rp.SelectYear("1998");
			logger.info("Date of Birth Entered");
			
			rp.SelectProgramme("UG");
			logger.info("Programme Selected");
			rp.EnterEmail("lipsadas108@gmail.com");
			logger.info("Email Entered");
			rp.EnterMobileNo("6304061157");
			logger.info("Mobile num Entered");
			rp.EnterPassWord("Onepiece@98");
			
			logger.info("PassWord Entered");
			Thread.sleep(1000);
			rp.EnterConfirmPassword("Onepiece@98");
			logger.info("Confirm Password Entered");
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(1000);
			rp.ClickOnReadInstuctionCB();
			Thread.sleep(1000);
			rp.ClickOnRegister();
			OtpVerifyPage otp = new OtpVerifyPage(driver);
			otp.VerifyApplicationNumber();
			otp.EnterOTP("123456");
			otp.ClickOnSubmitBtn();
			
			BasicDetailsPage bp = new BasicDetailsPage(driver);
			Thread.sleep(10000);
			String actualUserName = bp.getUserName();
			
			System.out.println(actualUserName);

			//assertEquals(expectedUserName, actualUserName);
			

			bp.ClickOnUserName();
			
			bp.ClickOnSignOutBtn();
		}

		@Test(dataProvider = "RegDataProvider")
		public void Registration(String FirstName, String MiddleName, String LastName, 
				String Programme, String EmailAddress, String Password,
				String ConfirmPassword,String expectedUserName) throws IOException, InterruptedException {
			driver.get(applicantLoginUrl);
			
			
			ApplicantLoginPage ap=new ApplicantLoginPage(driver);
			ap.clickOnCreateNewAccount();
			Thread.sleep(3000);
			ReadInstuctionPage ip=new ReadInstuctionPage(driver);
			js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0, 1000)");
			 Thread.sleep(3000);
			ip.ClickOnReadInstucation();
			RegestationPage rp = new RegestationPage(driver);
			rp.EnterFirstName(FirstName);
			logger.info("First Name Entered");
			rp.EnterMiddleName(MiddleName);
			rp.EnterLastName(LastName);
			logger.info("Last Name Entered");

			Thread.sleep(1000);
			rp.EnterDay("14");
			rp.SelectMonth();
			rp.EntertYear("1998");
//			rp.SelectYear(DOBYear);
			
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
			bp.ClickOnSaveAndNext();
			
			ep=new EducationalDetailsPage(driver);
			ep.SelectMakingScheme("CGPA OUT OF 10");
			ep.EnterDivision("First");
			ep.EnterGrade("A+");
			ep.EnterFullMark("500");
			ep.EnterObtainedMarks("420");
			ep.SelectYearOfPassing("2019");
			ep.EnterNameOfInstitute("MITM");
			ep.EnterNameOfBoard("HSE");
			ep.ClickOnAddClass12();
			ep.SelectMakingScheme12("CGPA OUT OF 10");
			ep.EnterDivision12("First");
			ep.EnterGrade12("A+");
			ep.EnterFullMark12("500");
			ep.EnterObtainedMarks12("420");
			ep.SelectYearOfPassing12("2019");
			ep.EnterNameOfInstitute12("MITM");
			ep.EnterNameOfBoard12("HSE");
			ep.ClickOnClass10th();
			

			//bp.ClickOnUserName();
			
			//bp.ClickOnSignOutBtn();

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
	
	
	
	

