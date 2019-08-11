package com.ineeditweb.testcases;

import org.testng.annotations.Test;

import com.ineeditweb.pageactions.HomePageActions;

public class HomePageTest {

	
	@Test(groups = {"regression"})
	public void homePageTest()
	{
		HomePageActions home = new HomePageActions();
		home.doSelectRouting();
	}
	
}
