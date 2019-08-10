package functions;

public class Assignment1 {

	public static void main(String[] args)
	{	
		String res=result(68);	
		System.out.println(res);
	}
	
	public static String result(int marks)
	{
		String res;
		if(marks>=75)
		{
			res=("You are passed with distinction");
		}else if(marks>=60)
		{
			res=("You are passed with First division");
		}else if(marks>=35)
		{
			res=("You are passed with second division");
		}else {
			res=("You are failed");
		}
	
	return res;
	
	}

	/*public static void result(int marks)
	{
		if(marks>=75)
		{
			System.out.println("You are passed with distinction");
		}else if(marks>=60)
		{
			System.out.println("You are passed with First division");
		}else if(marks>=35)
		{
			System.out.println("You are passed with second division");
		}else {
			System.out.println("You are failed");
		}*/
	
	

}
