package com.ums.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver ldriver;

	// Constructor
	public DashboardPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// identify webelement
	@FindBy(xpath = "//span[@class='title'][normalize-space()='Admission']")
	WebElement Admission;

	// identify action on webelement
	public void ExpandAdmission() {
		Admission.click();
	}
	@FindBy(xpath = "//span[@class=\"title\"][normalize-space()='Course Wise Application']")
	WebElement CourseWiseApplication;

	// identify action on webelement
	public void ClickOnCourseWiseApplication() {
		CourseWiseApplication.click();
	}
	@FindBy(xpath = "//span[@class='title'][normalize-space()='Incomplete Application']")
	WebElement IncompleteApplication;

	// identify action on webelement
	public void ClickOnIncompleteApplication() {
		IncompleteApplication.click();
	}
	@FindBy(xpath = "///span[@class='title'][normalize-space()='Cancel Admission']")
	WebElement CancelAdmission ;

	// identify action on webelement
	public void ClickOnCancelAdmission() {
		CancelAdmission.click();
	}
	@FindBy(xpath = "///span[@class='title'][normalize-space()='Approved Cancel ']")
	WebElement ApprovedCancel ;

	// identify action on webelement
	public void ClickOnApprovedCancel() {
		ApprovedCancel.click();
	}
	@FindBy(xpath = "///span[@class=\"title\"][normalize-space()=\" Pending Verification \"]")
	WebElement  PendingVerification  ;

	// identify action on webelement
	public void ClickOnPendingVerification() {
		PendingVerification.click();
	}
	@FindBy(xpath = "///span[@class=\"title\"][normalize-space()=\"Not logged IN ERP\"]")
	WebElement  NotloggedINERP  ;

	// identify action on webelement
	public void ClickOnNotloggedINERP() {
		NotloggedINERP.click();
	}
	@FindBy(xpath = "///span[@class=\"title\"][normalize-space()=\"logged IN Pending \"]")
	WebElement  loggedINPending   ;

	// identify action on webelement
	public void ClickOnloggedINPending() {
		loggedINPending.click();
	}
	@FindBy(xpath = "///span[@class=\"title\"][normalize-space()=\"Programme Transfer\"]")
	WebElement  ProgrammeTransfer   ;

	// identify action on webelement
	public void ClickOnProgrammeTransfer() {
		ProgrammeTransfer.click();
	}
	@FindBy(xpath = "///span[@class=\"title\"][normalize-space()=\"Applicant List\"]")
	WebElement  ApplicantList   ;

	// identify action on webelement
	public void ClickOnApplicantList() {
		ApplicantList.click();
	}
	@FindBy(xpath="//span[@class='username username-hide-on-mobile']")
	WebElement UserName;
	public void clickOnUserName() {
		UserName.click();
	}
	@FindBy(xpath="//a[@href='https://ums-qa.adamasuniversity.ac.in/backend/logout']")
	WebElement LogOut;
	public void ClickOnLogOut() {
		LogOut.click();
	}
}
