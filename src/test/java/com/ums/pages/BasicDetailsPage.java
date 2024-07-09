package com.ums.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasicDetailsPage {
	WebDriver ldriver;

	// Constructor
	public BasicDetailsPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	
	@FindBy(xpath="//div[@class='toast-message']")
	WebElement OTPSuccessMessage;
	public String getOTPSuccessToastMessage() throws InterruptedException {
		Thread.sleep(1000);
        // Return the text of the success message
        return OTPSuccessMessage.getText();
	}
	
	// identify webelement
	@FindBy(xpath="//a[@class='dropdown-toggle'][@href='#']")
	WebElement userName;
	public String getUserName() {
		return userName.getText();
	}
	
	
    public void ClickOnUserName() {
    	userName.click();
	}

    
    @FindBy(xpath="//input[@id='photoInput']")
    WebElement PhotoInput;
    public void ClickToUploadPhoto() {
    	 Actions actions = new Actions(ldriver);
    	    
    	    // Perform the click action
    	    actions.moveToElement(PhotoInput).click().perform();
    }
    @FindBy(xpath="//input[@id='signatureInput']")
    WebElement SignatureInput;
    public void ClickToUploadSignature() {
    	SignatureInput.click();
    }
    
    
    
    //selecting GAPradiobutton
    @FindBy(xpath="(//div[@class='radio'])[3]")
    WebElement radioNo;
    @FindBy(xpath="(//div[@class='radio'])[4]")
    WebElement radioYes;
    public void selectRadio(String gap) {
        if (gap.equalsIgnoreCase("Yes")) {
            if (!radioYes.isSelected()) {
                radioYes.click();
            }
        } else if (gap.equalsIgnoreCase("No")) {
            if (!radioNo.isSelected()) {
                radioNo.click();
            }
        }
    }
	@FindBy(xpath = "//a[@href='https://ums-qa.adamasuniversity.ac.in/admission/logout']")
	WebElement SignOut;

	public void ClickOnSignOutBtn() {
		SignOut.click();
	}

	@FindBy(id = "initial_first_name")
	WebElement Salutaion;

	public void SelectSalutation(String salutaion) {
		Salutaion.sendKeys(salutaion);
	}

	@FindBy(xpath = "//input[@id='first_name']")
	WebElement FirstName;

	public void EnterFirstName(String firstname) {
		FirstName.sendKeys(firstname);
	}
	public void ClearTexrOfFirstName() {
		FirstName.clear();
	}
	public String getFirstName() {
		return FirstName.getText();
	}
	
	@FindBy(id = "middle_name")
	WebElement MiddleName;

	public void EnterMiddleName(String midname) {
		MiddleName.sendKeys(midname);
	}

	@FindBy(id = "last_name")
	WebElement LastName;

	public void EnterLastName(String lastname) {
		LastName.sendKeys(lastname);
	}

	@FindBy(id = "gender")
	WebElement Gender;

	public void SelectGender(String mygender) {
		Select gender = new Select(Gender);
		gender.selectByVisibleText(mygender);
	}

	@FindBy(id = "dobday")
	WebElement Dobday;

	public void SelectDobDay(String day) {
		Select dobday = new Select(Dobday);
		dobday.selectByVisibleText(day);
	}

	@FindBy(id = "dobmonth")
	WebElement Dobmonth;

	public void Selectdobmonth(String month) {
		Select dobmonth = new Select(Dobmonth);
		dobmonth.selectByVisibleText(month);
	}

	@FindBy(id = "dobyear")
	WebElement Dobyear;

	public void Selectdobyear(String year) {
		Select dobyear = new Select(Dobyear);
		dobyear.selectByVisibleText(year);
	}
	 public boolean isFieldNonEditable(WebElement field) {
	        JavascriptExecutor js = (JavascriptExecutor) ldriver;
	        try {
	            String originalValue = (String) js.executeScript("return arguments[0].value", field);
	            js.executeScript("arguments[0].value='test'", field);
	            String newValue = (String) js.executeScript("return arguments[0].value", field);
	            // Reset the value to original
	            js.executeScript("arguments[0].value=arguments[1]", field, originalValue);
	            return originalValue.equals(newValue);
	        } catch (Exception e) {
	            return true;
	        }
	    }

	    public boolean isFieldNonClickable(WebElement field) {
	        JavascriptExecutor js = (JavascriptExecutor) ldriver;
	        try {
	            js.executeScript("arguments[0].click();", field);
	            return false;
	        } catch (Exception e) {
	            return true;
	        }
	    }

	    public boolean isFieldNonSelectable(WebElement field) {
	        JavascriptExecutor js = (JavascriptExecutor) ldriver;
	        try {
	            js.executeScript("arguments[0].select();", field);
	            return false;
	        } catch (Exception e) {
	            return true;
	        }
	    }
	

	@FindBy(id = "aadhar")
	WebElement aadhar;

	public void EnterAadharNum(String aadharno) {
		aadhar.sendKeys(aadharno);
	}

	@FindBy(id = "identification_mark")
	WebElement IdentificationMark;

	public void EnterIdentificationMark(String mark) {
		IdentificationMark.sendKeys(mark);
	}

	@FindBy(id = "nationality")
	WebElement Nationality;

	public void SelectNationality(String nation) {
		Select Nation = new Select(Nationality);
		Nation.selectByVisibleText(nation);

	}

	@FindBy(xpath = "(//input[@class='form-control num mobile'])[1]")
	WebElement MobileNum;

	public void EnterMobileNum(String mobnum) {
		MobileNum.sendKeys(mobnum);
	}

	@FindBy(xpath = "//input[@name='alternet_mobile']")
	WebElement AlternetMobNum;

	public void EnterAlternetMobileNum(String alternetMobnum) {
		AlternetMobNum.sendKeys(alternetMobnum);
	}

	@FindBy(xpath = "//input[@name='email']")
	WebElement Email;

	public void EnterEmail(String email) {
		Email.sendKeys(email);
	}

	@FindBy(id = "religion")
	WebElement Religion;

	public void SelectReligon(String myreligion) {
		Select religion = new Select(Religion);
		religion.selectByVisibleText(myreligion);
	}

	@FindBy(id = "caste")
	WebElement Caste;

	public void SelectCaste(String mycast) {
		Select caste = new Select(Caste);
		caste.selectByVisibleText(mycast);
	}
	@FindBy(xpath="(//input[@readonly='readonly'])[1]")
	WebElement castValidationDate;
	public void clickOnCastValidationDateFrom() {
		castValidationDate.click();
	}

	@FindBy(id = "family_income_annual")
	WebElement AnnualFamilyIncome;

	public void SelectIncome(String income) {

		Select annualincome = new Select(AnnualFamilyIncome);
		annualincome.selectByVisibleText(income);
	}

	@FindBy(id = "blood_group_id")
	WebElement BloodGroup;

	public void SelectBloodGroup(String bgrp) {
		Select bloodgroup = new Select(BloodGroup);
		bloodgroup.selectByVisibleText(bgrp);
	}

	@FindBy(id = "married_status")
	WebElement MaritalStatus;

	public void SelectMaritalStatus(String mstatus) {
		Select maritalstatus = new Select(MaritalStatus);
		maritalstatus.selectByVisibleText(mstatus);
	}

	@FindBy(id = "is_ph")
	WebElement Disabilities;

	public void SelectDisability(String disablity) {
		Select disabilities = new Select(Disabilities);
		disabilities.selectByVisibleText(disablity);
	}

	// Address
	@FindBy(xpath = "//input[@id='permanent_address1']")
	WebElement PermanentAdd;

	public void EnterAddress(String address) {
		PermanentAdd.sendKeys(address);
	}

	@FindBy(xpath = "//input[@id='permanent_address2']")
	WebElement PermanentAdd2;

	public void EnterAddress2(String address2) {
		PermanentAdd2.sendKeys(address2);
	}

	@FindBy(xpath = "//select[@id='permanent_country']")
	WebElement PermanentCountry;

	public void SelectCountry(String countries) {
		Select country = new Select(PermanentCountry);
		country.selectByVisibleText(countries);
	}

	@FindBy(xpath = "//select[@id='permanent_state']")
	WebElement PermanentState;

	public void SelectState(String mystate) {
		Select state = new Select(PermanentState);
		state.selectByVisibleText(mystate);
	}

	@FindBy(xpath = "//select[@id='permanent_district_']")
	WebElement PermanetDistrict;

	public void SelectDistric(String dist) {
		Select distric = new Select(PermanetDistrict);
		distric.selectByVisibleText(dist);
	}

	@FindBy(xpath = "//select[@id='permanent_city']")
	WebElement PermanentCity;

	public void SelectCity(String MyCity) {
		Select city = new Select(PermanentCity);
		city.selectByVisibleText(MyCity);
	}

	@FindBy(xpath = "//input[@id='permanent_pin']")
	WebElement PermanentPin;

	public void EnterPin(String pincode) {
		PermanentPin.sendKeys(pincode);
	}

	@FindBy(xpath = "//input[@id='same_address']")
	WebElement SameAsPermanent;

	public void ClickOnSameAsPermChkBox() {
		SameAsPermanent.click();
	}

	@FindBy(xpath = "//input[@id='present_address1']")
	WebElement PresentAddress1;

	public void EnterPresentAdd1(String presentadd) {
		PresentAddress1.sendKeys(presentadd);
	}

	@FindBy(xpath = "//input[@id='present_address2']")
	WebElement PresentAddress2;

	public void EnterPresentAdd2(String presentadd2) {

		PresentAddress2.sendKeys(presentadd2);
	}

	@FindBy(xpath = "//select[@id='present_country']")
	WebElement PresentCountry;

	public void SelectPresentCountry(String presentcountry) {
		Select add1 = new Select(PresentCountry);
		add1.selectByVisibleText(presentcountry);
	}

	@FindBy(xpath = "//select[@id='present_state']")
	WebElement Presentstate;

	public void SelectPresentState(String presentstate) {
		Select add1 = new Select(Presentstate);
		add1.selectByVisibleText(presentstate);
	}

	@FindBy(xpath = "//select[@id='present_district_']")
	WebElement PresentDistrict;

	public void SelectPresentdist(String presentdist) {
		Select add1 = new Select(PresentDistrict);
		add1.selectByVisibleText(presentdist);
	}

	@FindBy(xpath = "//select[@id='present_city']")
	WebElement Presentcity;

	public void SelectPresentcity(String presentcity) {
		Select add1 = new Select(Presentcity);
		add1.selectByVisibleText(presentcity);
	}

	@FindBy(xpath = "//input[@id='present_pin']")
	WebElement PinCode;

	public void EnterPrestentPin(String pincode) {
		PinCode.sendKeys(pincode);
	}

	// Parents and Guardians Information
	@FindBy(xpath = "//select[@id='initial_name_mother']")
	WebElement Salutation1;

	public void SelectSalutation1(String salutation1) {
		Select sl1 = new Select(Salutation1);
		sl1.selectByVisibleText(salutation1);
	}

	@FindBy(xpath = "//select[@id='initial_name_father']")
	WebElement Salutation2;

	public void SelectSalutation2(String salutation2) {
		Select sl2 = new Select(Salutation2);
		sl2.selectByVisibleText(salutation2);
	}

	@FindBy(xpath = "//select[@id='initial_name_local_guardian']")
	WebElement Salutation3;

	public void SelectSalutation3(String salutation3) {
		Select sl3 = new Select(Salutation3);
		sl3.selectByVisibleText(salutation3);
	}

	@FindBy(xpath = "//input[@id='mother_name']")
	WebElement MothersName;

	public void EnterMothersName(String mothersname) {
		MothersName.sendKeys(mothersname);
	}

	@FindBy(xpath = "//input[@id='father_name']")
	WebElement FathersName;

	public void EnterFathersName(String fathersname) {
		FathersName.sendKeys(fathersname);
	}

	@FindBy(xpath = "//input[@id='local_guardian_name']")
	WebElement GuardianName;

	public void EnterGuardianName(String guardianName) {
		GuardianName.sendKeys(guardianName);
	}

	@FindBy(xpath = "//input[@id='local_guardian_relation']")
	WebElement GuardianRelation;

	public void EnterGuardianRelation(String guardianrelation) {
		GuardianRelation.sendKeys(guardianrelation);
	}

	@FindBy(xpath = "//input[@id='mother_qualification']")
	WebElement MotherQualification;

	public void EnterMotherQualification(String motherqualification) {
		MotherQualification.sendKeys(motherqualification);
	}

	@FindBy(xpath = "//input[@id='father_qualification']")
	WebElement FatherQualification;

	public void EnterFatherQualification(String fatherqualification) {
		FatherQualification.sendKeys(fatherqualification);
	}

	@FindBy(xpath = "//input[@id='local_guardian_mobile_no']")
	WebElement GuardianNum;

	public void EnterGuardianNum(String guardianNum) {
		GuardianNum.sendKeys(guardianNum);
	}

	@FindBy(xpath = "//input[@id='local_guardian_qualification']")
	WebElement GuardianQualification;

	public void EnterGuardianQualification(String guardianqualification) {
		GuardianQualification.sendKeys(guardianqualification);
	}

	@FindBy(xpath = "//input[@id='mother_mobile_no']")
	WebElement MotherMobNum;

	public void EnterMotherMobNum(String mothernum) {
		MotherMobNum.sendKeys(mothernum);
	}

	@FindBy(xpath = "//input[@id='father_mobile_no']")
	WebElement FatherMobNum;

	public void EnterFatherMobNum(String fathernum) {
		FatherMobNum.sendKeys(fathernum);
	}

	@FindBy(xpath = "//input[@id='local_guardian_email']")
	WebElement GuardianEmail;

	public void EnterLGuardianEmail(String guardianemail) {
		GuardianEmail.sendKeys(guardianemail);
	}

	@FindBy(xpath = "//input[@id='mother_email']")
	WebElement MothersEmail;

	public void EnterMothersEmail(String mothersemail) {
		MothersEmail.sendKeys(mothersemail);
	}

	@FindBy(xpath = "//input[@id='father_email']")
	WebElement FathersEmail;

	public void EnterFathersEmail(String fathersemail) {
		FathersEmail.sendKeys(fathersemail);
	}

	@FindBy(xpath = "//input[@id='local_guardian_address']")
	WebElement GuardiansAddress;

	public void EnterLGuardiansAddress(String guardiansadd) {
		GuardiansAddress.sendKeys(guardiansadd);
	}

	@FindBy(xpath = "//Select[@id='mother_occ']")
	WebElement MothersOccupation;

	public void SelectMothersOccupation(String mothersoccupation) {
		Select MO = new Select(MothersOccupation);
		MO.deselectByVisibleText(mothersoccupation);
	}

	@FindBy(xpath = "//Select[@id='father_occ']")
	WebElement FathersOccupation;

	public void SelectFathersOccupation(String fathersoccupation) {
		Select FO = new Select(FathersOccupation);
		FO.deselectByVisibleText(fathersoccupation);
	}

	@FindBy(xpath = "//Select[@id='local_guardian_occupation']")
	WebElement GuardiansOccupation;

	public void SelectLGuardiansOccupation(String guardianoccupation) {
		Select GO = new Select(GuardiansOccupation);
		GO.deselectByVisibleText(guardianoccupation);
	}

	@FindBy(xpath = "//Select[@id='local_guardian_income']")
	WebElement GuardiansAnnualIncome;

	public void SelectGuardiansAnnualIncome(String guardiansincome) {
		Select Gincome = new Select(GuardiansAnnualIncome);
		Gincome.deselectByVisibleText(guardiansincome);
	}

	// Bank Information
	@FindBy(xpath = "//input[@id='passport_no']")
	WebElement PassportNum;

	public void EnterPassportNum(String passportnum) {
		PassportNum.sendKeys(passportnum);
	}

	@FindBy(xpath = "//input[@id='passport_issue_place']")
	WebElement PlaceOfIssue;

	public void EnterPlaceOfIssue(String placeofissue) {
		PlaceOfIssue.sendKeys(placeofissue);
	}

	@FindBy(xpath = "(//input[@placeholder='Date of Issue'])[2]")
	WebElement DateOfIssue;

	public void EnterDateOfIssue(String dateofissue) {
		DateOfIssue.sendKeys(dateofissue);
	}

	@FindBy(xpath = "//input[@class='form-control form-control input'][@placeholder='Date of Expiry']")
	WebElement DateOfExpiry;

	public void EnterDateOfExpiry(String expdate) {
		DateOfExpiry.sendKeys(expdate);
	}

	@FindBy(xpath = "//input[@id='passport_country']")
	WebElement PassportCountry;

	public void EnterPassportCountry(String passportcountry) {
		PassportCountry.sendKeys(passportcountry);
	}

	@FindBy(xpath = "(//input[@name='passport_renew'])[1]")
	WebElement PassportRenewalNo;

	public void ClickOnPassportRenewalNeg(String passportrenewalno) {
		PassportRenewalNo.sendKeys(passportrenewalno);
	}

	@FindBy(xpath = "//input[@id='passport_no']")
	WebElement PassportRenewalYes;

	public void ClickOnPassportRenewalPos(String passportrenewalyes) {
		PassportNum.sendKeys(passportrenewalyes);
	}

	// Passport details
	@FindBy(xpath = "//select[@id='last_migrated_university']")
	WebElement LastInstitute;

	public void SelectLastInstitute(String lastintitute) {
		Select LInstitute = new Select(LastInstitute);
		LInstitute.selectByVisibleText(lastintitute);
	}

	@FindBy(xpath = "//input[@id='last_registration_uni']")
	WebElement LastUniversity;
	public void EnterLastUniversity(String lu) {
		LastUniversity.sendKeys(lu);
	}
	@FindBy(xpath = "//input[@id='last_registration_year']")
	WebElement RegYear;

	public void EnterRegYear(String regyear) {
		RegYear.sendKeys(regyear);
	}

	@FindBy(xpath = "//input[@id='migration_year']")
	WebElement MigrationYear;

	public void EnterMigrationYear(String migrationyear) {
		MigrationYear.sendKeys(migrationyear);
	}

	@FindBy(xpath = "//input[@id='nid_no']")
	WebElement NIDNum;

	public void EnterNIDNum(String nidNum) {
		NIDNum.sendKeys(nidNum);
	}

	@FindBy(xpath = "(//input[@class='inverted has-gap'])[1]")
	WebElement InterveningGapNo;

	public void ClickOnInterveningGapNo() {
		InterveningGapNo.click();
	}

	@FindBy(xpath = "(//input[@class='inverted has-gap'])[2]")
	WebElement InterveningGapYes;

	public void ClickOnInterveningGapYes() {
		InterveningGapYes.click();
	}

	@FindBy(xpath = "//input[@id='gap_period']")
	WebElement GapPeriod;

	public void EnterGapPeriod(String gapPeriod) {
		GapPeriod.sendKeys(gapPeriod);
	}

	@FindBy(xpath = "//input[@id='gap_reason']")
	WebElement GapReason;

	public void EnterGapReason(String gapreason) {
		GapReason.sendKeys(gapreason);
	}

	@FindBy(xpath = "((//input[@name='is_employee'])[1]")
	WebElement PursuingOtherCourseNeg;

	public void ClickOnAreYouEmployeeNeg() {
		PursuingOtherCourseNeg.click();
	}

	@FindBy(xpath = "(//input[@name='is_pursuing_other_regular_course'])[1]")
	WebElement PursuingOtherCoursePos;

	public void ClickOnPublishingOtherCoursePos() {
		PursuingOtherCoursePos.click();
	}

	@FindBy(xpath = "//button[@id='basic_info_btn']")
	WebElement SaveAndNext;

	public void ClickOnSaveAndNext() {
		SaveAndNext.click();
	}

	// Other Information
	
	
	
	
	
	
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
