package com.ineeditweb.pageactions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ineeditweb.base.BasePage;
import com.ineeditweb.pagelocators.RequestPopupLocators;

public class RequestPopupActions extends BasePage {
	
public RequestPopupLocators requestPopup;
	
	public RequestPopupActions()
	{
		this.requestPopup = new RequestPopupLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);
		PageFactory.initElements(factory, this.requestPopup);
	}
	
    public void clickSoundsGood()
    {
    	requestPopup.soundsGoodButton.click();
    	
    }

}
