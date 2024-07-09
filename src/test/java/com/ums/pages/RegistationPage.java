package com.ums.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistationPage {
	
		// Create an Object of webdriver
		WebDriver ldriver;

		// Create constructor
		public RegistationPage(WebDriver rdriver) {
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);

		}
		@FindBy(xpath="//h4[@class='panel-title'][normalize-space()='New Candidate - Registration']")
		WebElement pageTitle;
		 public String getPageTitle() {
		        return pageTitle.getText();
		    }
		

		@FindBy(id="first_name")
		WebElement FirstName;
		public void EnterFirstName(String FName) {
			FirstName.sendKeys(FName);
		}
		
		@FindBy(id="middle_name")
		WebElement MiddleName;
		public void EnterMiddleName(String MName) {
			MiddleName.sendKeys(MName);
		}
		@FindBy(id="last_name")
		WebElement LastName;
		public void EnterLastName(String LName) {
			LastName.sendKeys(LName);
		}
		@FindBy(id="dobday")
		WebElement DobDay;
		public void EnterDay(String day) {
			DobDay.sendKeys(day);
		}
		/*public void SelectDay(String Day) {
			Select day = new Select(DobDay);
			day.selectByVisibleText(Day);
		}*/
		@FindBy(id="dobmonth")
		WebElement DobMonth;
		public void SelectMonth() {
			Select month = new Select(DobMonth);
			month.selectByIndex(9);
		}
		@FindBy(id="dobyear")
		WebElement DobYear;
		public void EntertYear(String year) {
			DobYear.sendKeys(year);
		}
		/*@FindBy(id="dobyear")
		WebElement DobYear;
		public void SelectYear(String year) {
			Select Year = new Select(DobYear);
			Year.selectByVisibleText(year);
		}*/
		@FindBy(id="course_group_id")
		WebElement Programme;
		public void SelectProgramme(String program) {
			Select Prgrm = new Select(Programme);
			Prgrm.selectByVisibleText(program);
		}
		@FindBy(id ="email")
		WebElement Email;
		public void EnterEmail(String mail) {
			Email.sendKeys(mail);
		}
		@FindBy(id="mobile")
		WebElement MobileNo;
		public void EnterMobileNo(String num) {
			MobileNo.sendKeys(num);
		}
		@FindBy(id="password")
		WebElement Password;
		public void EnterPassWord(String Pwd) {
			Password.sendKeys(Pwd);
		}
		@FindBy(id="password_confirmation")
		WebElement ConfirmPassword;
		public void EnterConfirmPassword(String CPwd) {
			ConfirmPassword.sendKeys(CPwd);
		}
		@FindBy(xpath="//input[@value='1']")
		WebElement ReadInstuctionCheckBox;
		public void ClickOnReadInstuctionCB() {
			ReadInstuctionCheckBox.click();
		}
		@FindBy(id="btn_register")
		WebElement Regbtn;
		public void ClickOnRegister() {
			Regbtn.click();
		}
		
}
