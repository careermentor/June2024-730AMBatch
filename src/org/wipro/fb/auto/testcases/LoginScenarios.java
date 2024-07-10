package org.wipro.fb.auto.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.wipro.fb.auto.basePkg.InitiateBrowser;
import org.wipro.fb.auto.pages.LoginPage;

public class LoginScenarios extends InitiateBrowser
{

		
	@Test
	public void tc01_validateloginfunc() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("user1");
		login.enter_password("passs1");
		login.click_loginbttn();
		
		driver.findElement(By.id("email")).sendKeys("abc");
		
	}
	
}
