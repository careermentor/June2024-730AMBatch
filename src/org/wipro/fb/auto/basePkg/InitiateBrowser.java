package org.wipro.fb.auto.basePkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.fb.auto.utilitiesPkg.UtilitiesClass;

public class InitiateBrowser 
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(UtilitiesClass.readconfig("Browsername").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(UtilitiesClass.readconfig("Browsername").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(UtilitiesClass.readconfig("Browsername").equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
		}
		
		else
		{
			driver = new ChromeDriver();
		}

		
		driver.get(UtilitiesClass.readconfig("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
