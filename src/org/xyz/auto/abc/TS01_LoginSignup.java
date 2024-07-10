package org.xyz.auto.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TS01_LoginSignup
{
	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() throws Exception
	{
		
		driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		/*
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		*/
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close(); //will close one window
		driver.quit();  //this will close all the windows (open by automated software
	}
	

	@Test
	public void validateloginfunc()
	{
		
		
		driver.findElement(By.id("email")).sendKeys("user1");
		driver.findElement(By.name("pass")).sendKeys("1234456");
		driver.findElement(By.name("login")).click();
		
	}
	
	@Test
	public void validatesignupfunc() throws Exception
	{
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
	}
	
	
}
