package oops.inheritance;

public class Mobile extends Telephone //multilevel inheritance
{

	public void texting()
	{
		System.out.println("Calling & texting from mobile");
	}
	
	public void calling()  //method overriding -same function in both parent & child class with same parameters
	{
		System.out.println("Calling from mobile");
	}
	
}
//overloading + overriding -> Polymorphism