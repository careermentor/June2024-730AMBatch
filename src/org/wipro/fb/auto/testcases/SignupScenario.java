package org.wipro.fb.auto.testcases;

import org.testng.annotations.Test;
import org.wipro.fb.auto.basePkg.InitiateBrowser;
import org.wipro.fb.auto.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void tc02_signupfunctionality() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccountbttn();
		sign.enter_firstname("Selenium");
		sign.select_dob_day("10");
		sign.click_maleRadiobttn();
		
	}
	
}
