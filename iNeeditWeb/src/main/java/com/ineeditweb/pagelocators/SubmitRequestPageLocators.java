package com.ineeditweb.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SubmitRequestPageLocators {
	
	
	@FindBy(how=How.ID, using="TxtNotesDescriton")
	public WebElement notes;
	
	@FindBy(how=How.ID, using="TxtName")
	public WebElement name;
	
	@FindBy(how=How.ID, using="btnFormSubMission")
	public WebElement iNeeditButton;

}
