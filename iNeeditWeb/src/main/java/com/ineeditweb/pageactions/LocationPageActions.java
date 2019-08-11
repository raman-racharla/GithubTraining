package com.ineeditweb.pageactions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ineeditweb.base.BasePage;
import com.ineeditweb.pagelocators.LocationPageLocators;

public class LocationPageActions extends BasePage {

	public LocationPageLocators locationPage;
	
	public LocationPageActions()
	{
		this.locationPage = new LocationPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, this.locationPage);
	}
	
	
	public void doSelectBuilding()
	{   
		locationPage.building.click();
	}
	
	public void doSelectArea()
	{
		locationPage.area.click();
	}
	
	public void doSelectRoom()
	{
		locationPage.room.click();
	}
	
	public void doClickContinue()
	{
		locationPage.continueButton.click();
	}
}


