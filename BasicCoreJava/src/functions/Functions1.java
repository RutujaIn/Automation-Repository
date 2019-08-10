package functions;

public class Functions1 {

	public static void main(String[] args)
	
	{
		
		/*int a=10;
		int b=20;
		System.out.println(a+b);
		
		int c=30;
		int d=40;
		System.out.println(c+d);*/
		
		sum(10,20);
		sum(30,40);
		sum(50,60);//function call,parameter passing
		message();
		
		
		multiplication(5,2);
		subtraction(5,2);
		division(20,10);
		
			
	}
	
  /* public static void sum()
	{
		
		int a=10;
		int b=20;
		System.out.println(a+b);
				
	}*/
	
	  public static void sum(int a,int b)
		{
					
			System.out.println(a+b);
					
		}
	
	
      public static void message()
  	   {
  		
  		System.out.println("Welcome!");
  				
  	   }
      
      
      public static void multiplication(int a,int b)
    		{
    			   		
    			System.out.println(a*b);
    					
    		}
	
      public static void subtraction(int a,int b)
		{
			
			System.out.println(a-b);
					
		}

      
      public static void division(int a,int b)
		{
			
			System.out.println(a/b);
					
		}
}
