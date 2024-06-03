package com.ums.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadDocumentPage {
	Actions actions;
	WebDriver ldriver;

	// Constructor
	public UploadDocumentPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		actions = new Actions(ldriver);
	}
	private void moveToElementAndClick(WebElement element) {
        try {
            actions.moveToElement(element).click().perform();
        } catch (Exception e) {
            System.out.println("Element not interactable: " + e.getMessage());
        }
    }

	
	@FindBy(xpath="//input[@name='document[7]']")
	WebElement AddressProof;
	public void ClickOnAddFileOfAddressProof() {
		
		moveToElementAndClick(AddressProof);
	}
	@FindBy(xpath="//input[@name='document[8]']")
	WebElement PhotoIdProof;
	public void ClickOnAddFilePhotoIdProof() {
		moveToElementAndClick(PhotoIdProof);
		
	}

	@FindBy(xpath="//input[@name='document[9]']")
	WebElement ProofOfDob;
	public void ClickOnAddFileProofOfDob() {
		
		moveToElementAndClick(ProofOfDob);
	}
	
	@FindBy(xpath="//input[@name='document[10]']")
	WebElement CastCertificate;
	public void ClickOnAddFileCastCertificate() {
		moveToElementAndClick(CastCertificate);
	}
	
	@FindBy(xpath="//input[@name='document[1]']")
	WebElement MarkSheetOfSecondarySchool;
	public void ClickOnAddFileMarkSheetOfSecondarySchool() {
		moveToElementAndClick(MarkSheetOfSecondarySchool);
	}
	@FindBy(xpath = "//input[@name='document[6]']")
	WebElement PassCertificate;
	public void ClickOnAddFilePassCertificate() {
		moveToElementAndClick(PassCertificate);
	}
	@FindBy(xpath="//input[@name='document[18]']")
	WebElement DeplomaMarkSheet;
	public void ClickOnAddFileDeplomaMarkSheet() {
		moveToElementAndClick(DeplomaMarkSheet);
	}
	
	@FindBy(xpath="//input[@name='document[21]']")
	WebElement JEEAllotmentLetter;
	public void ClickOnAddFileJEEAllotmentLetter() {
		moveToElementAndClick(JEEAllotmentLetter);
	}
	@FindBy(xpath="//input[@name='document[11]']")
	WebElement OtherExamCertificate;
	public void ClickOnAddOtherExamCertificate() {
		moveToElementAndClick(OtherExamCertificate);
	}
	@FindBy(xpath="//input[@name='document[38]']")
	WebElement AffidavitAnnexure2;
	public void ClickOnAddFileAffidavitAnnexure2() {
		moveToElementAndClick(AffidavitAnnexure2);
	}
	@FindBy(xpath="//input[@name='document[37]']")
	WebElement AffidavitAnnexure1;
	public void ClickOnAddFileAffidavitAnnexure1() {
		moveToElementAndClick(AffidavitAnnexure1);
	}
	@FindBy(xpath="//input[@name='document[36]']")
	WebElement MedicalCeritificate;
	public void ClickOnAddFileMedicalCeritificate() {
		moveToElementAndClick(MedicalCeritificate);
	}
	@FindBy(xpath="//input[@name='document[35]']")
	WebElement CollegeOrSchoolLeavingOrMigrationCertificate;
	public void ClickOnAddFileCollegeOrSchoolLeavingOrMigrationCertificate() {
		moveToElementAndClick(CollegeOrSchoolLeavingOrMigrationCertificate);
	}
	@FindBy(xpath="//input[@name='document[34]']")
	WebElement RankCardSection;
	public void ClickOnAddFileRankCardSection() {
		moveToElementAndClick(RankCardSection);
	}
	@FindBy(xpath="//input[@name='document[33]']")
	WebElement Visa;
	public void ClickOnAddFileVisa() {
		moveToElementAndClick(Visa);
	}
	@FindBy(xpath="//input[@name='document[32]']")
	WebElement Passport;
	public void ClickOnAddFilePassport() {
		moveToElementAndClick(Passport);
	}
	@FindBy(xpath="//input[@name='document[31]']")
	WebElement AddressProofOLocalGuardian;
	public void ClickOnAddFileAddressProofOLocalGuardian() {
		moveToElementAndClick(AddressProofOLocalGuardian);
	}
	@FindBy(xpath="//input[@name='document[30]']")
	WebElement PhotoIdProofOLocalGuardian;
	public void ClickOnAddFilePhotoIdProofOLocalGuardian() {
		moveToElementAndClick(PhotoIdProofOLocalGuardian);
	}
	@FindBy(xpath="//input[@name='document[29]']")
	WebElement AddressProofOMother;
	public void ClickOnAddFileAddressProofOMother() {
		moveToElementAndClick(AddressProofOMother);
	}
	@FindBy(xpath="//input[@name='document[28]']")
	WebElement PhotoIdProofOMother;
	public void ClickOnAddFilePhotoIdProofOMother() {
		moveToElementAndClick(PhotoIdProofOMother);
	}
	@FindBy(xpath="//input[@name='document[27]']")
	WebElement AddressProofOFather;
	public void ClickOnAddFileAddressProofOFather() {
		moveToElementAndClick(AddressProofOFather);
	}
	@FindBy(xpath="//input[@name='document[26]']")
	WebElement PhotoIdProofOFather;
	public void ClickOnAddFilePhotoIdProofOFather() {
		moveToElementAndClick(PhotoIdProofOFather);
	}
	@FindBy(xpath="//input[@name='document[24]']")
	WebElement AllFeeReceipt;
	public void ClickOnAddFileAllFeeReceipt() {
		moveToElementAndClick(AllFeeReceipt);
	}
	@FindBy(xpath="//input[@name='document[23]']")
	WebElement DisabilityCertificate;
	public void ClickOnAddFileDisabilityCertificate() {
		moveToElementAndClick(DisabilityCertificate);
	}
	@FindBy(xpath="//input[@name='document[20]']")
	WebElement StatementOfPurposeDocument;
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
