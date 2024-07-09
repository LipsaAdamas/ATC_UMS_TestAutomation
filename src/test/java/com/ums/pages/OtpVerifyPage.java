package com.ums.pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class OtpVerifyPage {

	String applicationNo;

	// Create an Object of webdriver
	WebDriver ldriver;

	// Create constructor
	public OtpVerifyPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	@FindBy(xpath="//div[@class='alert alert-danger']")
	WebElement OTPAlert;
	public String getOTPAlert() {
		return OTPAlert.getText();
	}
	@FindBy(id="r_span")
	WebElement OTPTimer;
	public String OTPTimer() {
		return OTPTimer.getText();
	}
	@FindBy(xpath="//a[@id='resend']")
	WebElement ResendOTPLink;
	public void clickOnResendOTPLink() {
		ResendOTPLink.click();
	}
	 public boolean isResendOTPLinkEnabledAfterWait() {
	        // Wait for 1 minute (60 seconds)
	        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(60));

	        // Wait until the Resend OTP link is enabled
	        wait.until(ExpectedConditions.elementToBeClickable(ResendOTPLink));

	        // Return the enabled state of the Resend OTP link
	        return ResendOTPLink.isEnabled();
	    }

	@FindBy(xpath = "//h5[@style='text-align: center;']")
	WebElement AppNo;

	public void VerifyApplicationNumber() {
		String text = AppNo.getText();

		// Print the text to verify
		System.out.println("Text from the element: " + text);

		// Regex pattern to extract the Application No.
		String regex = "APP-\\d{4}-\\d{6}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		if (matcher.find()) {
			applicationNo = matcher.group(0);
			System.out.println("Extracted Application No.: " + applicationNo);
		} else {
			System.out.println("Application No. not found in the text.");
		}
	}
	public String getApplicationNumber() {
		return AppNo.getText();
	}

	@FindBy(id = "otp")
	WebElement OTP;

	public void EnterOTP(String otp) {
		OTP.sendKeys(otp);
	}

	@FindBy(id = "btn_otpVerify")
	WebElement Submitbtn;

	public void ClickOnSubmitBtn() {
		Submitbtn.click();
	}
}
