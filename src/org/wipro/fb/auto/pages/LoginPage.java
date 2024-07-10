package org.wipro.fb.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.fb.auto.utilitiesPkg.UtilitiesClass;

public class LoginPage 
{

	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
	
		this.driver=driver;
		//this is to make
		
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(UtilitiesClass.readelement("login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(UtilitiesClass.readelement("login_password_name"))).sendKeys(pass);
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.name(UtilitiesClass.readelement("login_loginbttn_name"))).click();
	}
	
	
}
