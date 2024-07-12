package org.wipro.fb.auto.testcases;

import org.testng.annotations.Test;
import org.wipro.fb.auto.basePkg.InitiateBrowser;
import org.wipro.fb.auto.pages.HomeHeaderPage;

public class HomeHeaderScenario extends InitiateBrowser
{

		
	@Test
	public void tc01_validate_allheader() throws Exception
	{
		HomeHeaderPage header = new HomeHeaderPage(driver);
		header.click_featureHeader();
		
		
	}
	
}
