package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteLeaveEncashment extends BasePage{
	@FindBy(id="leave")
	WebElement ClickOnLeave;
	@FindBy(xpath="//a[text()='Leave Encashment']")
	WebElement ClickOnLeaveEncashment;
	@FindBy(id="filter_head")
	WebElement ClickOnFilter;
	@FindBy(xpath="//*[@id='bf_form']/div[10]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id='dt_leave_encashment']/tbody/tr/td[contains(text(),'Raj')]/parent::tr/td[3]/a")
	WebElement ClickOnView;
	@FindBy(xpath="//*[@id='employee_leaves_encashed']/table/tbody/tr/td[contains(text(),'Casual Leave')]/parent::tr/td/a/img")
	WebElement ClickOnDelete;
	@FindBy(xpath="//strong[text()='Leave encashment successfully deleted.']")
	WebElement SuccessfulMessage;
	
	
	public DeleteLeaveEncashment(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonleave() {
		ClickOnLeave.click();
	}
	public void clickonleaveencashment() {
		ClickOnLeaveEncashment.click();
	}
	public void clickonfilter() {
		ClickOnFilter.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonview() {
		ClickOnView.click();
	}
	public void clickondelete() {
		ClickOnDelete.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
}
