package functions;

public class Functions3 {

	public static void main(String[] args) 
	{

		result(68);
		
	}
	
	public static String result(int res) 
	{

		if (res>=35 && res<60)
		{
		     String r1="pass";
	    }else if (res>=60 && res<=75)
		{
		     String r2="first";
   	
	    }else if (res>75)
	    		{
		     String r3 ="distinction";
		        }
	
		return r1;
		return r2;
		return r3;
		
	}
}
