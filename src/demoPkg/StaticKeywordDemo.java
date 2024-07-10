package demoPkg;

public class StaticKeywordDemo 
{

	public void meth1()
	{
		System.out.println("this is static method output");
	}
	
	static int a = 20;
	
	public static void meth2()
	{
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		StaticKeywordDemo skd = new StaticKeywordDemo();
		skd.meth1();
		
		
		StaticKeywordDemo.meth2();
		
	}
}
