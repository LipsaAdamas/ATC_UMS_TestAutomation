package com.ums.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FeesPaymentPage {

	WebDriver ldriver;

	// Constructor
	public FeesPaymentPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[@class='btn btn-info btn-sm']")
	WebElement NotSubmitted;

	public void ClickOnApplicationStatus() {
		NotSubmitted.click();
	}

	public String GetApplicationStatus() {
		return NotSubmitted.getText();
	}

	@FindBy(xpath = "//a[@href='https://ums-qa.adamasuniversity.ac.in/admission/applicationPayment/677']")
	WebElement ApplicationPaymentStatus;

	public void ClickToPay() {
		ApplicationPaymentStatus.click();
	}

	@FindBy(xpath = "//span[@class='btn btn-danger btn-sm']")
	WebElement AdmissionPaymentStatus;

	public String GetAddmissionPaymentStatus() {
		return AdmissionPaymentStatus.getText();
	}

	@FindBy(xpath = "//a[@href='https://ums-qa.adamasuniversity.ac.in/admission/feesPayment']")
	WebElement FeesPayment;

	public void ClickOnFeesPayment() {
		FeesPayment.click();
	}

	@FindBy(xpath = "//a[@href='https://ums-qa.adamasuniversity.ac.in/admission/courseSelection']")
	WebElement ProgrammeSelection;

	public void ClickOnProgrammeSelection() {
		ProgrammeSelection.click();
	}

	@FindBy(xpath = "//a[@href='https://ums-qa.adamasuniversity.ac.in/admission/courseSelection']")
	WebElement UploadDocument;

	public void ClickOnUploadDocument() {
		UploadDocument.click();
	}

	@FindBy(xpath = "//a[@href='https://ums-qa.adamasuniversity.ac.in/admission/apply/education_informaion']")
	WebElement EducationalDetails;

	public void ClickOnEducationalDetails() {
		EducationalDetails.click();
	}

	@FindBy(xpath = "//a[@href='https://ums-qa.adamasuniversity.ac.in/admission/apply/basic_information']")
	WebElement BasicInformation;

	public void ClickOnBasicInformation() {
		BasicInformation.click();
	}
	@FindBy(xpath="//input[@id='apply_discount']")
	WebElement ApplyDiscount;
	public void clickOnApplyDiscount() {
		ApplyDiscount.click();
	}

	@FindBy(xpath="//input[@id='apply_scholarship']")
	WebElement ApplyScholarship;
	public void clickonApplyScholarship() {
		ApplyScholarship.click();
	}
	@FindBy(xpath="(//td[@style='text-align:right'])[1]")
	WebElement ActualAmount;
	public String getActualAmount() {
		return ActualAmount.getText();
	}
	@FindBy(xpath="(//td[contains(normalize-space(text()), '.00')])[4]")
	WebElement Discount;
	public String getDiscountAmount() {
		return Discount.getText();
	}
	@FindBy(xpath="(//td[contains(normalize-space(text()), '.00')])[5]")
	WebElement Scholarship;
	public String getScholarshipAmount() {
		return Scholarship.getText();
	}
	@FindBy(xpath="(//td[@style='text-align:right'])[2]")
	WebElement PayableAmount;
	public String getPayableAmount() {
		return PayableAmount.getText();
	}
	
	@FindBy(xpath = "(//input[@value='n'])[1]")
	WebElement radioNo;

	// Method to select the "No" radio button
	public void selectRadioNo() {
		if (!radioNo.isSelected()) {
			radioNo.click();
		}
	}

	@FindBy(xpath = "(//input[@value='y'])[1]")
	WebElement radioYes;

	// Method to select the "Yes" radio button
	public void selectRadioYes() {
		if (!radioYes.isSelected()) {
			radioYes.click();
		}
	}
	@FindBy(xpath="//input[@id='admission_payment_end_date']")
	WebElement ChangeAdmissionPaymentDate;
	public void enterAdmissionPaymentDate(String date) {
		ChangeAdmissionPaymentDate.sendKeys(date);
	}
	@FindBy(xpath="//button[@id='btn_submit_search']")
	WebElement update;
	public void clickonUpdateBtn() {
		update.click();
	}
	@FindBy(xpath="//a[@class='btn btn-sm yellow-gold close-window']")
	WebElement Back;
	public void clickonBackBtn() {
		Back.click();
	}
	@FindBy(xpath="//input[@id='discount_percentage']")
	WebElement DiscountPercent;
	public void enterDiscountPercent(String discount) {
		DiscountPercent.sendKeys(discount);
	}
	@FindBy(xpath="//input[@id='discount_flat']")
	WebElement DiscountFlat;
	public void enterDiscountFlat(String flatdis) {
		DiscountFlat.sendKeys(flatdis);
	}
	@FindBy(xpath="//button[@id='apply_discount_submit']")
	WebElement AplyDiscount;
	public void clickOnApplyDiscountbtn() {
		AplyDiscount.click();
	}
	@FindBy(xpath="//span[@id='select2-mst_schloarship-container']")
	WebElement ScholarshipType;
	public void EnterScholarshipType() {
		Select sl=new Select(ScholarshipType);
		sl.selectByIndex(4);
	}
	@FindBy(xpath="(//a[@class='accordion-toggle accordion-toggle-styled'])[1]")
	WebElement  ApplyScholarshipDiscount;
	public void clickonApplyScholarshipDiscount() {
		ApplyScholarshipDiscount.click();
	}
	@FindBy(xpath="(//a[@class='accordion-toggle accordion-toggle-styled'])[2]")
	WebElement  ChangeUpdateAdmissionPaymentDetails;
	public void clickonChangeUpdateAdmissionPaymentDetails() {
		ChangeUpdateAdmissionPaymentDetails.click();
	}
	
	

}
