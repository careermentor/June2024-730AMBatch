package org.xyz.auto.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRuntime
{
	WebDriver driver;
	@Test
	public void testwebsitecontrol() throws Exception
	{
		
		//step1
		driver= new ChromeDriver();
		
		String expURL = "https://www.facebook.com";
		
		driver.get(expURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, expURL);  //hard assertion
		
		SoftAssert sa = new SoftAssert();  
		sa.assertEquals(ActURL, expURL);   //soft assertion
		
		System.out.println("this testcase get failed");
		
		String ExpPagetitle = "Facebook – log in or sign up";
		
		String ActPageTitle = driver.getTitle();
		System.out.println(ActPageTitle);
		
		Assert.assertEquals(ActPageTitle, ExpPagetitle);
		
		//login page should get displayed
		
		String expusernamebox = "Email address or phone number";
		String actusernamebox = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(actusernamebox);
		
		Assert.assertEquals(actusernamebox, expusernamebox);
		
		String ExpLogin = "Log in";
		String ActLogin = driver.findElement(By.name("login")).getText();
		System.out.println(ActLogin);
		
		Assert.assertEquals(ActLogin, ExpLogin);
		
		Point geloc = driver.findElement(By.name("login")).getLocation();
		System.out.println(geloc);
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.findElement(By.name("login")).isDisplayed());
		
		
		driver.close();
		
		
		
		sa.assertAll();
		
		
	}	
	
}
