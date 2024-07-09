package com.ums.testcases;
	
	import static org.testng.Assert.assertEquals;
	import static org.testng.Assert.assertTrue;

	import java.io.IOException;
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

	public class TC3_AdminLogin_Admission_VerifyCouseWiseApplicationTest  extends BaseClass {

		String applicationNo = "APP-2024-115334";

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

			@Test(priority = 1)
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
			public void verifyEditApplicationFunctionalityAndLogout() throws InterruptedException {

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
}
