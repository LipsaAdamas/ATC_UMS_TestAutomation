package com.ums.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CourseWiseApplication {
	WebDriver ldriver;

	// Constructor
	public CourseWiseApplication(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// identify webelement
	@FindBy(xpath = "//a[@class=\"expand\"]")
	WebElement SearchApplication;

	// identify action on webelement
	public void ClickOnSearchApplication() {
		SearchApplication.click();
	}

	@FindBy(xpath = "//select[@id=\"academic_yr\"]")
	List<WebElement> AcademicYearMenu;

	// identify action on webelement
	public void SelectAcademicYearOptionFromDropdown(String yearOptionText) {
		for (WebElement YearDropdownMenu : AcademicYearMenu) {
			Select dropdown = new Select(YearDropdownMenu);
			dropdown.selectByVisibleText(yearOptionText);
		}
	}

	@FindBy(xpath = "//input[@id=\"name\"]")
	WebElement Name;

	public void EnterName(String name) {
		Name.sendKeys(name);

	}

	@FindBy(xpath = "//input[@id=\"mobile\"]")
	WebElement Mobile;

	// Action on WebElement
	public void EnterMobileNum(String mobileNum) {
		Mobile.sendKeys(mobileNum);
	}

	@FindBy(xpath = "//input[@id=\"application_no\"]")
	WebElement Application;

	// Action on WebElement
	public void EnterApplicationNum(String applicationNum) {
		Application.sendKeys(applicationNum);
	}

	// Identify WebElement
	@FindBy(xpath = "//select[@id=\"gender\"]")
	List<WebElement> GenderMenu;

	// Action on WebElement
	public void SelectGenderFromDropdown(String genderoptionText) {
		for (WebElement genderDropdownMenu : GenderMenu) {
			Select dropdown = new Select(genderDropdownMenu);
			dropdown.selectByVisibleText(genderoptionText);
		}
	}

	// Identify WebElement
	@FindBy(xpath = "//span[@id='select2-t_mst_category_id-container']")
	List<WebElement> CategoryMenu;

	// Action on WebElement
	public void SelectCategoryFromDropdown(String categoryoptionText) {
		for (WebElement categoryDropdownMenu : CategoryMenu) {
			Select dropdown = new Select(categoryDropdownMenu);
			dropdown.selectByVisibleText(categoryoptionText);
		}
	}

	// Identify WebElement
	@FindBy(xpath = "//select[@id=\"t_rel_school_id\"]")
	List<WebElement> SelectSchoolMenu;

	// Action on WebElement
	public void SelectSchoolFromDropdown(String selectschooloptiontext) {
		for (WebElement SelectSchoolDropdownMenu : SelectSchoolMenu) {
			Select dropdown = new Select(SelectSchoolDropdownMenu);
			dropdown.selectByVisibleText(selectschooloptiontext);
		}
	}

	// Identify WebElement
	@FindBy(xpath = "//select[@id='department_id']")
	List<WebElement> SelectDepartmentMenu;

	// Action on WebElement
	public void SelectDepartmentFromDropdown(String SelectDepartmentoptiontext) {
		for (WebElement SelectDepartmentDropdownMenu : SelectDepartmentMenu) {
			Select dropdown = new Select(SelectDepartmentDropdownMenu);
			dropdown.selectByVisibleText(SelectDepartmentoptiontext);
		}
	}

	// Identify WebElement
	@FindBy(xpath = "//span[@id=\"select2-t_rel_programme_id-container\"]")
	List<WebElement> ProgrammeLevelMenu;

	// Action on WebElement
	public void SelectProgrammeLevelFromDropdown(String Programmeleveloptiontext) {
		for (WebElement ProgrammeLevelDropdownMenu : ProgrammeLevelMenu) {
			Select dropdown = new Select(ProgrammeLevelDropdownMenu);
			dropdown.selectByVisibleText(Programmeleveloptiontext);
		}
	}

	// Identify WebElement
	@FindBy(xpath = "//span[@id=\"select2-course_subject_id-container\"]")
	List<WebElement> SelectProgrammeMenu;

	// Action on WebElement
	public void SelectProgrammeFromDropdown(String SelectProgrammeoptiontext) {
		for (WebElement SelectProgrammeDropdownMenu : SelectProgrammeMenu) {
			Select dropdown = new Select(SelectProgrammeDropdownMenu);
			dropdown.selectByVisibleText(SelectProgrammeoptiontext);
		}
	}

	// Identify WebElement
	@FindBy(xpath = "//select[@id=\"doc_verification_type\"]")
	List<WebElement> VerificationTypeMenu;

	// Action on WebElement
	public void VerificationTypeFromDropdown(String VerificationTypeoptiontext) {
		for (WebElement VerificationTypeDropdownMenu : VerificationTypeMenu) {
			Select dropdown = new Select(VerificationTypeDropdownMenu);
			dropdown.selectByVisibleText(VerificationTypeoptiontext);
		}
	}

	// Identify WebElement
	@FindBy(xpath = "//select[@id=\"addmission_payment_received\"]")
	List<WebElement> AddmissionPaymentReceivedMenu;

	// Action on WebElement
	public void AddmissionPaymentReceivedFromDropdown(String AddmissionPaymentReceivedoptiontext) {
		for (WebElement AddmissionPaymentReceivedDropdownMenu : AddmissionPaymentReceivedMenu) {
			Select dropdown = new Select(AddmissionPaymentReceivedDropdownMenu);
			dropdown.selectByVisibleText(AddmissionPaymentReceivedoptiontext);
		}
	}

	// Identify WebElement
	@FindBy(xpath = "//select[@id=\"stay_in_hostel\"]")
	List<WebElement> WillingToStayInTheHostelMenu;

	// Action on WebElement
	public void WillingToStayInTheHostelFromDropdown(String WillingToStayInTheHosteloptiontext) {
		for (WebElement WillingToStayInTheHostelDropdownMenu : WillingToStayInTheHostelMenu) {
			Select dropdown = new Select(WillingToStayInTheHostelDropdownMenu);
			dropdown.selectByVisibleText(WillingToStayInTheHosteloptiontext);
		}
	}

	// Identify WebElement
	@FindBy(xpath = "//select[@id=\"is_transport_needed\"]")
	List<WebElement> InterestedToTakeTranspotationMenu;

	// Action on WebElement
	public void InterestedToTakeTranspotationFromDropdown(String InterestedToTakeTranspotationoptiontext) {
		for (WebElement InterestedToTakeTranspotationDropdownMenu : InterestedToTakeTranspotationMenu) {
			Select dropdown = new Select(InterestedToTakeTranspotationDropdownMenu);
			dropdown.selectByVisibleText(InterestedToTakeTranspotationoptiontext);
		}
	}

	// Identify WebElement
	@FindBy(xpath = "//select[@id=\"addmission_status\"]")
	List<WebElement> AddmissionStatusMenu;

	// Action on WebElement
	public void AddmissionStatusFromDropdown(String AddmissionStatusoptiontext) {
		for (WebElement AddmissionStatusDropdownMenu : AddmissionStatusMenu) {
			Select dropdown = new Select(AddmissionStatusDropdownMenu);
			dropdown.selectByVisibleText(AddmissionStatusoptiontext);
		}
	}

	// Identify WebElement
	@FindBy(xpath = "//select[@id=\"registration_ready\"]")
	List<WebElement> RegistrationReadyMenu;

	// Action on WebElement
	public void RegistrationReadyFromDropdown(String RegistrationReadyoptiontext) {
		for (WebElement RegistrationReadyDropdownMenu : RegistrationReadyMenu) {
			Select dropdown = new Select(RegistrationReadyDropdownMenu);
			dropdown.selectByVisibleText(RegistrationReadyoptiontext);
		}
	}

	// Identify WebElement
	@FindBy(xpath = "//select[@id=\"counsellor_assigned\"]")
	List<WebElement> CounsellorAssignedMenu;

	// Action on WebElement
	public void CounsellorAssignedFromDropdown(String CounsellorAssignedoptiontext) {
		for (WebElement CounsellorAssignedDropdownMenu : CounsellorAssignedMenu) {
			Select dropdown = new Select(CounsellorAssignedDropdownMenu);
			dropdown.selectByVisibleText(CounsellorAssignedoptiontext);
		}
	}

	// Identify WebElement
	@FindBy(xpath = "//select[@id=\"counsellor_id\"]")
	List<WebElement> SelectCounsellorMenu;

	// Action on WebElement
	public void SelectCounsellorFromDropdown(String SelectCounselloroptiontext) {
		for (WebElement SelectCounsellorDropdownMenu : SelectCounsellorMenu) {
			Select dropdown = new Select(SelectCounsellorDropdownMenu);
			dropdown.selectByVisibleText(SelectCounselloroptiontext);
		}
	}

	// Identify WebElement
	@FindBy(xpath = "//select[@id=\"is_lateral\"]")
	List<WebElement> IsLateralMenu;

	// Action on WebElement
	public void IsLateralFromDropdown(String IsLateraloptiontext) {
		for (WebElement IsLateralDropdownMenu : IsLateralMenu) {
			Select dropdown = new Select(IsLateralDropdownMenu);
			dropdown.selectByVisibleText(IsLateraloptiontext);
		}
	}

	// Identify WebElement
	@FindBy(xpath = "///select[@id=\"is_firstlogin\"]")
	List<WebElement> IsLoggedInMenu;

	// Action on WebElement
	public void IsLoggedInFromDropdown(String IsLoggedInoptiontext) {
		for (WebElement IsLoggedInDropdownMenu : IsLoggedInMenu) {
			Select dropdown = new Select(IsLoggedInDropdownMenu);
			dropdown.selectByVisibleText(IsLoggedInoptiontext);
		}
	}

	// Identify WebElement
	@FindBy(xpath = "//select[@id=\"applicant_cancel_reason_verification_status\"]")
	List<WebElement> ApplicantCancleReasonVerificationStatusMenu;

	// Action on WebElement
	public void ApplicantCancleReasonVerificationStatusFromDropdown(
			String ApplicantCancleReasonVerificationStatusoptiontext) {
		for (WebElement ApplicantCancleReasonVerificationStatusDropdownMenu : ApplicantCancleReasonVerificationStatusMenu) {
			Select dropdown = new Select(ApplicantCancleReasonVerificationStatusDropdownMenu);
			dropdown.selectByVisibleText(ApplicantCancleReasonVerificationStatusoptiontext);
		}
	}
	// Identify WebElement
	@FindBy(xpath = "//button[@id=\"btn_submit_search\"]")
	WebElement Search;

	// Action on WebElement
	public void ChickonSearch() {
		Search.click();
	}
	// Identify WebElement
		@FindBy(linkText = " Reset")
		WebElement Reset;

		// Action on WebElement
		public void ChickonReset() {
			Reset.click();
		}

}
