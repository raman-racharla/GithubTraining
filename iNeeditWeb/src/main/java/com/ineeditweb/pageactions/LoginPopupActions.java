package com.ineeditweb.pageactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import com.ineeditweb.base.BasePage;
import com.ineeditweb.base.Constants;
import com.ineeditweb.pagelocators.LoginPopupLocators;

public class LoginPopupActions extends BasePage {
	
	public LoginPopupLocators loginPopup;
	
	
	public LoginPopupActions()
	{
		this.loginPopup = new LoginPopupLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.loginPopup);
	}
	
	public void doLogin() throws InterruptedException
	{
		loginPopup.facilityDropDown.click();
		loginPopup.facilitySearch.sendKeys(Constants.facility);
		loginPopup.facilitySearch.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		loginPopup.departmentDropDown.click();
		loginPopup.departmentSearch.sendKeys(Constants.department);	
		loginPopup.departmentSearch.sendKeys(Keys.TAB);
		
		loginPopup.submitButton.click();
		
	}

}
