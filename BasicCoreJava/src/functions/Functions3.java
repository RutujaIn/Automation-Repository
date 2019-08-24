package functions;

public class Functions3 {

	public static void main(String[] args) 
	{

		String r = result(68);
		System.out.println(r);
		
	}
	
	public static String result(int res) 
	{
		 String r = null; //not executing else part
		 
		if (res>=35 && res<60)
		{
		      r="pass";
	    }else if (res>=60 && res<=75)
		{
		      r="first";
   	
	    }else if (res>75)
	    		{
		      r ="distinction";
		        }
	
		return r;
	
	}
}
