package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario 
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is first test case");
		
		Assert.assertEquals("Hello", "Hellow World");
	}
	
	@Test(groups="Smoke")
	public void second_testcase()
	{
		System.out.println("this is second test case");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("this is third test case");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
	}
	
	@Test(groups="Regression")
	public void fifth_testcase()
	{
		System.out.println("this is fifth test case");
	}
	
	@Test
	public void six_testcase()
	{
		System.out.println("this is six test case");
	}
	
	@Test(groups={"Regression","Sanity","Smoke"})
	public void seven_testcase()
	{
		System.out.println("this is seven test case");
	}
	
	
	
}
