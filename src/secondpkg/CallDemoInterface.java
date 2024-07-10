package secondpkg;

public class CallDemoInterface implements DemoInterface
{

	
	public void meth1i() 
	{
	
		System.out.println("this is method 1 of interface");
	}


	public void meth2i()
	{
		
		System.out.println("this is method 2 of interface");
	}

	public static void main(String[] args) {
		CallDemoInterface ci = new CallDemoInterface();
		ci.meth1i();
		ci.meth2i();
	}
	
}
