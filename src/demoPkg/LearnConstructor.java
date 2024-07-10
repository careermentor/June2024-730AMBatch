package demoPkg;

public class LearnConstructor 
{

	
	
	
	 LearnConstructor(int a, int b)
	{
		int c = a+b;
		System.out.println("constructor's addition of a&b: " + c);
	}
	
	public float sum()
	{
		float a = 20.5f;
		int b = 30;
		float c = a + b;
		
		System.out.println("sum of a&b: " + c);
		return c;
		
	}
	
	public int add(int a,	int b)
	{
		
		int c = a+b;
		System.out.println("addition of a&b: " + c);
		return c;
	}
	
	//30+40+50
	
	public static void main(String[] args)
	{
		LearnConstructor q11 = new LearnConstructor();
		
		LearnConstructor q1 = new LearnConstructor(50,60); //constructor will be automatically called
		
		LearnConstructor q12 = new LearnConstructor(70,80); 
		
		
		
		
		
		q11.sum();
		
		q12.add(40, 20);
		
		int y = q1.add(30, 40);
		q1.add(y, 50);

	}
	
	public LearnConstructor()
	{
		float a = 20.5f;
		int b = 30;
		float c = a + b;
		
		System.out.println("constructor's sum of a&b: " + c);
		
	}

}
