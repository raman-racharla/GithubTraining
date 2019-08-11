package com.ineeditweb.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPopupLocators {
	
	@FindBy(how=How.ID, using="MainCampusPop_chosen")
	public WebElement facilityDropDown;
	
	@FindBy(how=How.XPATH, using="//div[@id='MainCampusPop_chosen']//input")
	public WebElement facilitySearch;	
	
	@FindBy(how=How.ID, using="UnitPop_chosen")
	public WebElement departmentDropDown;
	
	@FindBy(how=How.XPATH, using="//div[@id='UnitPop_chosen']//input")
	public WebElement departmentSearch;
	
	@FindBy(how=How.ID, using="btnSubmit")
	public WebElement submitButton;

	}
