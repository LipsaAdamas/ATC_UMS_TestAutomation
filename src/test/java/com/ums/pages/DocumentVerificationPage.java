package com.ums.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DocumentVerificationPage {

    WebDriver ldriver;

    // Constructor
    public DocumentVerificationPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    // Elements and Methods for the Document Verification

    @FindBy(xpath = "//input[@name='is_verified[0]']")
    WebElement addressProofSel;
    public void clickToVerifyAddressProof() {
        addressProofSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[0]']")
    WebElement addressProofRej;
    public void clickOnRejectAddressProof() {
        addressProofRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[1]")
    WebElement addressProofRemark;
    public void enterAddressProofRemark(String rem) {
        addressProofRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[1]']")
    WebElement photoIdProofSel;
    public void clickToVerifyPhotoIdProof() {
        photoIdProofSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[1]']")
    WebElement photoIdProofRej;
    public void clickToRejectPhotoIdProof() {
        photoIdProofRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[2]")
    WebElement photoIdProofRemark;
    public void enterPhotoIdProofRemark(String rem) {
        photoIdProofRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[2]']")
    WebElement proofOfDateOfBirthSel;
    public void clickToVerifyProofOfDateOfBirth() {
        proofOfDateOfBirthSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[2]']")
    WebElement proofOfDateOfBirthRej;
    public void clickToRejectProofOfDateOfBirth() {
        proofOfDateOfBirthRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[3]")
    WebElement proofOfDateOfBirthRemark;
    public void enterProofOfDateOfBirthRemark(String rem) {
        proofOfDateOfBirthRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[3]']")
    WebElement scStObcCertificateSel;
    public void clickToVerifyScStObcCertificate() {
        scStObcCertificateSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[3]']")
    WebElement scStObcCertificateRej;
    public void clickToRejectScStObcCertificate() {
        scStObcCertificateRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[4]")
    WebElement scStObcCertificateRemark;
    public void enterScStObcCertificateRemark(String rem) {
        scStObcCertificateRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[4]']")
    WebElement markSheetSecondarySchoolSel;
    public void clickToVerifyMarkSheetSecondarySchool() {
        markSheetSecondarySchoolSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[4]']")
    WebElement markSheetSecondarySchoolRej;
    public void clickToRejectMarkSheetSecondarySchool() {
        markSheetSecondarySchoolRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[5]")
    WebElement markSheetSecondarySchoolRemark;
    public void enterMarkSheetSecondarySchoolRemark(String rem) {
        markSheetSecondarySchoolRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[5]']")
    WebElement passCertificateSecondarySchoolSel;
    public void clickToVerifyPassCertificateSecondarySchool() {
        passCertificateSecondarySchoolSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[5]']")
    WebElement passCertificateSecondarySchoolRej;
    public void clickToRejectPassCertificateSecondarySchool() {
        passCertificateSecondarySchoolRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[6]")
    WebElement passCertificateSecondarySchoolRemark;
    public void enterPassCertificateSecondarySchoolRemark(String rem) {
        passCertificateSecondarySchoolRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[6]']")
    WebElement markSheetSeniorSecondarySchoolSel;
    public void clickToVerifyMarkSheetSeniorSecondarySchool() {
        markSheetSeniorSecondarySchoolSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[6]']")
    WebElement markSheetSeniorSecondarySchoolRej;
    public void clickToRejectMarkSheetSeniorSecondarySchool() {
        markSheetSeniorSecondarySchoolRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[7]")
    WebElement markSheetSeniorSecondarySchoolRemark;
    public void enterMarkSheetSeniorSecondarySchoolRemark(String rem) {
        markSheetSeniorSecondarySchoolRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[7]']")
    WebElement passCertificateSeniorSecondarySchoolSel;
    public void clickToVerifyPassCertificateSeniorSecondarySchool() {
        passCertificateSeniorSecondarySchoolSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[7]']")
    WebElement passCertificateSeniorSecondarySchoolRej;
    public void clickToRejectPassCertificateSeniorSecondarySchool() {
        passCertificateSeniorSecondarySchoolRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[8]")
    WebElement passCertificateSeniorSecondarySchoolRemark;
    public void enterPassCertificateSeniorSecondarySchoolRemark(String rem) {
        passCertificateSeniorSecondarySchoolRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[8]']")
    WebElement otherExamCertificateSel;
    public void clickToVerifyOtherExamCertificate() {
        otherExamCertificateSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[8]']")
    WebElement otherExamCertificateRej;
    public void clickToRejectOtherExamCertificate() {
        otherExamCertificateRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[9]")
    WebElement otherExamCertificateRemark;
    public void enterOtherExamCertificateRemark(String rem) {
        otherExamCertificateRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[9]']")
    WebElement jeeAllotmentLetterSel;
    public void clickToVerifyJeeAllotmentLetter() {
        jeeAllotmentLetterSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[9]']")
    WebElement jeeAllotmentLetterRej;
    public void clickToRejectJeeAllotmentLetter() {
        jeeAllotmentLetterRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[10]")
    WebElement jeeAllotmentLetterRemark;
    public void enterJeeAllotmentLetterRemark(String rem) {
        jeeAllotmentLetterRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[10]']")
    WebElement diplomaMarkSheetCertificateSel;
    public void clickToVerifyDiplomaMarkSheetCertificate() {
        diplomaMarkSheetCertificateSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[10]']")
    WebElement diplomaMarkSheetCertificateRej;
    public void clickToRejectDiplomaMarkSheetCertificate() {
        diplomaMarkSheetCertificateRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[11]")
    WebElement diplomaMarkSheetCertificateRemark;
    public void enterDiplomaMarkSheetCertificateRemark(String rem) {
        diplomaMarkSheetCertificateRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[11]']")
    WebElement ugGraduationMarkSheetSel;
    public void clickToVerifyUgGraduationMarkSheet() {
        ugGraduationMarkSheetSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[11]']")
    WebElement ugGraduationMarkSheetRej;
    public void clickToRejectUgGraduationMarkSheet() {
        ugGraduationMarkSheetRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[12]")
    WebElement ugGraduationMarkSheetRemark;
    public void enterUgGraduationMarkSheetRemark(String rem) {
        ugGraduationMarkSheetRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[12]']")
    WebElement ugGraduationPassCertificateSel;
    public void clickToVerifyUgGraduationPassCertificate() {
        ugGraduationPassCertificateSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[12]']")
    WebElement ugGraduationPassCertificateRej;
    public void clickToRejectUgGraduationPassCertificate() {
        ugGraduationPassCertificateRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[13]")
    WebElement ugGraduationPassCertificateRemark;
    public void enterUgGraduationPassCertificateRemark(String rem) {
        ugGraduationPassCertificateRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[13]']")
    WebElement affidavitParentGuardianSel;
    public void clickToVerifyAffidavitParentGuardian() {
        affidavitParentGuardianSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[13]']")
    WebElement affidavitParentGuardianRej;
    public void clickToRejectAffidavitParentGuardian() {
        affidavitParentGuardianRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[14]")
    WebElement affidavitParentGuardianRemark;
    public void enterAffidavitParentGuardianRemark(String rem) {
        affidavitParentGuardianRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[14]']")
    WebElement affidavitStudentSel;
    public void clickToVerifyAffidavitStudent() {
        affidavitStudentSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[14]']")
    WebElement affidavitStudentRej;
    public void clickToRejectAffidavitStudent() {
        affidavitStudentRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[15]")
    WebElement affidavitStudentRemark;
    public void enterAffidavitStudentRemark(String rem) {
        affidavitStudentRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[15]']")
    WebElement medicalFitnessCertificateSel;
    public void clickToVerifyMedicalFitnessCertificate() {
        medicalFitnessCertificateSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[15]']")
    WebElement medicalFitnessCertificateRej;
    public void clickToRejectMedicalFitnessCertificate() {
        medicalFitnessCertificateRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[16]")
    WebElement medicalFitnessCertificateRemark;
    public void enterMedicalFitnessCertificateRemark(String rem) {
        medicalFitnessCertificateRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[16]']")
    WebElement leavingCertificateSel;
    public void clickToVerifyLeavingCertificate() {
        leavingCertificateSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[16]']")
    WebElement leavingCertificateRej;
    public void clickToRejectLeavingCertificate() {
        leavingCertificateRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[17]")
    WebElement leavingCertificateRemark;
    public void enterLeavingCertificateRemark(String rem) {
        leavingCertificateRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[17]']")
    WebElement rankCardSeatAllotmentSel;
    public void clickToVerifyRankCardSeatAllotment() {
        rankCardSeatAllotmentSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[17]']")
    WebElement rankCardSeatAllotmentRej;
    public void clickToRejectRankCardSeatAllotment() {
        rankCardSeatAllotmentRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[18]")
    WebElement rankCardSeatAllotmentRemark;
    public void enterRankCardSeatAllotmentRemark(String rem) {
        rankCardSeatAllotmentRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[18]']")
    WebElement visaSel;
    public void clickToVerifyVisa() {
        visaSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[18]']")
    WebElement visaRej;
    public void clickToRejectVisa() {
        visaRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[19]")
    WebElement visaRemark;
    public void enterVisaRemark(String rem) {
        visaRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[19]']")
    WebElement passportSel;
    public void clickToVerifyPassport() {
        passportSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[19]']")
    WebElement passportRej;
    public void clickToRejectPassport() {
        passportRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[20]")
    WebElement passportRemark;
    public void enterPassportRemark(String rem) {
        passportRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[20]']")
    WebElement addressProofLocalGuardianSel;
    public void clickToVerifyAddressProofLocalGuardian() {
        addressProofLocalGuardianSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[20]']")
    WebElement addressProofLocalGuardianRej;
    public void clickToRejectAddressProofLocalGuardian() {
        addressProofLocalGuardianRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[21]")
    WebElement addressProofLocalGuardianRemark;
    public void enterAddressProofLocalGuardianRemark(String rem) {
        addressProofLocalGuardianRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[21]']")
    WebElement photoIdProofLocalGuardianSel;
    public void clickToVerifyPhotoIdProofLocalGuardian() {
        photoIdProofLocalGuardianSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[21]']")
    WebElement photoIdProofLocalGuardianRej;
    public void clickToRejectPhotoIdProofLocalGuardian() {
        photoIdProofLocalGuardianRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[22]")
    WebElement photoIdProofLocalGuardianRemark;
    public void enterPhotoIdProofLocalGuardianRemark(String rem) {
        photoIdProofLocalGuardianRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[22]']")
    WebElement addressProofMotherSel;
    public void clickToVerifyAddressProofMother() {
        addressProofMotherSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[22]']")
    WebElement addressProofMotherRej;
    public void clickToRejectAddressProofMother() {
        addressProofMotherRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[23]")
    WebElement addressProofMotherRemark;
    public void enterAddressProofMotherRemark(String rem) {
        addressProofMotherRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[23]']")
    WebElement photoIdProofMotherSel;
    public void clickToVerifyPhotoIdProofMother() {
        photoIdProofMotherSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[23]']")
    WebElement photoIdProofMotherRej;
    public void clickToRejectPhotoIdProofMother() {
        photoIdProofMotherRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[24]")
    WebElement photoIdProofMotherRemark;
    public void enterPhotoIdProofMotherRemark(String rem) {
        photoIdProofMotherRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[24]']")
    WebElement addressProofFatherSel;
    public void clickToVerifyAddressProofFather() {
        addressProofFatherSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[24]']")
    WebElement addressProofFatherRej;
    public void clickToRejectAddressProofFather() {
        addressProofFatherRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[25]")
    WebElement addressProofFatherRemark;
    public void enterAddressProofFatherRemark(String rem) {
        addressProofFatherRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[25]']")
    WebElement photoIdProofFatherSel;
    public void clickToVerifyPhotoIdProofFather() {
        photoIdProofFatherSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[25]']")
    WebElement photoIdProofFatherRej;
    public void clickToRejectPhotoIdProofFather() {
        photoIdProofFatherRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[26]")
    WebElement photoIdProofFatherRemark;
    public void enterPhotoIdProofFatherRemark(String rem) {
        photoIdProofFatherRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[26]']")
    WebElement courseCompletionCertificateSel;
    public void clickToVerifyCourseCompletionCertificate() {
        courseCompletionCertificateSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[26]']")
    WebElement courseCompletionCertificateRej;
    public void clickToRejectCourseCompletionCertificate() {
        courseCompletionCertificateRej.click();
    }

    @FindBy(xpath="(//input[@name='remarks[]'])[27]")
    WebElement courseCompletionCertificateRemark;
    public void enterCourseCompletionCertificateRemark(String rem) {
    	courseCompletionCertificateRemark.sendKeys(rem);
    }
    
    
    

    @FindBy(xpath = "//input[@name='is_verified[27]']")
    WebElement allFeeReceiptSel;
    public void clickToVerifyAllFeeReceipt() {
        allFeeReceiptSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[27]']")
    WebElement allFeeReceiptRej;
    public void clickToRejectAllFeeReceipt() {
        allFeeReceiptRej.click();
    }
    @FindBy(xpath="(//input[@name='remarks[]'])[28]")
    WebElement allFeeReceiptRemark;
    public void enterAllFeeReceiptRemark(String rem) {
    	allFeeReceiptRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[28]']")
    WebElement disabilityCertificateSel;
    public void clickToVerifyDisabilityCertificate() {
        disabilityCertificateSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[28]']")
    WebElement disabilityCertificateRej;
    public void clickToRejectDisabilityCertificate() {
        disabilityCertificateRej.click();
    }
    @FindBy(xpath="(//input[@name='remarks[]'])[29]")
    WebElement disabilityCertificateRemark;
    public void enterdisabilityCertificateRemark(String rem) {
    	disabilityCertificateRemark.sendKeys(rem);
    }

    @FindBy(xpath = "//input[@name='is_verified[29]']")
    WebElement statementOfPurposeDocumentSel;
    public void clickToVerifyStatementOfPurposeDocument() {
        statementOfPurposeDocumentSel.click();
    }

    @FindBy(xpath = "//input[@name='is_rejected[29]']")
    WebElement statementOfPurposeDocumentRej;
    public void clickToRejectStatementOfPurposeDocument() {
        statementOfPurposeDocumentRej.click();
    }
    @FindBy(xpath="(//input[@name='remarks[]'])[30]")
    WebElement dstatementOfPurposeDocumentRemark;
    public void enterdstatementOfPurposeDocumentRemark(String rem) {
    	dstatementOfPurposeDocumentRemark.sendKeys(rem);
    }
    @FindBy(xpath="//select[@id='doc_verification_status']")
    WebElement VerificationStatus;
    public void selectVerificationStatus(String status) {
    	Select sl=new Select(VerificationStatus);
    	sl.selectByVisibleText(status);
    }
    @FindBy(xpath="//input[@class='select2-search__field']")
    WebElement Reason;
    public void selectReason() {
    	Select sl=new Select(Reason);
    	sl.selectByIndex(3);
    }
    @FindBy(xpath="//select[@id='verification_type']")
    WebElement VerificationType;
    public void selectVerificationType() {
    	Select sl=new Select(VerificationType);
    	sl.selectByIndex(1);
    }

    @FindBy(xpath="//textarea[@id='doc_verify_remarks']")
    WebElement Remark;
    public void enterRemark(String rem) {
    	Remark.sendKeys(rem);
    }
    @FindBy(xpath="//button[@id='btn_submit']")
    WebElement Confirm;
    public void ClickOnConfirmBtn() {
    	Confirm.click();
    }
    @FindBy(xpath="//button[@class='btn btn-sm yellow-gold']")
    WebElement Cancle;
    public void clickOnCancleBtn() {
    	Cancle.click();
    }
   
}
    
    
