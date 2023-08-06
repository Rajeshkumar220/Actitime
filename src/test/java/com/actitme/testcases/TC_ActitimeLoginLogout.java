package com.actitme.testcases;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitme.pages.ActitimeLoginPage;

@Listeners(com.actitime.generics.Screenshot.class)
public class TC_ActitimeLoginLogout extends BaseTest
{
	@Test
	public void loginlogout() throws IOException, InterruptedException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
	}
	
	@Test(dependsOnMethods = "loginlogout")
	public void titlevalidation()
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.validateTitle();
	}
}