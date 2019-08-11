package com.ineeditweb.pageactions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ineeditweb.base.BasePage;
import com.ineeditweb.pagelocators.RoutingMenuPageLocators;

public class RoutingMenuPageActions extends BasePage {
	
	public RoutingMenuPageLocators routingMenuPage;
	
	public RoutingMenuPageActions()
	{
		this.routingMenuPage = new RoutingMenuPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);
		PageFactory.initElements(factory, this.routingMenuPage);
	}
	
	
	public void doSelectSubRouting()
	{
		routingMenuPage.routingMenu.click();
	}
	

}
