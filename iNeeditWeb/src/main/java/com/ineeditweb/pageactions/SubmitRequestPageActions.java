package com.ineeditweb.pageactions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.ineeditweb.base.BasePage;
import com.ineeditweb.base.Constants;
import com.ineeditweb.pagelocators.SubmitRequestPageLocators;

public class SubmitRequestPageActions extends BasePage  {
	
	public SubmitRequestPageLocators submitRequestPage;
	
	public SubmitRequestPageActions()
	{
		this.submitRequestPage = new SubmitRequestPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.submitRequestPage);
	}
	
    public void inputNotes()
    {
    	submitRequestPage.notes.click();
    	submitRequestPage.notes.sendKeys(Constants.notes);
    }
    
    public void inputName()
    {
    	submitRequestPage.name.sendKeys(Constants.name);
    }
    
    public void clickIneedit()
    {
    	submitRequestPage.iNeeditButton.click();
    }
}
