package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class SaveIncomeFromOtherSourcesInterestonNSC extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//*[@id=\"computed_employee_tds\"]/tbody/tr/td [contains(text(),'Tina')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/li[3]/a")
	WebElement IncomeFromOtherSources;
	@FindBy(id="income_from_other_sources_interest_on_nsc_net_amount")
	WebElement NetAmount;
	@FindBy(id="income_from_other_sources_interest_on_nsc_exemption")
	WebElement Exemption;
	@FindBy(id="less-deduction-under-section-57")
	WebElement LessDedus;
	@FindBy(xpath="//div[3]/input")
	WebElement SaveBtn;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement UpdateSuccess;
	
	public SaveIncomeFromOtherSourcesInterestonNSC(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickComputationDetails() {
		ComputationDetails.click();
	}
	public void ClickDetails() {
		Details.click();
	}
	public void ClickIncomeFromOtherSources() {
		IncomeFromOtherSources.click();
	}
	public void EnterNetAmount(String value) {
		NetAmount.clear();
		NetAmount.sendKeys(value);
	}
	public void EnterExemption(String value) {
		Exemption.clear();
		Exemption.sendKeys(value);
	}
	public void EnterLessDedus(String value) {
		LessDedus.clear();
		LessDedus.sendKeys(value);
	}
	public void ClickSaveBtn() {
		SaveBtn.click();
	}
	public String getMessage() {
		return UpdateSuccess.getText();
	}

}
