package demoPkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileHandling 
{
	
	public static void readprop() throws Exception
	{
	
	//	File f = new File("./DataFile/data.properties");
		
		FileReader fr = new FileReader("./DataFile/data.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("name"));
		
		
		System.out.println(prop.get("auto"));
	
	}
	public static void writefile() throws Exception
	{
	
		File f = new File("./DataFile/newfile.txt");
		
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nthis is forth line");
		fw.flush();
		fw.close();
		
	}
	public static void readfile() throws Exception
	{
		File f = new File("C:\\Users\\Santosh\\Desktop\\abc.txt");
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read();  //116
		
		while(r!=-1)  //true
		{
			
			System.out.print((char)r);
			r = fr.read();
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) throws Exception {
		FileHandling.readprop();
	}
	
}
