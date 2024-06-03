package com.ums.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EducationalDetailsPage {

	WebDriver ldriver;

	// Constructor
	public EducationalDetailsPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@class='btn  btn-info  btn-circle']")
	WebElement EducationalDetailsBtn;

	public void ClickOnEducationalDetailsBtn() {
		EducationalDetailsBtn.click();
	}

	@FindBy(xpath = "(//i[@class='more-less glyphicon glyphicon-plus'])[1]")
	WebElement PlusIcon10th;

	public void ClickOnPlusIcon10th() {
		PlusIcon10th.click();
	}

	@FindBy(xpath = "//select[@id='marking_scheme_0']")
	WebElement MakingScheme;

	public void SelectMakingScheme(String CGPAOutOf) {
		Select Scheme = new Select(MakingScheme);
		Scheme.selectByVisibleText(CGPAOutOf);
	}

	@FindBy(xpath = "//select[@id='is_passed_0']")
	WebElement Passed;

	public void SelectPassed(String passed) {
		Select pass = new Select(MakingScheme);
		pass.selectByVisibleText(passed);
	}

	@FindBy(xpath = "//input[@name='division[0]']")
	WebElement Division;

	public void EnterDivision(String division) {
		Division.sendKeys(division);
	}

	@FindBy(xpath = "//input[@name='cgpa[0]']")
	WebElement CGPA;

	public void EnterGrade(String cgpa) {
		CGPA.sendKeys(cgpa);
	}

	@FindBy(xpath = "//input[@name='full_marks[0]']")
	WebElement FullMark;

	public void EnterFullMark(String fullmark) {
		FullMark.sendKeys(fullmark);
	}

	@FindBy(xpath = "//input[@name='obtained_marks[0]']")
	WebElement ObtainedMarks;

	public void EnterObtainedMarks(String obtainedmark) {
		ObtainedMarks.sendKeys(obtainedmark);
	}

	@FindBy(xpath = "//input[@id='percentage_marks_0']")
	WebElement PercentageOfMarks;

	public void EnterPercentageOfMarks(String percentage) {
		PercentageOfMarks.sendKeys(percentage);
	}

	@FindBy(xpath = "//select[@id='passing_year_0']")
	WebElement YearOfPassing;

	public void SelectYearOfPassing(String passingyear) {
		 Select yrofpassing=new Select(YearOfPassing);
				 yrofpassing.selectByVisibleText(passingyear);
	}

	@FindBy(xpath = "//input[@name='school_college[0]']")
	WebElement NameOfInstitute;

	public void EnterNameOfInstitute(String institutename) {
		NameOfInstitute.sendKeys(institutename);
	}

	@FindBy(xpath = "//input[@name='board_university[0]']")
	WebElement NameOfBoard;

	public void EnterNameOfBoard(String boardname) {
		NameOfBoard.sendKeys(boardname);
	}
	@FindBy(xpath="(//i[@class='more-less glyphicon glyphicon-plus'])[1]")
	WebElement Class10th;
	public void ClickOnClass10th() {
		Class10th.click();
	}
	@FindBy(xpath = "(//i[@class='more-less glyphicon glyphicon-plus'])[2]")
	WebElement Class12th;
	public void ClickOnClass12th() {
		Class12th.click();
	}
	@FindBy(xpath="(//i[@class='more-less glyphicon glyphicon-plus'])[3]")
	WebElement Graduation;
	public void ClickOnGraduation() {
		Graduation.click();
	}

	@FindBy(xpath = "//button[@onclick='add12Form(1);']")
	WebElement AddClass12;

	public void ClickOnAddClass12() {
		AddClass12.click();
	}

	@FindBy(xpath = "//button[@onclick='add12Form(2);']")
	WebElement AddClass12AndDeploma;

	public void ClickOnAddClass12AndDeploma() {
		AddClass12AndDeploma.click();
	}

	@FindBy(xpath = "//button[@onclick='add12Form(3);']")
	WebElement AddDeploma;

	public void ClickOnAddDeploma() {
		AddDeploma.click();
	}

	@FindBy(xpath = "//button[@onclick='addGraduationForm(this);']")
	WebElement AddGraduationOrEquivalent;

	public void ClickOnAddGraduationOrEquivalent() {
		AddGraduationOrEquivalent.click();
	}

	@FindBy(xpath = "//button[@onclick='addMastersForm(this);']")
	WebElement MasterEquivalent;

	public void ClickOnMasterEquivalent() {
		MasterEquivalent.click();
	}

	@FindBy(xpath = "//button[@onclick='addMphilForm(this);']")
	WebElement Mphil;

	public void ClickOnMphilDetails() {
		Mphil.click();
	}

	@FindBy(xpath = "(//select[@id='marking_scheme_1'])[1]")
	WebElement MarkingScheme12;

	public void SelectMakingScheme12(String CGPAOutOf12) {
		Select Scheme = new Select(MarkingScheme12);
		Scheme.selectByVisibleText(CGPAOutOf12);
	}

	@FindBy(xpath = "(//select[@id='is_passed_1'])[1]")
	WebElement Passed12;

	public void SelectPassed12(String passed12) {
		Select pass12 = new Select(Passed12);
		pass12.selectByVisibleText(passed12);
	}

	@FindBy(xpath = "(//input[@name='division[1]'])[1]")
	WebElement Division12;

	public void EnterDivision12(String division12) {
		Division12.sendKeys(division12);
	}

	@FindBy(xpath = "(//input[@name='cgpa[1]'])[1]")
	WebElement CGPA12;

	public void EnterGrade12(String cgpa12) {
		CGPA12.sendKeys(cgpa12);
	}

	@FindBy(xpath = "(//input[@name='full_marks[1]'])[1]")
	WebElement FullMark12;

	public void EnterFullMark12(String fullmark12) {
		FullMark12.sendKeys(fullmark12);
	}

	@FindBy(xpath = "(//input[@name='obtained_marks[1]'])[1]")
	WebElement ObtainedMarks12;

	public void EnterObtainedMarks12(String obtainedmark12) {
		ObtainedMarks12.sendKeys(obtainedmark12);
	}

	@FindBy(xpath = "(//input[@name='percentage_marks[1] parcentageMarks_hs'])[1]")
	WebElement PercentageOfMarks12;

	public void EnterPercentageOfMarks12(String percentage12) {
		PercentageOfMarks12.sendKeys(percentage12);
	}

	@FindBy(xpath = "(//select[@name='passing_year[1]'])[1]")
	WebElement YearOfPassing12;

	public void SelectYearOfPassing12(String passingyear12) {
		Select yrodpass12=new Select(YearOfPassing12);
		yrodpass12.selectByVisibleText(passingyear12);
	}

	@FindBy(xpath = "(//input[@name='school_college[1]'])[1]")
	WebElement NameOfInstitute12;

	public void EnterNameOfInstitute12(String institutename12) {
		NameOfInstitute12.sendKeys(institutename12);
	}

	@FindBy(xpath = "(//input[@name='board_university[1]'])[1]']")
	WebElement NameOfBoard12;

	public void EnterNameOfBoard12(String boardname12) {
		NameOfBoard12.sendKeys(boardname12);
	}

	@FindBy(xpath = "//select[@id='perv_exam_select_443845']")
	WebElement Examination;

	public void SelectExamination(String exam) {
		Select ex = new Select(Examination);
		ex.selectByVisibleText(exam);
	}

	@FindBy(xpath = "//select[@name='garduation_is_passed[]']")
	WebElement PassedGraduation;

	public void SelectPassedGraduation(String passedgraduation) {
		Select passgraduate = new Select(PassedGraduation);
		passgraduate.selectByVisibleText(passedgraduation);
	}

	@FindBy(xpath = "//input[@name='garduation_division[]']")
	WebElement DivisionGraduation;

	public void EnterDivisionGraduation(String divisiongraduation) {
		DivisionGraduation.sendKeys(divisiongraduation);
	}

	@FindBy(xpath = "//input[@name='garduation_cgpa[]']")
	WebElement CGPAGraduation;

	public void EnterCGPAGraduation(String cgpagaduate) {
		CGPAGraduation.sendKeys(cgpagaduate);
	}

	@FindBy(xpath = "//input[@name='garduation_full_marks[]']")
	WebElement FullMarkGraduation;

	public void EnterFullMarkGraduation(String fullmarkgraduate) {
		FullMarkGraduation.sendKeys(fullmarkgraduate);
	}

	@FindBy(xpath = "//input[@name='garduation_obtained_marks[]']")
	WebElement ObtainedMarksGraduation;

	public void EnterObtainedMarksGraduation(String obtainedmarkgraduate) {
		ObtainedMarksGraduation.sendKeys(obtainedmarkgraduate);
	}

	@FindBy(xpath = "//input[@name='garduation_percentage_marks[]']")
	WebElement PercentageOfMarksGraduation;

	public void EnterPercentageOfMarksGraduation(String percentagegraduate) {
		PercentageOfMarksGraduation.sendKeys(percentagegraduate);
	}

	@FindBy(xpath = "//select[@name='garduation_passing_year[]']")
	WebElement YearOfPassingGraduation;

	public void SelectYearOfPassingGraduation(String passingyeargraduation) {
		Select yrofpassinggr=new Select(YearOfPassingGraduation);
		yrofpassinggr.selectByVisibleText(passingyeargraduation);
	}

	@FindBy(xpath = "//input[@name='garduation_school_college[]']")
	WebElement NameOfInstituteGraduation;

	public void EnterNameOfInstituteGraduation(String institutenamegraduation) {
		NameOfInstituteGraduation.sendKeys(institutenamegraduation);
	}

	@FindBy(xpath = "//input[@name='garduation_board_university[]']")
	WebElement NameOfBoardGraduation;

	public void EnterNameOfBoardGraduation(String boardnamegraduation) {
		NameOfBoardGraduation.sendKeys(boardnamegraduation);
	}

	@FindBy(xpath = "(//select[@name='garduation_is_passed[]'])[2]")
	WebElement PassedMasterEquivalent;

	public void SelectPassedMasterEquivalent(String passedMaster) {
		Select passmaster = new Select(PassedMasterEquivalent);
		passmaster.selectByVisibleText(passedMaster);
	}

	@FindBy(xpath = "(//select[@name='garduation_pre_exam[]'])[2]")
	WebElement ExamMaster;

	public void SelectExamMaster(String examMaster) {
		Select exMaster = new Select(ExamMaster);
		exMaster.selectByVisibleText(examMaster);
	}

	@FindBy(xpath = "(//input[@name='garduation_division[]'])[2]")
	WebElement DivisionMaster;

	public void EnterDivisionMaster(String divisionmaster) {
		DivisionMaster.sendKeys(divisionmaster);
	}

	@FindBy(xpath = "(//input[@name='garduation_cgpa[]'])[2]")
	WebElement CGPAMaster;

	public void EnterCGPAMaster(String cgpamaster) {
		CGPAMaster.sendKeys(cgpamaster);
	}

	@FindBy(xpath = "(//input[@name='garduation_full_marks[]'])[2]")
	WebElement FullMarkMaster;

	public void EnterFullMarkMaster(String fullmarkmaster) {
		FullMarkMaster.sendKeys(fullmarkmaster);
	}

	@FindBy(xpath = "(//input[@name='garduation_obtained_marks[]'])[2]")
	WebElement ObtainedMarksMaster;

	public void EnterObtainedMarksMaster(String obtainedmarkmaster) {
		ObtainedMarksMaster.sendKeys(obtainedmarkmaster);
	}

	@FindBy(xpath = "(//input[@name='garduation_percentage_marks[]'])[2]")
	WebElement PercentageOfMarksMaster;

	public void EnterPercentageOfMarksMaster(String percentagemaster) {
		PercentageOfMarksMaster.sendKeys(percentagemaster);
	}

	@FindBy(xpath = "(//select[@name='garduation_passing_year[]'])[2]")
	WebElement YearOfPassingMaster;

	public void SelectYearOfPassingMaster(String passingyearmaster) {
		Select yrofpassMstr=new Select(YearOfPassingMaster);
		yrofpassMstr.selectByVisibleText(passingyearmaster);
	}

	@FindBy(xpath = "(//input[@name='garduation_school_college[]'])[2]")
	WebElement NameOfInstituteMaster;

	public void EnterNameOfInstituteMaster(String institutenamemaster) {
		NameOfInstituteMaster.sendKeys(institutenamemaster);
	}

	@FindBy(xpath = "(//input[@name='garduation_board_university[]'])[2]")
	WebElement NameOfBoardMaster;

	public void EnterNameOfBoardMaster(String boardnamemaster) {
		NameOfBoardMaster.sendKeys(boardnamemaster);
	}
	@FindBy(xpath = "(//select[@name='garduation_pre_exam[]'])[3]")
	WebElement ExaminationMphil;

	public void SelectExaminationMphil(String examMphil) {
		Select exmphil = new Select(ExaminationMphil);
		exmphil.selectByVisibleText(examMphil);
	}

	@FindBy(xpath = "(//select[@name='garduation_is_passed[]'])[3]")
	WebElement PassedMphil;

	public void SelectPassedMphil(String passedmphil) {
		Select passmphil = new Select(PassedMphil);
		passmphil.selectByVisibleText(passedmphil);
	}

	@FindBy(xpath = "(//input[@name='garduation_division[]'])[3]")
	WebElement DivisionMphil;

	public void EnterDivisionMphil(String divisionmphil) {
		DivisionMphil.sendKeys(divisionmphil);
	}

	@FindBy(xpath = "(//input[@name='garduation_cgpa[]'])[3]")
	WebElement CGPAMphil;

	public void EnterCGPAMphil(String cgpamphil) {
		CGPAMphil.sendKeys(cgpamphil);
	}

	@FindBy(xpath = "(//input[@name='garduation_full_marks[]'])[3]")
	WebElement FullMarkMphil;

	public void EnterFullMarkMphil(String fullmarkmphil) {
		FullMarkMphil.sendKeys(fullmarkmphil);
	}

	@FindBy(xpath = "(//input[@name='garduation_obtained_marks[]'])[3]")
	WebElement ObtainedMarksMphil;

	public void EnterObtainedMarksMphil(String obtainedmarkmphil) {
		ObtainedMarksMphil.sendKeys(obtainedmarkmphil);
	}

	@FindBy(xpath = "(//input[@name='garduation_percentage_marks[]'])[3]")
	WebElement PercentageOfMarksMphil;

	public void EnterPercentageOfMarksMphil(String percentaMphil) {
		PercentageOfMarksMphil.sendKeys(percentaMphil);
	}

	@FindBy(xpath = "(//select[@name='garduation_passing_year[]'])[3]")
	WebElement YearOfPassingMphil;

	public void SelectYearOfPassingMphil(String passingyearmphil) {
		Select yearofpassingmphil = new Select(YearOfPassingMphil);
		yearofpassingmphil.selectByVisibleText(passingyearmphil);
	}

	@FindBy(xpath = "(//input[@name='garduation_school_college[]'])[3]")
	WebElement NameOfInstituteMphil;

	public void EnterNameOfInstituteMphil(String institutenamemphil) {
		NameOfInstituteMphil.sendKeys(institutenamemphil);
	}

	@FindBy(xpath = "(//input[@name='garduation_board_university[]'])[3]")
	WebElement NameOfBoardMphil;

	public void EnterNameOfBoardMphil(String boardnamemphil) {
		NameOfBoardMphil.sendKeys(boardnamemphil);
	}
	@FindBy(xpath = "(//select[@name='jee_exam_year[]'])[1]")
	WebElement YearOfExamination;

	public void SelectYearOfExamination(String yrofexam) {
		Select yrofex = new Select(YearOfExamination);
		yrofex.selectByVisibleText(yrofexam);
	}

	@FindBy(xpath = "(//input[@id='jee_marks_percentile'])[1]")
	WebElement Marks;

	public void SelectMarks(String marks) {
		Select mrks = new Select(Marks);
		mrks.selectByVisibleText(marks);
	}

	@FindBy(xpath = "(//input[@id='state_rank'])[1]")
	WebElement StateRank;

	public void EnterStateRank(String staterank) {
		StateRank.sendKeys(staterank);
	}

	@FindBy(xpath = "(//input[@id='application_no'])[1]")
	WebElement ApplicationNum;

	public void EnterApplicationNum(String appNum) {
		ApplicationNum.sendKeys(appNum);
	}

	@FindBy(xpath = "/(//input[@id='all_india_general_rank'])[1]")
	WebElement AllIndiaRank;

	public void EnterAllIndiaRank(String allIndiarank) {
		AllIndiaRank.sendKeys(allIndiarank);
	}

	@FindBy(xpath = "(//input[@name='score[]'])[1]")
	WebElement Score;

	public void EnterScore(String score) {
		Score.sendKeys(score);
	}

	@FindBy(xpath = "(//select[@id='other_exam'])[1]")
	WebElement SelectExam;

	public void SelectSelectExam(String selectexam) {
		Select selectex=new Select(SelectExam);
		selectex.selectByVisibleText(selectexam);
	}

	@FindBy(xpath = "(//button[@onclick='deleteNewExam(this);'])[1]")
	WebElement DeleteExam;

	public void ClickOnDeleteExam() {
		DeleteExam.click();
	}

	@FindBy(xpath = "//button[@id='btn_save']")
	WebElement ClickOnSaveAndNext;
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
