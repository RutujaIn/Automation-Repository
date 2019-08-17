package oops.inheritance;

public class Mobile extends Telephone //multilevel inheritance
{

	public void texting()
	{
		System.out.println("Calling & texting from mobile");
	}
	
	public void calling()  //method overriding
	{
		System.out.println("Calling from mobile");
	}
	
}
