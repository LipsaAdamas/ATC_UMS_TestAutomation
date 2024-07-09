package com.ums.testcases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ums.pages.BasicDetailsPage;
import com.ums.pages.CourseWiseApplication;
import com.ums.pages.DashboardPage;
import com.ums.pages.EducationalDetailsPage;
import com.ums.pages.LoginPage;
import com.ums.pages.UploadDocumentPage;

import org.testng.Assert;
public class TC5_AdminLogin_Admission_VerifyCouseWiseApplication_EducationalDetails extends BaseClass {
	String applicationNo = "APP-2024-115377";

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

	@Test(enabled =  false)
	public void VerifySubjectIsAddedInEducationalDetails() throws InterruptedException {

		CourseWiseApplication cp = new CourseWiseApplication(driver);
	    cp.ClickOnSearchApplication();
	    cp.EnterApplicationNum(applicationNo);
	    cp.ClickonSearch();
	    cp.ClickOnEditApplication();

	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

	    String originalTab = tabs.get(0);
	    // Switch to the new tab
	    driver.switchTo().window(tabs.get(1));

	    BasicDetailsPage bp = new BasicDetailsPage(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, 3000)");
	    bp.ClickOnSaveAndNext();
	    EducationalDetailsPage ep = new EducationalDetailsPage(driver);
	    ep.ClickOnClass12th();
	    Thread.sleep(300);
	    ep.SelectSubject1st12();
	    Thread.sleep(300);
	    ep.SelectSubject2nd12();
	    ep.SelectSubject3rd12();
	    ep.SelectSubject4th12();
	    ep.SelectSubject5th12();
	    ep.SelectSubject6th12();
	    ep.enterFullMark1st12("100");
	    ep.enterFullMark2nd12("100");
	    ep.enterFullMark3rd12("100");
	    ep.enterFullMark4th12("100");
	    ep.enterFullMark5th12("100");
	    ep.enterFullMark6th12("100");

	    ep.enterObtainMark1st12("90");
	    ep.enterObtainMark2nd12("85");
	    ep.enterObtainMark3rd12("95");
	    ep.enterObtainMark4th12("88");
	    ep.enterObtainMark5th12("92");
	    
	    ep.enterObtainMark6th12("89");
	   ep.ClickOnUpdateNext();
	   
	   
	   String successMessageText = driver.findElement(By.cssSelector("div#toast-container div.toast.toast-success div.toast-message")).getText();
	    Assert.assertTrue(successMessageText.contains("Changes have been updated successfully."), "Success message not displayed or incorrect.");
	    
	    
	    
	    UploadDocumentPage up=new UploadDocumentPage(driver);
	    driver.close();

	    // Switch back to the original tab
	    driver.switchTo().window(originalTab);

	    
	   cp.clickOnUserName();
	    cp.ClickOnLogOut();
	   
	}
	@Test(priority = 2)
	
	public void verifyEducationalDetails() {
		
		CourseWiseApplication cp = new CourseWiseApplication(driver);
	    cp.ClickOnSearchApplication();
	    cp.EnterApplicationNum(applicationNo);
	    cp.ClickonSearch();
	    
		
	}
}
