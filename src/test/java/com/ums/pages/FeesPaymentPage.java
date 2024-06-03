package com.ums.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeesPaymentPage {

	WebDriver ldriver;

	// Constructor
	public FeesPaymentPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//span[@class='btn btn-info btn-sm']")
	WebElement NotSubmitted;
	public void ClickOnApplicationStatus() {
		NotSubmitted.click();
	}
	public String GetApplicationStatus() {
		 return NotSubmitted.getText();
	}
	@FindBy(xpath="//a[@href='https://ums-qa.adamasuniversity.ac.in/admission/applicationPayment/677']")
	WebElement ApplicationPaymentStatus;
	public void ClickToPay() {
		ApplicationPaymentStatus.click();
	}
	@FindBy(xpath="//span[@class='btn btn-danger btn-sm']")
	WebElement AdmissionPaymentStatus;
	public String GetAddmissionPaymentStatus() {
		return AdmissionPaymentStatus.getText();
	}
	@FindBy(xpath="//a[@href='https://ums-qa.adamasuniversity.ac.in/admission/feesPayment']")
	WebElement FeesPayment;
	public void ClickOnFeesPayment() {
		FeesPayment.click();
	}
	@FindBy(xpath="//a[@href='https://ums-qa.adamasuniversity.ac.in/admission/courseSelection']")
	WebElement ProgrammeSelection;
	public void ClickOnProgrammeSelection() {
		ProgrammeSelection.click();
	}
	@FindBy(xpath="//a[@href='https://ums-qa.adamasuniversity.ac.in/admission/courseSelection']")
	WebElement UploadDocument;
	public void ClickOnUploadDocument() {
		UploadDocument.click();
	}
	@FindBy(xpath="//a[@href='https://ums-qa.adamasuniversity.ac.in/admission/apply/education_informaion']")
	WebElement EducationalDetails;
	public void ClickOnEducationalDetails() {
		EducationalDetails.click();
	}
	@FindBy(xpath="//a[@href='https://ums-qa.adamasuniversity.ac.in/admission/apply/basic_information']")
	WebElement BasicInformation;
	public void ClickOnBasicInformation() {
		BasicInformation.click();
	}
	
}
