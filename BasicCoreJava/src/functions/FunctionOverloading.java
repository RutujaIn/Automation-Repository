package functions;

public class FunctionOverloading {

	//function same, different parameters
	public static void main(String[] args) 
	{
		sum(10,20);
		sum(10,20,30);
	}
	
	public static int sum(int a, int b) 
	{
		return a+b;
	}
	
   /* int sum(int a, int b) 
	{
		return a+b;   //no method overloading for same parameters
	}*/

	public static int sum(int a, int b, int c) 
	{
		return a+b+c;
	}

}
