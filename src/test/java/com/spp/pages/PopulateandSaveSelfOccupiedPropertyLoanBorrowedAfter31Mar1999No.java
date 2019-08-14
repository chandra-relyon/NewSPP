package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class PopulateandSaveSelfOccupiedPropertyLoanBorrowedAfter31Mar1999No extends BasePage {
@FindBy(id="tds")
WebElement TDS;
@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
WebElement ComputationDetails;
@FindBy(xpath="//*[@id=\"computed_employee_tds\"]/tbody/tr/td [contains(text(),'Tina')]/parent::tr/td[4]/a")
WebElement Details;
@FindBy(xpath="//*[@id=\"ui-id-3\"]/h3")
WebElement HouseRentProperty;
@FindBy(xpath="//*[@id=\"ui-id-4\"]/li[2]/a")
WebElement SelfOccupiedProperty;
@FindBy(id="house_property_self_occupied_property_gross_anual_value")
WebElement GrossAnnualValue;
@FindBy(id="house_property_self_occupied_property_share_in_percentage")
WebElement ShareinPercentage;
@FindBy(id="house_property_self_occupied_property_interest_paid_on_borrowed_capital")
WebElement InterestPaidOnBorrowedCapital;
@FindBy(id="house_property_self_occupied_property_pre_construction_interest")
WebElement PreConstructionInterest;
@FindBy(xpath="//*[@id=\"self_occupied_propert\"]/div[2]/input")
WebElement PopulateAndSave;
@FindBy(xpath="//*[@id=\"self-occupied-form\"]/section/div[2]/strong")
WebElement UpdateSuccess;


public PopulateandSaveSelfOccupiedPropertyLoanBorrowedAfter31Mar1999No(WebDriver driver) {
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
public void ClickHouseRentProperty() {
	HouseRentProperty.click();
}
public void ClickSelfOccupiedProperty() {
	SelfOccupiedProperty.click();
}
public void EnterGrossAnnualValue(String value) {
	GrossAnnualValue.clear();
	GrossAnnualValue.sendKeys(value);
}
public void EnterShareinPercentage(String value) {
	ShareinPercentage.clear();
	ShareinPercentage.sendKeys(value);
}
public void EnterInterestPaidOnBorrowedCapital(String value) {
	InterestPaidOnBorrowedCapital.clear();
	InterestPaidOnBorrowedCapital.sendKeys(value);
}
public void EnterPreConstructionInterest(String value) {
	PreConstructionInterest.clear();
	PreConstructionInterest.sendKeys(value);
}
public void ClickPopulateAndSave() {
	PopulateAndSave.click();
}
public String getMessage() {
	return UpdateSuccess.getText();
} 
}

