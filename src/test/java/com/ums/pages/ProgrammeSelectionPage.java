package com.ums.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProgrammeSelectionPage {

	WebDriver ldriver;

	// Constructor
	public ProgrammeSelectionPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(xpath="//select[@class='form-control course_subject']")
	WebElement PrefProgrammeInAdmin;
	public void SelectProgrammeInAdmin(String prog) {
		Select sl=new Select(PrefProgrammeInAdmin);
		sl.selectByVisibleText(prog);
		
	}
	@FindBy(xpath="//select[@class='form-control clg_dept']")
	WebElement DepartmentInAdmin;
	public void SelectDepartmentInAdmin(String dep) {
		Select sl=new Select(DepartmentInAdmin);
		sl.selectByVisibleText(dep);
	}
	
	@FindBy(xpath="//select[@id='advisor_id']")
	WebElement AcademicAdvisorName;
	public void SelectAcademicAdvisorName(String name) {
		Select sl=new Select(AcademicAdvisorName);
		sl.selectByVisibleText(name);
	}
	@FindBy(xpath="(//a[@class='accordion-toggle accordion-toggle-styled'])[1]")
	WebElement AcademicAdvisor;
	public void ClickOnAcademicAdvisor() {
		AcademicAdvisor.click();
	}
	@FindBy(xpath="(//a[@class='accordion-toggle accordion-toggle-styled'])[2]")
	WebElement AssignCounsellor;
	public void ClickOnAssignCounsellor() {
		AssignCounsellor.click();
	}
	@FindBy(xpath="//select[@id='counselor_id']")
	WebElement CounsellorName;
	public void SelectCounsellorName(String counslName) {
		Select sl=new Select(CounsellorName);
		sl.selectByVisibleText(counslName);
	}
	
	@FindBy(xpath="(//a[@class='accordion-toggle accordion-toggle-styled'])[3]")
	WebElement AuatDetails;
	public void ClickOnAuatDetails() {
		AuatDetails.click();
	}
	@FindBy(xpath="//select[@id='adm_test_venue_id']")
	WebElement Venue;
	public void SelectVenue(String venue) {
		Select sl=new Select(Venue);
		sl.selectByVisibleText(venue);
	}
	@FindBy(xpath="//select[@id='adm_slot_id']")
	WebElement Slot;
	public void SelectSlot(String slot) {
		Select sl=new Select(Slot);
		sl.selectByVisibleText(slot);
	}
	@FindBy(xpath="//input[@id='auat_date']")
	WebElement AuatDate;
	public void ClickOnAuatDate() {
		AuatDate.click();
	}

	@FindBy(xpath = "//select[@name='course_subject[0]']")
	WebElement Programme1st;

	public void SelectProgramme(String prog) {
		Select Prog = new Select(Programme1st);
		Prog.selectByVisibleText(prog);
	}

	@FindBy(xpath = "//select[@name='clg_dept[0]']")
	WebElement Department1st;

	public void SelectDepartment(String dept) {
		Select Dept = new Select(Department1st);
		Dept.selectByVisibleText(dept);
	}

	@FindBy(xpath = "//input[@name='btn_rem']")
	WebElement Remove1st;

	public void ClickOnRemove1st() {
		Remove1st.click();
	}

	@FindBy(xpath = "//input[@id='add_qua']")
	WebElement AddQue1st;

	public void ClickOnAddQue1st() {
		AddQue1st.click();
	}

	@FindBy(xpath = "//input[@name='declaration']")
	WebElement declaration;

	public void AcceptDeclaration() {
		if (!declaration.isSelected()) {
			Actions actions = new Actions(ldriver);
			actions.moveToElement(declaration).click().perform();
		}
	}
	@FindBy(xpath="//textarea[@name='purpose_statement']")
	WebElement Statement;
	public void EnterStatementOfPurpose(String comment) {
		Statement.sendKeys(comment);
	}
	@FindBy(xpath="//button[@id='course_selection_btn']")
	WebElement SaveAndNext;
	public void ClickOnSaveAndNext() {
		SaveAndNext.click();
	}
	@FindBy(xpath="//i[@class='fa fa-credit-card fa-3x']")
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
