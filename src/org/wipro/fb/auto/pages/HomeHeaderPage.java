package org.wipro.fb.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.fb.auto.utilitiesPkg.UtilitiesClass;

public class HomeHeaderPage 
{

	WebDriver driver;
	
	public HomeHeaderPage(WebDriver driver) 
	{
	
		this.driver=driver;
		//this is to make
		
	}

	public void click_featureHeader() throws Exception
	{
		driver.findElement(By.xpath(UtilitiesClass.readelement("home_header_features_link_xpath"))).click();
	}
	
	
}
