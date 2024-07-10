package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario6 
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is first test case");
	}
	
	@Test
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
		
		Assert.assertEquals("Hello", "Hello1");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("this is fifth test case");
		Assert.assertEquals("Hello", "Hello1");
	}
	
	@Test
	public void six_testcase()
	{
		System.out.println("this is six test case");
	}
	
	@Test
	public void seven_testcase()
	{
		System.out.println("this is seven test case");
	}
	
	
	
}
