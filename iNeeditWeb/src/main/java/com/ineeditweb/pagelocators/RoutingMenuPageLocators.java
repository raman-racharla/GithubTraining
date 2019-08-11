package com.ineeditweb.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RoutingMenuPageLocators {
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Carpentry or Furniture')]")
	public WebElement routingMenu;

}
