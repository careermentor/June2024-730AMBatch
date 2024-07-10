package org.wipro.fb.auto.testcases;


import org.testng.annotations.Test;
import org.wipro.fb.auto.basePkg.InitiateBrowser;
import org.wipro.fb.auto.datageneratorsPkg.TestDataqGenerator;
import org.wipro.fb.auto.pages.LoginPage;

public class LoginScenarios_DDF extends InitiateBrowser
{

		
	@Test(dataProvider="data",dataProviderClass=TestDataqGenerator.class)
	public void tc01_validateloginfunc(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
	}
	
	
	
}
