package exceptionHandling;

public class ExceptionHandling { 

	public static void main(String[] args) throws InterruptedException //throws->only for checked exception
	{
      pause1(6000);
      pause(6000);
      test();
	}

	public static void pause(int seconds) throws InterruptedException //passing to next user
	{
		Thread.sleep(seconds);
	}
	
	public static void pause1(int seconds) 
	{
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
		
    public static void test() throws ArithmeticException
    {
    	
    }
	}
