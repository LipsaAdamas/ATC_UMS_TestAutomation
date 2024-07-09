package com.ums.testcases;

import java.math.BigDecimal;
import java.util.ArrayList;
import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.math.RoundingMode;
import com.ums.pages.BasicDetailsPage;
import com.ums.pages.CourseWiseApplication;
import com.ums.pages.DashboardPage;
import com.ums.pages.EducationalDetailsPage;
import com.ums.pages.FeesPaymentPage;
import com.ums.pages.LoginPage;
import com.ums.pages.ProgrammeSelectionPage;
import com.ums.pages.UploadDocumentPage;

public class TC4_AdminLogin_Admission_VerifyCouseWiseApplication_PaymentTest extends BaseClass {
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

	@Test
	public void VerifyPaymentFunctionality() throws InterruptedException {

		CourseWiseApplication cp = new CourseWiseApplication(driver);
	    cp.ClickOnSearchApplication();
	    cp.EnterApplicationNum(applicationNo);
	    cp.ClickonSearch();
	    cp.ClickOnEditApplication();

	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

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
	    Thread.sleep(1000);
	    ep.enterObtainMark6th12("89");
	   ep.ClickOnUpdateNext();
	    UploadDocumentPage up = new UploadDocumentPage(driver);
	    up.ClickOnUpdateNext();
	    ProgrammeSelectionPage ps = new ProgrammeSelectionPage(driver);
	    ps.ClickOnFeesPayment();

	    FeesPaymentPage fp = new FeesPaymentPage(driver);
	    fp.clickOnApplyDiscount();
	    fp.enterDiscountFlat("500");
	    fp.clickOnApplyDiscountbtn();
	   // WebDriverWait wait = new WebDriverWait(driver, 10);
       // wait.until(ExpectedConditions.alertIsPresent());
	    Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(1000);
        
	    String actualAmountStr = fp.getActualAmount();
	    System.out.println("Actualamount"+actualAmountStr);
	    String discountAmountStr = fp.getDiscountAmount();
	    System.out.println("Discounted Amount"+discountAmountStr);
	    String scholarshipStr = fp.getScholarshipAmount();
	    System.out.println("Schol Amount"+scholarshipStr);
	    String payableAmountStr = fp.getPayableAmount();
	    System.out.println("Pay Amonunt"+payableAmountStr);

	    // Convert strings to BigDecimal for precise arithmetic operations
        BigDecimal actualAmount = new BigDecimal(actualAmountStr.replace(",", ""));
        BigDecimal discountAmount = new BigDecimal(discountAmountStr.replace(",", ""));
        BigDecimal scholarshipAmount = new BigDecimal(scholarshipStr.replace(",", ""));
        BigDecimal payableAmount = new BigDecimal(payableAmountStr.replace(",", ""));

        // Calculate expected payable amount
        BigDecimal expectedPayableAmount = actualAmount.subtract(discountAmount).subtract(scholarshipAmount);

        // Assertion to verify if the payable amount is correct, considering possible precision issues
        BigDecimal delta = new BigDecimal("0.01"); // Set a small delta for floating-point comparison
        Assert.assertEquals(payableAmount.setScale(2, RoundingMode.HALF_UP), expectedPayableAmount.setScale(2, RoundingMode.HALF_UP), 
                            "Payable amount is not correct after deductions. Expected: " + expectedPayableAmount + ", but got: " + payableAmount);
   
	  
		

	}
	

}
