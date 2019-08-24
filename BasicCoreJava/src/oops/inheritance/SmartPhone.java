package oops.inheritance;

public class SmartPhone extends Mobile // extends Mobile,Telephone : multiple inheritance not possible for java classes 
//gets properties of both Mobile & Telephone, as Mobile acquires properties of Telephone
{
	
	public void internet()
	{
		System.out.println("Net surfing from internet");
	}

}

//inheritance possible between packages