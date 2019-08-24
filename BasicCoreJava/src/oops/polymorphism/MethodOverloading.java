package oops.polymorphism;

public class MethodOverloading { //Static Polymorphism

	public static void main(String[] args) 
	{		
		
		MethodOverloading obj= new MethodOverloading();//creating object as calling non-static functions 
		
		obj.sum(10, 20);//shows multiple options for selection
		obj.sum(10,20,30);

	}
	
	public int sum(int a, int b) //non-static functions
	{
		return a+b;
	}
	
	public int sum(int a, int b, int c)
	{
		return a+b+c;
	}
}
