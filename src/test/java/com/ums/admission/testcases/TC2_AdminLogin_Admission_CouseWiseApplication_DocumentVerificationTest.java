package com.ums.admission.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.ums.functions.WebActions;
import com.ums.pages.BasicDetailsPage;
import com.ums.pages.CourseWiseApplication;
import com.ums.pages.DashboardPage;
import com.ums.pages.DocumentVerificationPage;
import com.ums.pages.EducationalDetailsPage;
import com.ums.pages.LoginPage;
import com.ums.pages.ProgrammeSelectionPage;
import com.ums.pages.UploadDocumentPage;
import com.ums.utility.AutoItUtil;

public class TC2_AdminLogin_Admission_CouseWiseApplication_DocumentVerificationTest extends BaseClass {

    String applicationNo = "APP-2024-115334";

    @BeforeMethod
    public void Login() {
        driver.get(adminLoginUrl);
        LoginPage lp = new LoginPage(driver);
        lp.enterUserName("admin@adamas.com");
        lp.enterPassWord("123456");
        lp.clickOnLoginbtn();
        // Navigate to the course-wise application page
        DashboardPage dp = new DashboardPage(driver);
        dp.ExpandAdmission();
        dp.ClickOnCourseWiseApplication();
    }

    @Test(priority = 1)
    public void VerifyDocumentsAreUploaded() throws IOException, InterruptedException {
        String editedName = "Lipsa";
        CourseWiseApplication cp = new CourseWiseApplication(driver);
        cp.ClickOnSearchApplication();
        Thread.sleep(1000);
        cp.EnterApplicationNum(applicationNo);
        cp.ClickonSearch();
        cp.ClickOnEditApplication();
        WebActions wa = new WebActions(driver);
        wa.switchToAnotherTab();

        BasicDetailsPage bp = new BasicDetailsPage(driver);
        bp.ClickToUploadPhoto();
        Thread.sleep(1000);
        AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe" + " " + "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\samplesignature.JPG");
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 3000)");
        bp.ClickOnSaveAndNext();

        EducationalDetailsPage ep = new EducationalDetailsPage(driver);
        ep.ClickOnUpdateNext();
        UploadDocumentPage up = new UploadDocumentPage(driver);
        up.ClickOnAddFilePhotoIdProof();
        Thread.sleep(1000);
        AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe" + " " + "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");

        // Repeatedly upload documents for different sections
        uploadDocument(up, "ClickOnAddFileProofOfDob", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFileCastCertificate", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFileMarkSheetOfSecondarySchool", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFilePassCertificateX", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFileMarkSheetOfSeniourSecondarySchool", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnPassCertificateXII", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnOtherPublicEntranceExam", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnJEEAllotmentLetter", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFileDeplomaMarkSheet", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnGraduationMarkSheet", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnGraduationPassCertificate", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFileAffidavitAnnexure1", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFileAffidavitAnnexure2", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFileMedicalCeritificate", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFileCollegeOrSchoolLeavingOrMigrationCertificate", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFileRankCardSection", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFileVisa", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFilePassport", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFileAddressProofOLocalGuardian", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFilePhotoIdProofOLocalGuardian", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFileAddressProofOMother", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFilePhotoIdProofOMother", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFileAddressProofOFather", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFilePhotoIdProofOFather", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnCourseCompletionCertificate", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFileAllFeeReceipt", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnAddFileDisabilityCertificate", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");
        uploadDocument(up, "ClickOnStatementOfPurposeDocument", "C:\\Users\\lipsa\\OneDrive\\Desktop\\UMS_Doc\\Doc.pdf");

        up.ClickOnUpdateNext();

       Thread.sleep(300);
       
        // Verify the success message
        WebElement successMessage = driver.findElement(By.xpath("//div[@id='toast-container']/div[@class='toast toast-success']/div[@class='toast-message']"));
        assertTrue(successMessage.isDisplayed(), "Success message was not displayed.");
        
    }

