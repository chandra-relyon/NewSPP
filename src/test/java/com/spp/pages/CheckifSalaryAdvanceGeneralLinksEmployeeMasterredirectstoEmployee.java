package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifSalaryAdvanceGeneralLinksEmployeeMasterredirectstoEmployee extends BasePage{
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//a[text()='Advance Detail']")
	WebElement ClickOnAdvanceDetail;
	@FindBy(xpath="//*[@id=\"ui-id-3\"]/h3")
	WebElement ClickonGeneralLinks;
	@FindBy(xpath="//*[@id=\"ui-id-4\"]/li[2]/a")
	WebElement ClickOnEmployeeMaster;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/ul/li[1]/a")
	WebElement AddNewEmployee;
	@FindBy(id="employee_emp_id")
	WebElement employeeid;
	@FindBy(id="employee_refno")
	WebElement employeeref;
	@FindBy(id="employee_empname")
	WebElement employeename;
	@FindBy(id="employee_father_name")
	WebElement employeefather;
	@FindBy(id="dob")
	WebElement DateofBirth;
	@FindBy(id="employee_gender")
	WebElement Gender;
	@FindBy(id="marital_status")
	WebElement MaritalStatus;
	@FindBy(id="doj")
	WebElement DateofJoining;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/nav/ul/li[1]/a")
	WebElement PresentAddress;
	@FindBy(id="employee_present_state_id")
	WebElement State;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/nav/ul/li[7]/a/span")
	WebElement SelectClassficationDetail;
	@FindBy(id="employee_detail_salary_group_id")
	WebElement SelectSalaryGroup;
	@FindBy(id="employee_detail_branch_id")
	WebElement SelectBranch;
	@FindBy(id="employee_detail_attendance_configuration_id")
	WebElement SelectAttendanceConfigId;
	@FindBy(id="employee_detail_leave_policy_master_id")
	WebElement SelectLeavyPolicyId;
	@FindBy(id="employee_detail_financial_institution_id")
	WebElement SelectFinanacialInstitution;
	@FindBy(id="employee_detail_classification_1")
	WebElement SelectDesignation;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/div/div[8]/input")
	WebElement CreateEmployee;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullmessage;
	@FindBy(id="emp_detail")
	WebElement ClickEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement SelectEmployeeDetails;
	@FindBy(id="filter_head")
	WebElement ClickOnFilterHead;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"employees_dtable\"]/tbody/tr/td[contains(text(),'Amaan')]/parent::tr/td[6]/a[2]")
	WebElement DeleteEmployee;
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement ClickOnEmployDetails;
	
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement ClickOnLoad;
	
	public CheckifSalaryAdvanceGeneralLinksEmployeeMasterredirectstoEmployee(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonsalary() {
		ClickOnSalary.click();
	}
	public void clickonadvancedetail() {
		ClickOnAdvanceDetail.click();
	}
	public void clickongenerallinks() {
		ClickonGeneralLinks.click();
	}
	public void clickonemployeemaster() {
		ClickOnEmployeeMaster.click();
	}
	public void addnewemployee() {
		AddNewEmployee.click();
	}
	public void enterEmployeeid(String value) throws Exception{
	    	employeeid.sendKeys(value);
	}
	    
	public void enterEmployeeref(String value) throws Exception{
	    	employeeref.sendKeys(value);
	} 
	public void enterEmployeename(String value) throws Exception {
	    	employeename.sendKeys(value);
	}
    public void enterEmployeefather(String value) throws Exception{
	    	employeefather.sendKeys(value);
	}
    public void selectDateofBirth(String value) throws Exception {
	    	DateofBirth.sendKeys(value);
	}
	public void selectGender(String value){
			dropDownSelect(Gender, value);
	}
	public void selectMaritalStatus(String value){
			dropDownSelect(MaritalStatus, value);
	}
	public void selectDateofJoining(String value) throws Exception {
			DateofJoining.sendKeys(value);
	}	
	public void clickPresentAddress(){
			PresentAddress.click();
	}
	public void selectState(String value){
			dropDownSelect(State, value);
	}		
	public void selectclassificationdetail(){
    	SelectClassficationDetail.click();
    }
    public void selectsalstructure(String value) {
    	dropDownSelect(SelectSalaryGroup, value);
    }
    public void selectbranch(String value) {
    	dropDownSelect(SelectBranch, value);
    }
    public void selectattendancestructure(String value) {
    	dropDownSelect(SelectAttendanceConfigId, value);
    }
    public void selectbank(String value) {
    	dropDownSelect(SelectFinanacialInstitution, value);
    }
    public void selectleavepolicy(String value) {
    	dropDownSelect(SelectLeavyPolicyId, value);
    }
    public void selectdesignation(String value) {
    	dropDownSelect(SelectDesignation, value);
    }
    public void createemployee() {
    	CreateEmployee.click();
    }
    public String getMessage(){
		return successfullmessage.getText();
	}
    public void clickemployee() {
    	ClickEmployee.click();
    }
    public void selectemployeedetails() {
    	SelectEmployeeDetails.click();
    }
    public void clickonfilterhead() {
    	ClickOnFilterHead.click();
    }
    public void clickLoad() throws Exception{
    	Load.click();
    }
    public void deleteemployee() {
    	DeleteEmployee.click();
    	switchToPopUpAndAccept(driver);
    }
    public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonemployeedetails() {
		ClickOnEmployDetails.click();
	}
	public void clickonfilter() {
		ClickOnFilterHead.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
}
