package com.ums.admission.testcases;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ums.pages.CourseWiseApplication;
import com.ums.pages.DashboardPage;
import com.ums.pages.LoginPage;

public class TC_AdminLogin_Admission_CousewiseApplicationTest extends BaseClass{

	@Test(priority = 1)
	public void VerifySearchApplicantWithApplicationNum() {
		String applicationNo="APP-2024-115334";
		driver.get(adminLoginUrl);
		logger.info("Url Opened");
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName("admin@adamas.com");
		lp.enterPassWord("123456");
		lp.clickOnLoginbtn();
		DashboardPage dp=new DashboardPage(driver);
		dp.ExpandAdmission();
		dp.ClickOnCourseWiseApplication();
		CourseWiseApplication cp=new CourseWiseApplication(driver) ;
		cp.ClickOnSearchApplication();
		cp.EnterApplicationNum(applicationNo);
		cp.ClickonSearch();
		String actualApplicationNum = cp.AppicationNumField();
		Assert.assertEquals(actualApplicationNum, applicationNo, "Application number doesn't match.");
		
	} 
	@Test(priority = 2)
	public void VerifySearchApplicant2() {
		driver.get(adminLoginUrl);
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName("admin@adamas.com");
		lp.enterPassWord("123456");
		lp.clickOnLoginbtn(); 
		DashboardPage dp=new DashboardPage(driver);
		dp.ExpandAdmission();
		dp.ClickOnCourseWiseApplication();
		CourseWiseApplication cp=new CourseWiseApplication(driver) ;
		
	} 
	
	
	
	
}
