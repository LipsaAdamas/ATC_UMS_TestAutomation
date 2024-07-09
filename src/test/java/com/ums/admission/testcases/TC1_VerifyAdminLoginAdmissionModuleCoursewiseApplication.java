package com.ums.admission.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.ums.functions.WebActions;
import com.ums.pages.BasicDetailsPage;
import com.ums.pages.CourseWiseApplication;
import com.ums.pages.DashboardPage;
import com.ums.pages.EducationalDetailsPage;
import com.ums.pages.LoginPage;
import com.ums.pages.UploadDocumentPage;
import com.ums.utility.AutoItUtil;

public class TC1_VerifyAdminLoginAdmissionModuleCoursewiseApplication extends BaseClass {

	String applicationNo = "APP-2024-100075";

	@BeforeMethod
	public void Login() {
		driver.get(adminLoginUrl);
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin@adamas.com");
		lp.enterPassWord("123456");
		lp.clickOnLoginbtn();
		// Navigate to the course-wise application page
		DashboardPage dp = new DashboardPage(driver);
		dp.ExpandAdmission();
		dp.ClickOnCourseWiseApplication();
		
		
		
	}

		@Test(priority = 3)
	public void verifySearchPanel() throws InterruptedException {

		// Enter application number and perform search
		CourseWiseApplication cp = new CourseWiseApplication(driver);
		cp.ClickOnSearchApplication();
		cp.EnterApplicationNum(applicationNo);
		cp.ClickonSearch();

		// Verify if the displayed application number matches the expected one
		String actualApplicationNum = cp.AppicationNumField();
		Assert.assertEquals(actualApplicationNum, applicationNo, "Application number doesn't match.");
		DashboardPage dp = new DashboardPage(driver);
		dp.clickOnUserName();
		Thread.sleep(2000);
		dp.ClickOnLogOut();
		
	}

	@Test(priority = 2)
	public void verifyEditApplicationisClickable() throws InterruptedException {

		CourseWiseApplication cp = new CourseWiseApplication(driver);
		cp.ClickOnSearchApplication();
		cp.EnterApplicationNum(applicationNo);
		cp.ClickOnEditApplication();

		WebActions wa = new WebActions(driver);
		wa.switchToAnotherTab();
		String expectedTitle = "ADAMAS UNIVERSITY";
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains(expectedTitle), "Title does not contain 'ADAMAS UNIVERSITY'.");
		
		DashboardPage dp = new DashboardPage(driver);
		dp.clickOnUserName();
		Thread.sleep(2000);
		dp.ClickOnLogOut();
	}
	
	 
	 

	@Test(priority = 1)
	public void verifyDocumentsAreUploaded() throws IOException, InterruptedException {
		String editedName = "Lipsa";
		CourseWiseApplication cp = new CourseWiseApplication(driver);
		cp.ClickOnSearchApplication();
		cp.EnterApplicationNum(applicationNo);
		cp.ClickOnEditApplication();
		 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		    String originalTab = tabs.get(0);
		    // Switch to the new tab
		    driver.switchTo().window(tabs.get(1));
		BasicDetailsPage bp = new BasicDetailsPage(driver);
		
	
		
		bp.ClickToUploadPhoto();
        Thread.sleep(1000);
        
        AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe" + " " + "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\samplesignature.JPG");
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 3000)");
        bp.ClickOnSaveAndNext();
	      
		EducationalDetailsPage ep=new EducationalDetailsPage(driver);
 
		ep.clickOnDeleteOtherExam();
		ep.ClickOnUpdateNext();
		UploadDocumentPage up=new UploadDocumentPage(driver);
		
		up.ClickOnAddFilePhotoIdProof();
		
		Thread.sleep(5000);
		
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileProofOfDob();
		Thread.sleep(1000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileProofOfDob();
		Thread.sleep(1000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileCastCertificate();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileMarkSheetOfSecondarySchool();
		Thread.sleep(3000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFilePassCertificateX();
		Thread.sleep(3000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileMarkSheetOfSeniourSecondarySchool();
		Thread.sleep(3000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnPassCertificateXII();
		Thread.sleep(3000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnOtherPublicEntranceExam();
		Thread.sleep(3000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnJEEAllotmentLetter();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileDeplomaMarkSheet();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnGraduationMarkSheet();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnGraduationPassCertificate();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileAffidavitAnnexure1();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileAffidavitAnnexure2();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileMedicalCeritificate();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileCollegeOrSchoolLeavingOrMigrationCertificate();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileRankCardSection();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileVisa();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFilePassport();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileAddressProofOLocalGuardian();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		
		up.ClickOnAddFilePhotoIdProofOLocalGuardian();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileAddressProofOMother();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFilePhotoIdProofOMother();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileAddressProofOFather();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFilePhotoIdProofOFather();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnCourseCompletionCertificate();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileAllFeeReceipt();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnAddFileDisabilityCertificate();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		up.ClickOnStatementOfPurposeDocument();
		Thread.sleep(5000);
		AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe"+" "+"C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
		
		DashboardPage dp = new DashboardPage(driver);
		dp.clickOnUserName();
		Thread.sleep(2000);
		dp.ClickOnLogOut();
		
		
		
		
		
	}
	/*@Test(priority = 2)
	 public void VerifyEducationalDetailsPage(){
		 CourseWiseApplication cp = new CourseWiseApplication(driver);
			cp.ClickOnSearchApplication();
			cp.EnterApplicationNum(applicationNo);
			cp.ClickOnEditApplication();
			WebActions wa = new WebActions(driver);
			wa.switchToAnotherTab();
			BasicDetailsPage bp = new BasicDetailsPage(driver);
			bp.ClickOnSaveAndNext();
			EducationalDetailsPage ep=new EducationalDetailsPage(driver);
			
			ep.SelectMakingScheme("CGPA OUT OF 10");
			ep.EnterDivision("1st");
			ep.EnterGrade("A");
			ep.ClearFullMark();
			ep.EnterFullMark("500");
			
	 }
	
	/*public void verifyAcademicYearFieldInAllBrowsers(){}

	/*
	 * @Test(priority = 4) public void verifyAcademicYearFieldInAllBrowsers() {
	 * 
	 * }
	 * 
	 * @Test(priority = 5) public void verifyColorChangeOnMouseHover() {
	 * 
	 * }
	 * 
	 * @Test(priority = 6) public void verifyTabNavigationInDropdown() {
	 * 
	 * }
	 

	@AfterMethod
	public void LogOut() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver);
		dp.clickOnUserName();
		Thread.sleep(1000);
		dp.ClickOnLogOut();
		

	} */

}
