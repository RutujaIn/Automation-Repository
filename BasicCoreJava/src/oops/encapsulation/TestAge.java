package oops.encapsulation; 

public class TestAge 
{
  public static void main(String[] args)
  {
	TestClass obj= new TestClass();
	//obj.age=10; //not able to call variable when defined as private
	obj.setAge(-10);
	System.out.println(obj.getAge());
	
}
}