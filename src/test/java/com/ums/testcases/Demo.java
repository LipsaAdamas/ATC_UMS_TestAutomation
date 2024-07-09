package com.ums.testcases;



import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ums.pages.ApplicantLoginPage;
import com.ums.pages.BasicDetailsPage;
import com.ums.pages.OtpVerifyPage;
import com.ums.pages.ReadInstuctionPage;
import com.ums.pages.RegistationPage;

public class Demo extends BaseClass {

    String expectedMessage = "OTP verified successfully";
    String expectedUserName = "GOLU BHARTI ";
    ReadInstuctionPage ip;
    RegistationPage rp;
    JavascriptExecutor js;

    @BeforeMethod
    public void Setup() throws InterruptedException {
        driver.get(applicantLoginUrl);

        ApplicantLoginPage ap = new ApplicantLoginPage(driver);
        ap.clickOnCreateNewAccount();
        Thread.sleep(3000);
        ip = new ReadInstuctionPage(driver);
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(3000);
        ip.ClickOnReadInstucation();
        rp = new RegistationPage(driver);
        rp.EnterFirstName("Golu");
        rp.EnterMiddleName("Kumar");
        rp.EnterLastName("Bharti");
        Thread.sleep(1000);
        rp.EnterDay("14");
        rp.SelectMonth();
        rp.EntertYear("1998");
        rp.SelectProgramme("UG");
        rp.EnterEmail("lipsadas108@gmail.com");
        rp.EnterMobileNo("6304061157");
        rp.EnterPassWord("Onepiece@1");
        rp.EnterConfirmPassword("Onepiece@1");
        js.executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(1000);
        rp.ClickOnReadInstuctionCB();
        rp.ClickOnRegister();
    }

    @Test(enabled = false)
    public void TC2A_UMS_OTP_Received() throws IOException, InterruptedException {
        OtpVerifyPage otp = new OtpVerifyPage(driver);
        otp.VerifyApplicationNumber();
        otp.EnterOTP("123456");
        otp.ClickOnSubmitBtn();

        BasicDetailsPage bp = new BasicDetailsPage(driver);
        Thread.sleep(5000);
        String actualMessage = bp.getOTPSuccessToastMessage();
        System.out.println("Actual Application success message: " + actualMessage);

        Assert.assertEquals(actualMessage.trim(), expectedMessage.trim(), "OTP success message validation failed");
        String actualUserName = bp.getUserName();
        System.out.println(actualUserName);
        assertEquals(actualUserName.trim(), expectedUserName.trim());

        bp.ClickOnUserName();
        bp.ClickOnSignOutBtn();
    }

    @Test(enabled = false)
    public void TC2B_UMS_OTP_ValidInput() throws IOException, InterruptedException {
        OtpVerifyPage otp = new OtpVerifyPage(driver);
        otp.VerifyApplicationNumber();
        otp.EnterOTP("123456");
        otp.ClickOnSubmitBtn();

        BasicDetailsPage bp = new BasicDetailsPage(driver);
        Thread.sleep(5000);
        String actualMessage = bp.getOTPSuccessToastMessage();

        Assert.assertEquals(actualMessage.trim(), expectedMessage.trim(), "OTP success message validation failed");
        
    }

    @Test(priority = 3)
    public void TC2C_UMS_OTP_InvalidInput() throws IOException, InterruptedException {
        OtpVerifyPage otp = new OtpVerifyPage(driver);
        otp.VerifyApplicationNumber();
        otp.EnterOTP("123466");
        otp.ClickOnSubmitBtn();

        String actualAlert = otp.getOTPAlert();
        String expectedAlert = "Invalid OTP.";
        Assert.assertEquals(actualAlert.trim(), expectedAlert.trim(), "OTP success message validation failed");
    }

    @Test(priority = 4)
    public void TC2D_UMS_OTP_ResendOTP() throws IOException, InterruptedException {
        OtpVerifyPage otp = new OtpVerifyPage(driver);
        otp.VerifyApplicationNumber();
        otp.isResendOTPLinkEnabledAfterWait();
        boolean isResendEnabled = otp.isResendOTPLinkEnabledAfterWait();

        Assert.assertTrue(isResendEnabled, "Resend OTP link is not enabled after 1 minute");
    }

    @Test(priority = 5)
    public void TC2E_UMS_OTP_BlankField() throws IOException, InterruptedException {
        String expectedAlert = "The otp field is required.";
        OtpVerifyPage otp = new OtpVerifyPage(driver);
        otp.VerifyApplicationNumber();
        otp.ClickOnSubmitBtn();

        String actualAlert = otp.getOTPAlert();
        Assert.assertEquals(actualAlert.trim(), expectedAlert.trim(), "OTP Blank field validation failed");
    }

    @Test(priority = 6)
    public void TC2G_UMS_OTP_CaseSensitivity() throws IOException, InterruptedException {
        String expectedAlert = "Invalid OTP.";
        OtpVerifyPage otp = new OtpVerifyPage(driver);
        otp.VerifyApplicationNumber();
        otp.EnterOTP("1r34T6");
        otp.ClickOnSubmitBtn();

        String actualAlert = otp.getOTPAlert();
        Assert.assertEquals(actualAlert.trim(), expectedAlert.trim(), "OTP case sensitivity validation failed");
    }
}

