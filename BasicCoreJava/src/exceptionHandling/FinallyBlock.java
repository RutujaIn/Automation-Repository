package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) 
	{
      try {
    	  System.out.println(10/0);//(10/1)
    	  
    	  System.out.println("anand");
    	  
      }catch(Exception e)
      {
    	  System.out.println(e.getMessage());
    	  
      }finally {
    	  
    	  System.out.println("Finally block"); //works for both try & catch
      }
      
	}

}
