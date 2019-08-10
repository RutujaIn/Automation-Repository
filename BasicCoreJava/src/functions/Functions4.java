package functions;

public class Functions4 {

	public static void main(String[] args) 
	{

		int [] marks= {34,86,45,78,91};
		String str=finalResult(marks);
		System.out.println(str);
		
	}
	
	public static String finalResult(int[] arr)
	{
	  int total=0;
	  boolean fail=false;
	  for(int i=0; i<arr.length; i++)
	  {
		  total= total + arr[i];
		  
		  if(arr[i]<35)
		  {
			  fail=true;
		  }
	  }
	  System.out.println(total);
	  double percentage = (total*100)/500;
	  System.out.println(percentage);
	  
	  String res = null; //not executing else part
	    if(fail)
	    {
	    	res=("You are fail");
	    }else if(percentage>=75)
		{
			res=("You are passed with distinction");
		}else if(percentage>=60)
		{
			res=("You are passed with First division");
		}else if(percentage>=35)
		{
			res=("You are passed with second division");
		}
	
	return res;
	  
		
	}

}
