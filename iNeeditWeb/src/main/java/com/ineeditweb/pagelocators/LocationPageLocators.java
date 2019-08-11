package com.ineeditweb.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocationPageLocators {
	
	@FindBy(how=How.XPATH, using="//div[@id='orderContainer']//div[1]//div[1]//div[1]")
	public WebElement building;
	
	@FindBy(how=How.XPATH, using="//div[@id='FloorContainer']//div[1]//div[1]")
	public WebElement area;
	
	@FindBy(how=How.XPATH, using="//div[@id='RoomAndLocationContainer']//div[1]//div[1]//div[1]")
	public WebElement room;
	
	@FindBy(how=How.ID, using="BtnLocationContinue")
	public WebElement continueButton;
	


	

}
