package com.ineeditweb.testcases;

import org.testng.annotations.Test;

import com.ineeditweb.pageactions.SubmitRequestPageActions;

public class SubmitRequestPageTest {
	
	@Test(groups = {"regression"})
	public void submitRequestPageTest()
	{
		SubmitRequestPageActions submitRequestPage = new SubmitRequestPageActions();
		submitRequestPage.inputName();
		submitRequestPage.inputNotes();
		submitRequestPage.clickIneedit();
	}

}
