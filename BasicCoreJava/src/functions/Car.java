package functions;

public class Car
{
	static int wheels = 4 ;
	String colour = "blue";
	String model;
	
	public void specifications()
	{
		System.out.println("Specificatioms: wheels:"+wheels+", colour="+colour+" and model="+model);
	
	}
	
	public static void testdrive()
	{
		System.out.println("Test Drive");
	}
	
	public static void main(String[] args) // key->ctrl+space+enter
	                                       // static functions can only call static functions & static variables without creating an object
	{
		//Static variables and Static functions
		testdrive();
		System.out.println(wheels);
		
		//Not static variables and non static functions
		Car c = new Car();
		System.out.println(c.colour);
		c.specifications();
	}
}
