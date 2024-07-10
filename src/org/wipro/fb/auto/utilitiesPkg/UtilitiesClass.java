package org.wipro.fb.auto.utilitiesPkg;


import java.io.FileReader;
import java.util.Properties;

public class UtilitiesClass 
{

	public static String readconfig(String key) throws Exception
	{
		FileReader fr = new FileReader("./DataFile/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
	
	public static String readelement(String key) throws Exception
	{
		FileReader fr = new FileReader("./DataFile/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
}
