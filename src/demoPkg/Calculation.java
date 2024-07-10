package demoPkg;

  class Calculation
{

	int a = 10;

	int b = 40;
	
	
	 void printVal()
	{
		System.out.println(a);  //10
	}
	
	 void addition()
	{
		final int a = 20;  //constant
		//a=60;
		int b = 30;
		b=70;
		
		int c = a+b;
		
		System.out.println(a);  //20
		
		System.out.println(c);
		
		System.out.println("this is sum of a&b: " + c);
		
		System.out.println(a+b);  //20+30 = 50
		
		
	}
	
	public static void main(String[] args) 	{
		Calculation cal = new Calculation();
		
		cal.addition();
		cal.printVal();
		
		System.out.println(cal.a);
		
	}
	
	
	
	
	
	
	
}
