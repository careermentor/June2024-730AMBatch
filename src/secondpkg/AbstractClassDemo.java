package secondpkg;

public abstract class AbstractClassDemo 
{
	
	int i = 20;
	
	
	public void printStatement()
	{
		System.out.println("this is concrete method");
		
		int i = 40;
		i=50;
	}
	
	public abstract void credntial();
	
	public static void main(String[] args) {
		//AbstractClassDemo ab = new AbstractClassDemo();
	}
	
	
}
