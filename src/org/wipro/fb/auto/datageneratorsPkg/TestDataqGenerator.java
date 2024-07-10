package org.wipro.fb.auto.datageneratorsPkg;

import org.testng.annotations.DataProvider;

public class TestDataqGenerator
{

	@DataProvider(name="data")
	public Object[][] testdata()
	{
		String a = "user1";
		Object[] b = {"user1","pass1"};
		Object[][] c = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		
		return c;
	}
	
}
