package exceptionHandling;

public class UncheckExceptions { //run time exceptions

	public static UncheckExceptions obj;
	
	static int a;
	public static void main(String[] args) 
	{
		String str="anand";
		//System.out.println(str.charAt(6));

		  System.out.println(10/0);
          System.out.println(a);
          
          //obj= new UncheckExceptions();
		  obj.test();
		
	}
	
	public static void test()
	{
		
	}

}
