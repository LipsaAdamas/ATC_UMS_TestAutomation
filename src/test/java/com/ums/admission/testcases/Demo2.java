package com.ums.admission.testcases;



import static org.testng.Assert.*;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ums.pages.ApplicantLoginPage;
import com.ums.pages.BasicDetailsPage;
import com.ums.pages.OtpVerifyPage;
import com.ums.pages.ReadInstuctionPage;
import com.ums.pages.RegestationPage;
import com.ums.utility.ReadExcelFile;

public class Demo2 extends BaseClass {

    JavascriptExecutor js;

    // Test 1: Verify Page Title
    @Test
    public void verifyPageTitle() {
        RegestationPage rp = new RegestationPage(driver);
        String expectedTitle = "New Candidate - Registration";
        String actualTitle = rp.getPageTitle();
        assertEquals(actualTitle, expectedTitle, "Page title does not match, not on the registration page");
    }

    // Test 2: Valid Registration
    @Test(dataProvider = "ValidRegDataProvider")
    public void validRegistration(String FirstName, String MiddleName, String LastName, 
                                  String Programme, String EmailAddress, String Password,
                                  String ConfirmPassword, String expectedUserName) throws IOException, InterruptedException {
        registerUser(FirstName, MiddleName, LastName, Programme, EmailAddress, Password, ConfirmPassword, expectedUserName);
    }

    // Test 3: Registration with Invalid Email
    @Test
    public void registrationWithInvalidEmail() throws IOException, InterruptedException {
        String FirstName = "Test";
        String MiddleName = "User";
        String LastName = "InvalidEmail";
        String Programme = "UG";
        String EmailAddress = "invalid-email";
        String Password = "Password@123";
        String ConfirmPassword = "Password@123";

        ApplicantLoginPage ap = new ApplicantLoginPage(driver);
        ap.clickOnCreateNewAccount();
        Thread.sleep(3000);

        ReadInstuctionPage ip = new ReadInstuctionPage(driver);
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(3000);
        ip.ClickOnReadInstucation();

        RegestationPage rp = new RegestationPage(driver);
        rp.EnterFirstName(FirstName);
        rp.EnterMiddleName(MiddleName);
        rp.EnterLastName(LastName);
        rp.SelectProgramme(Programme);
        rp.EnterEmail(EmailAddress);
        rp.EnterMobileNo("6304061157");
        rp.EnterPassWord(Password);
        rp.EnterConfirmPassword(ConfirmPassword);

        js.executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(3000);
        rp.ClickOnReadInstuctionCB();
        rp.ClickOnRegister();

        // Verify error message for invalid email
       //String errorMessage = rp.getEmailErrorMessage();
       // assertEquals(errorMessage, "Please enter a valid email address", "Error message for invalid email is not displayed correctly");
    }

    // Test 4: Registration with Mismatched Passwords
    @Test
    public void registrationWithMismatchedPasswords() throws IOException, InterruptedException {
        String FirstName = "Test";
        String MiddleName = "User";
        String LastName = "MismatchPassword";
        String Programme = "UG";
        String EmailAddress = "test.mismatch@domain.com";
        String Password = "Password@123";
        String ConfirmPassword = "Password@124"; // Mismatched password

        ApplicantLoginPage ap = new ApplicantLoginPage(driver);
        ap.clickOnCreateNewAccount();
        Thread.sleep(3000);

        ReadInstuctionPage ip = new ReadInstuctionPage(driver);
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(3000);
        ip.ClickOnReadInstucation();

        RegestationPage rp = new RegestationPage(driver);
        rp.EnterFirstName(FirstName);
        rp.EnterMiddleName(MiddleName);
        rp.EnterLastName(LastName);
        rp.SelectProgramme(Programme);
        rp.EnterEmail(EmailAddress);
        rp.EnterMobileNo("6304061157");
        rp.EnterPassWord(Password);
        rp.EnterConfirmPassword(ConfirmPassword);

        js.executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(3000);
        rp.ClickOnReadInstuctionCB();
        rp.ClickOnRegister();

        // Verify error message for mismatched passwords
       // String errorMessage = rp.getPasswordMismatchErrorMessage();
      //  assertEquals(errorMessage, "Passwords do not match", "Error message for mismatched passwords is not displayed correctly");
    }

    // Test 5: Registration with Missing Required Fields
    @Test
    public void registrationWithMissingFields() throws IOException, InterruptedException {
        String FirstName = "";
        String MiddleName = "";
        String LastName = "";
        String Programme = "";
        String EmailAddress = "";
        String Password = "";
        String ConfirmPassword = "";

        ApplicantLoginPage ap = new ApplicantLoginPage(driver);
        ap.clickOnCreateNewAccount();
        Thread.sleep(3000);

        ReadInstuctionPage ip = new ReadInstuctionPage(driver);
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(3000);
        ip.ClickOnReadInstucation();

        RegestationPage rp = new RegestationPage(driver);
        rp.EnterFirstName(FirstName);
        rp.EnterMiddleName(MiddleName);
        rp.EnterLastName(LastName);
        rp.SelectProgramme(Programme);
        rp.EnterEmail(EmailAddress);
        rp.EnterMobileNo("6304061157");
        rp.EnterPassWord(Password);
        rp.EnterConfirmPassword(ConfirmPassword);

        js.executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(3000);
        rp.ClickOnReadInstuctionCB();
        rp.ClickOnRegister();

        // Verify error messages for missing required fields
       // assertTrue(rp.isFirstNameErrorDisplayed(), "Error message for missing first name is not displayed");
       // assertTrue(rp.isLastNameErrorDisplayed(), "Error message for missing last name is not displayed");
       // assertTrue(rp.isProgrammeErrorDisplayed(), "Error message for missing programme is not displayed");
       // assertTrue(rp.isEmailErrorDisplayed(), "Error message for missing email is not displayed");
        //assertTrue(rp.isPasswordErrorDisplayed(), "Error message for missing password is not displayed");
    }

    @DataProvider(name = "ValidRegDataProvider")
    public String[][] validRegDataProvider() {
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

    private void registerUser(String FirstName, String MiddleName, String LastName, 
                              String Programme, String EmailAddress, String Password,
                              String ConfirmPassword, String expectedUserName) throws IOException, InterruptedException {
        
        ApplicantLoginPage ap = new ApplicantLoginPage(driver);
        ap.clickOnCreateNewAccount();
        Thread.sleep(3000);
        
        ReadInstuctionPage ip = new ReadInstuctionPage(driver);
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

        Thread.sleep(3000);
        rp.EnterDay("14");
        rp.SelectMonth();
        rp.EntertYear("1998");

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

        js.executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(3000);
        rp.ClickOnReadInstuctionCB();
        rp.ClickOnRegister();

        OtpVerifyPage otp = new OtpVerifyPage(driver);
        otp.VerifyApplicationNumber();
        otp.EnterOTP("123456");
        otp.ClickOnSubmitBtn();
        
        BasicDetailsPage bp = new BasicDetailsPage(driver);
        Thread.sleep(10000);
        String actualUserName = bp.getUserName();
        //String actualEmail = bp.getEmail(); // Assuming there is a method to get the email
       // String actualProgramme = bp.getProgramme(); // Assuming there
}
    
    
}