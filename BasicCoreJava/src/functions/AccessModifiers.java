package functions;

public class AccessModifiers {

	
	//access modifier types : 1.public 2.private 3.protected 4.default/no access modifier
	//1.Public -> throughout the project
	//2.private -> within same class
	//3.protected -> within the package & outside the package by using Child Class
	//4.default ->
	
	public static void main(String[] args)
	{
		AccessModifiers obj= new AccessModifiers();
		obj.publicfunction();
		
		obj.privatefunction();
		
		obj.protectedfunction();
		
		obj.defaultfunction();
	}
	
	public  void publicfunction() 
	{
     System.out.println("Public function");
	}
	
	private  void privatefunction() 
	{
     System.out.println("Private function");
	}
	
	protected  void protectedfunction() 
	{
     System.out.println("Protetced function");
	}
	
	  void defaultfunction() 
	{
     System.out.println("Default function");
	}

}
