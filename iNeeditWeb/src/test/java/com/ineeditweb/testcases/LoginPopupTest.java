package com.ineeditweb.testcases;

import org.testng.annotations.Test;

import com.ineeditweb.base.BasePage;
import com.ineeditweb.pageactions.LoginPopupActions;

public class LoginPopupTest {
	
	@Test(groups = {"regression"})
	public void loginPopupTest() throws InterruptedException
	{
		BasePage.initConfiguration();
		LoginPopupActions login = new LoginPopupActions();
		login.doLogin();
		
	}

}
