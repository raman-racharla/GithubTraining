package com.ineeditweb.testcases;

import org.testng.annotations.Test;

import com.ineeditweb.pageactions.RequestPopupActions;

public class RequestPopupTest {
	
	@Test(groups = {"smoke"})
	public void requestPopupTest()
	{
		RequestPopupActions requestPopup = new RequestPopupActions();
		requestPopup.clickSoundsGood();

}
}
