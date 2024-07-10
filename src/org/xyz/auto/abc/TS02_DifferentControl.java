package org.xyz.auto.abc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS02_DifferentControl
{
	WebDriver driver;
	@Test
	public void testwebsitecontrol() throws Exception
	{
		
		driver= new ChromeDriver();
		driver.navigate().to("https://thetestingworld.com/testings/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		int a = 10;
		System.out.println(a);
		
		System.out.println(10);
		
		WebElement uname = driver.findElement(By.name("fld_username"));
		uname.sendKeys("Selenium");
		
		driver.findElement(By.name("fld_username")).clear();
		driver.findElement(By.name("fld_username")).sendKeys("Java");
		
		driver.findElement(By.cssSelector("[value='home']")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		//gen.selectByIndex(1);
		//gen.selectByValue("2");
		gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Hawaii"));
		
		st.selectByVisibleText("Arizona");
		
		
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());
		
		driver.findElement(By.name("terms")).click();
		
		boolean x = driver.findElement(By.name("terms")).isSelected();
		Assert.assertEquals(x, true);
		
		//driver.findElement(By.className("displayPopup")).click();
	}
	
}
