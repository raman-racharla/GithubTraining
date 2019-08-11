package com.ineeditweb.testcases;

import org.testng.annotations.Test;

import com.ineeditweb.pageactions.RoutingMenuPageActions;

public class RoutingMenuPageTest {
	
	@Test(groups = {"regression"})
	public void routingMenuPageTest()
	{
		RoutingMenuPageActions routingMenu = new RoutingMenuPageActions();
		routingMenu.doSelectSubRouting();
	}

}