    private void uploadDocument(UploadDocumentPage up, String methodName, String filePath) throws IOException, InterruptedException {
        try {
            // Using reflection to call the appropriate method
            up.getClass().getMethod(methodName).invoke(up);
            Thread.sleep(1000);
            AutoItUtil.executeAutoItScript("C://Users//lipsa//OneDrive//Desktop//Autoit//FileUpload.exe" + " " + filePath);
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    @Test(priority = 2)
    public void ViewAndVerifyUploadedDocuments() throws InterruptedException {
    	 CourseWiseApplication cp = new CourseWiseApplication(driver);
         cp.ClickOnSearchApplication();
         Thread.sleep(1000);
         cp.EnterApplicationNum(applicationNo);
         cp.ClickonSearch();
         cp.ClickOnDocumentViewAndVerify();
         DocumentVerificationPage dv=new DocumentVerificationPage(driver);
         ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
         
         // Switch to the new tab
         driver.switchTo().window(tabs.get(2));
         
        
             // Example: Verifying Address Proof
             dv.clickToVerifyAddressProof();
             dv.enterAddressProofRemark("Verified address proof");

             // Example: Verifying Photo ID Proof
             dv.clickToVerifyPhotoIdProof();
            dv.enterPhotoIdProofRemark("Verified");
             // Example: Verifying Proof of Date of Birth
             dv.clickToVerifyProofOfDateOfBirth();
             dv.enterProofOfDateOfBirthRemark("Verified proof of date of birth.");

             // Example: Verifying SC/ST/OBC Certificate
             dv.clickToVerifyScStObcCertificate();
             dv.enterScStObcCertificateRemark("Verified SC/ST/OBC certificate.");

             // Example: Verifying Mark Sheet (Secondary School)
             dv.clickToVerifyMarkSheetSecondarySchool();
             dv.enterMarkSheetSecondarySchoolRemark("Verified mark sheet (secondary school).");

             // Example: Verifying Pass Certificate (Secondary School)
             dv.clickToVerifyPassCertificateSecondarySchool();
             dv.enterPassCertificateSecondarySchoolRemark("Verified pass certificate (secondary school).");

             // Example: Verifying Mark Sheet (Senior Secondary School)
             dv.clickToVerifyMarkSheetSeniorSecondarySchool();
             dv.enterMarkSheetSeniorSecondarySchoolRemark("Verified mark sheet (senior secondary school).");

             // Example: Verifying Pass Certificate (Senior Secondary School)
             dv.clickToVerifyPassCertificateSeniorSecondarySchool();
             dv.enterPassCertificateSeniorSecondarySchoolRemark("Verified pass certificate (senior secondary school).");

             // Example: Verifying Other Exam Certificate
             dv.clickToVerifyOtherExamCertificate();
             dv.enterOtherExamCertificateRemark("Verified other exam certificate.");

             // Example: Verifying JEE Allotment Letter
             dv.clickToVerifyJeeAllotmentLetter();
             dv.enterJeeAllotmentLetterRemark("Verified JEE allotment letter.");

             // Example: Verifying Diploma Mark Sheet/Certificate
             dv.clickToVerifyDiplomaMarkSheetCertificate();
             dv.enterDiplomaMarkSheetCertificateRemark("Verified diploma mark sheet/certificate.");

             // Example: Verifying UG/Graduation Mark Sheet
             dv.clickToVerifyUgGraduationMarkSheet();
             dv.enterUgGraduationMarkSheetRemark("Verified UG/graduation mark sheet.");

             // Example: Verifying UG/Graduation Pass Certificate
             dv.clickToVerifyUgGraduationPassCertificate();
             dv.enterUgGraduationPassCertificateRemark("Verified UG/graduation pass certificate.");

             // Example: Verifying Affidavit (Parent/Guardian)
             dv.clickToVerifyAffidavitParentGuardian();
             dv.enterAffidavitParentGuardianRemark("Verified affidavit (parent/guardian).");

             // Example: Verifying Affidavit (Student)
             dv.clickToVerifyAffidavitStudent();
             dv.enterAffidavitStudentRemark("Verified affidavit (student).");

             // Example: Verifying Medical Fitness Certificate
             dv.clickToVerifyMedicalFitnessCertificate();
             dv.enterMedicalFitnessCertificateRemark("Verified medical fitness certificate.");

             // Example: Verifying Leaving Certificate
             dv.clickToVerifyLeavingCertificate();
             dv.enterLeavingCertificateRemark("Verified leaving certificate.");

             // Example: Verifying Rank Card/Seat Allotment
             dv.clickToVerifyRankCardSeatAllotment();
             dv.enterRankCardSeatAllotmentRemark("Verified rank card/seat allotment.");

             // Example: Verifying Visa
             dv.clickToVerifyVisa();
             dv.enterVisaRemark("Verified visa.");

             // Example: Verifying Passport
             dv.clickToVerifyPassport();
             dv.enterPassportRemark("Verified passport.");

             // Example: Verifying Address Proof (Local Guardian)
             dv.clickToVerifyAddressProofLocalGuardian();
             dv.enterAddressProofLocalGuardianRemark("Verified address proof (local guardian).");

             // Example: Verifying Photo ID Proof (Local Guardian)
             dv.clickToVerifyPhotoIdProofLocalGuardian();
             dv.enterPhotoIdProofLocalGuardianRemark("Verified photo ID proof (local guardian).");

             
             dv.clickToVerifyAddressProofMother();
             dv.enterAddressProofMotherRemark("Verified address proof (mother).");

             
             dv.clickToVerifyPhotoIdProofMother();
             dv.enterPhotoIdProofMotherRemark("Verified photo ID proof (mother).");

             
             dv.clickToVerifyAddressProofFather();
             dv.enterAddressProofFatherRemark("Verified address proof (father).");

             // Example: Verifying Photo ID Proof (Father)
             dv.clickToVerifyPhotoIdProofFather();
             dv.enterPhotoIdProofFatherRemark("Verified photo ID proof (father).");

             // Example: Verifying Course Completion Certificate
             dv.clickToVerifyCourseCompletionCertificate();
             dv.enterCourseCompletionCertificateRemark("Verified course completion certificate.");

             // Example: Verifying All Fee Receipt
             dv.clickToVerifyAllFeeReceipt();
             dv.enterAllFeeReceiptRemark("Verified all fee receipts.");

             // Example: Verifying Disability Certificate
             dv.clickToVerifyDisabilityCertificate();
             dv.enterdisabilityCertificateRemark("Verified disability certificate.");

             // Example: Verifying Statement of Purpose Document
             dv.clickToVerifyStatementOfPurposeDocument();
             dv.enterdstatementOfPurposeDocumentRemark("Verified statement of purpose document.");

             dv.selectVerificationStatus("Approve");
             
             dv.selectVerificationType();
             dv.enterRemark("Verifyed");
           dv.clickOnCancleBtn();
           
         }
    @Test(priority=3)
    public void CheckDocumentVerificationStatus() throws InterruptedException {
    	String ExpectedStatus="Not Verified";
    	CourseWiseApplication cp = new CourseWiseApplication(driver);
        cp.ClickOnSearchApplication();
        Thread.sleep(1000);
        cp.EnterApplicationNum(applicationNo);
        cp.ClickonSearch();
        
        DocumentVerificationPage dv=new DocumentVerificationPage(driver);
       
       String ActualStatus= cp.GetTextOfDocumentVerificationStatus();
      Assert.assertEquals(ActualStatus.trim(), ExpectedStatus.trim(),"Document verification status doesn't match.");
       
    }

         
}
