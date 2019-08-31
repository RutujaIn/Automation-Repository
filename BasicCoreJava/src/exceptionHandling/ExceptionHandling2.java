package exceptionHandling;

public class ExceptionHandling2 {

	public static void main(String[] args) 
	{

		try 
		{
			String str="anand";
			System.out.println(str.charAt(8));
					
					
			System.out.println(10/0);
			
		}catch(ArithmeticException e)
		{
			System.out.println("Recovery scenario number");
			System.out.println(e.getMessage());
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Recovery scenario string");
			System.out.println(e.getMessage());
		}
	}

}
