package com.ums.admission.testcases;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.ums.pages.ApplicantLoginPage;
import com.ums.pages.BasicDetailsPage;
import com.ums.pages.OtpVerifyPage;
import com.ums.pages.ReadInstuctionPage;
import com.ums.pages.RegistationPage;

public class RegPageTest extends BaseClass {
    RegistationPage rp;
    String expectedUserName = "LIPSA DAS  ";
    JavascriptExecutor js;
    ReadInstuctionPage ip;
    ApplicantLoginPage ap;

    @Test
    public void verifyCreateNewAccountBtn() throws InterruptedException {
        ap = new ApplicantLoginPage(driver);
        ap.clickOnCreateNewAccount();
        logger.info("Clicked On Create New Account");
        // driver.close(); // Avoid closing the browser here if you want to run multiple tests
    }

    @Test
    public void verifyReadInstructionBtn() throws InterruptedException {
        ap = new ApplicantLoginPage(driver);
        ap.clickOnCreateNewAccount();
        logger.info("Clicked On Create New Account");
        ip = new ReadInstuctionPage(driver);
        ip.ClickOnReadInstucation();
        logger.info("Clicked On ReadInstruction");
    }
}



