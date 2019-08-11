package com.ineeditweb.testcases;

import org.testng.annotations.Test;

import com.ineeditweb.pageactions.LocationPageActions;

public class LocationPageTest {
	
	@Test(groups = {"regression"})
	public void locationPageTest()
	{
		LocationPageActions locationPage = new LocationPageActions();
		locationPage.doSelectBuilding();
		locationPage.doSelectArea();
		locationPage.doSelectRoom();
		locationPage.doClickContinue();
				
	}

}
