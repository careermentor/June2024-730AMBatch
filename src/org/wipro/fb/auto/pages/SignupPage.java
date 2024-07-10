package org.wipro.fb.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.fb.auto.utilitiesPkg.UtilitiesClass;

public class SignupPage 
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver) 
	{
	
		this.driver=driver;
		
	}

	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(UtilitiesClass.readelement("login_createnewaccount_xpath"))).click();
	}
	
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(UtilitiesClass.readelement("signup_firstname_name"))).sendKeys(fname);
		
	}
	
	public void select_dob_day(String d) throws Exception
	{
		Select dob_d = new Select(driver.findElement(By.name(UtilitiesClass.readelement("signup_dob_day_name"))));
		dob_d.selectByVisibleText(d);
		
	}
	
	public void click_maleRadiobttn() throws Exception
	{
		driver.findElement(By.xpath(UtilitiesClass.readelement("signup_male_xpath"))).click();
	}
	
	
}
