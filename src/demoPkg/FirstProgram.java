package demoPkg;

public class FirstProgram 
{

	
	int a = 10;
	int aa = 20;
	float b = 10.5f;
	char c = 'X';
	String d = "Java";
	boolean e = true;
	
	public void printValues()
	{
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}
	
	
	

	public static void main(String[] args) 
	{
		System.out.println("This is the first java program");
	
		FirstProgram abc = new FirstProgram();
		
		FirstProgram abc1 = new FirstProgram();
		
		abc.printValues();
		
		System.out.println(abc.a);
	
	}

	
	
	
	
	
}
