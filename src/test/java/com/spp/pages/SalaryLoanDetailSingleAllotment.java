package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class SalaryLoanDetailSingleAllotment extends BasePage{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(linkText="Loan Detail")
	WebElement LoanDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[1]/td[6]/a")
	WebElement View;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[1]/span/a")
	WebElement AddNewLoan;
	@FindBy(id="standing_instruction_detail_standing_instruction_master_id")
	WebElement LoanName;
	@FindBy(id="sal_date")
	WebElement LoanDate;
	@FindBy(id="standing_instruction_detail_financial_institution_id")
	WebElement InstitutionName;
	@FindBy(id="standing_instruction_detail_loan_account_no")
	WebElement LoanAccountNo;
	@FindBy(id="standing_instruction_detail_actual_amount")
	WebElement Amount;
	@FindBy(id="standing_instruction_detail_lumpsum_amount")
	WebElement InstallmentAmount;
	@FindBy(id="dpMonthYear")
	WebElement RecoverDate;
	@FindBy(id="update_save")
	WebElement CreateButton;	
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//div[2]/table/tbody/tr[1]/td[8]/a")
	WebElement DeleteButton;
	
	public SalaryLoanDetailSingleAllotment(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickLoanDetails() throws Exception{
		LoanDetails.click();
	}
	public void clickAddEmployee() throws Exception{
		AddEmployee.click();
	}
	public void clickLoad() throws Exception{
		Load.click();
	}
	public void clickView() throws Exception{
		View.click();
	}
	public void clickAddNewLoan() throws Exception{
		AddNewLoan.click();
	}
	public void clickLoanName(String value) throws Exception{
		dropDownSelect(LoanName,value);
		
	}
	public void selectLoanDate(String value) throws Exception{
			LoanDate.sendKeys(value);
	}
	
	public void clickLoanAccountNo(String value) throws Exception{
		LoanAccountNo.sendKeys(value);
	}
	public void clickInstallmentAmount(String value) throws Exception{
		InstallmentAmount.clear();
		InstallmentAmount.sendKeys(value);
	}
	public void clickAmount(String value) throws Exception{
		Amount.sendKeys(value);
	}
	public void selectInstitutionName(String value){
		dropDownSelect(InstitutionName, value);
	}
	public void clickRecoverDate(String value) throws Exception{
		RecoverDate.sendKeys(value);
	}
	
	public void clickCreateButton() throws Exception{
		CreateButton.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
}
