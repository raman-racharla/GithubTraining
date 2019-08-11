package com.ineeditweb.pageactions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ineeditweb.base.BasePage;
import com.ineeditweb.pagelocators.HomePageLocators;

public class HomePageActions extends BasePage {
	
	
	public HomePageLocators home;
	
	public HomePageActions()
	{
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);
	}
	
   public void doSelectRouting()
   {
	   home.routing.click();
   }

}
