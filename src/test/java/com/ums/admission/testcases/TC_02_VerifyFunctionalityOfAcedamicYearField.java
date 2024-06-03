package com.ums.admission.testcases;

import org.testng.annotations.Test;

import com.ums.pages.CourseWiseApplication;
import com.ums.pages.DashboardPage;
import com.ums.pages.LoginPage;
import com.ums.pages.WelcomePage;

import tech.grasshopper.pdf.section.dashboard.Dashboard;

public class TC_02_VerifyFunctionalityOfAcedamicYearField extends BaseClass{
	
	
	DashboardPage db=new DashboardPage(driver);
	CourseWiseApplication ca= new CourseWiseApplication(driver);
	public void VerifyAdminLogin() {
		
	WelcomePage	wp=new WelcomePage(driver);
	wp.clickOnAdminLogin();
		
	}
	@Test(enabled =  false)
	public void LoginPageVerification() {
		LoginPage lp=new LoginPage(driver);
		lp.EnterUserName("admin@adamas.com");
		lp.EnterPassWord("123456");
		lp.ClickOnLoginBtn();
	}
	@Test(enabled =  false)
	public void clickOnAdmission() {
		
	
		db.ExpandAdmission();
		db.ClickOnApplicantList();
		db.ClickOnCourseWiseApplication();
		}
	@Test(enabled =  false)
    public void clickOnCouseWiseApplication() {
		
		ca.SelectAcademicYearOptionFromDropdown(Browser);
		
		
		}

    

}
