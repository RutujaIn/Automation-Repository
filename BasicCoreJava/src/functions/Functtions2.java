package functions;

public class Functtions2 {

	public static void main(String[] args) 
	{	
       //sum(10,20);
		
		int sum1, sum2;
		sum1=sum(10,20);
		sum2=sum(30,40);
		System.out.println(sum1+sum2);
		
		boolean res;
		res=eligible(31);
		if (res)
		{
		System.out.println("You are eligible");
		}else 
		{
		System.out.println("You are not eligible");
		}
						
		
	}

	//public static void sum(int a, int b) 
	
	public static int sum(int a, int b) 

	{		
    // System.out.println(a+b);
		
		return a+b;
	}
	
	
	public static boolean eligible(int age) 

	{		
		
		if (age>=18 && age<=30)
		{
			return true;
		}else
			return false;
	}
	
	
	
}
