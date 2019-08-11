package com.ineeditweb.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RequestPopupLocators {

	@FindBy(how=How.ID, using="btnSoundsGood")
	public WebElement soundsGoodButton;
	
}