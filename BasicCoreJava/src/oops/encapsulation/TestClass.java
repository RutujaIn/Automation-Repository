package oops.encapsulation; //to hide data members

public class TestClass 
{
 private int age;//global variable
 
 
//getters & setters
public int getAge() {  
	return age;
}

public void setAge(int age) { 
	if(age>0)//can define condition for user input//can define if condition without brackets if only one condition present
	this.age = age;
	
	/*if(age>0)//can define condition for user input
		{
		this.age = age;
		}
	*/
}
}

//variable inside main method-> local variable