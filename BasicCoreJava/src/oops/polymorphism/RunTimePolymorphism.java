package oops.polymorphism;

import oops.inheritance.SmartPhone;
import oops.inheritance.Telephone;

public class RunTimePolymorphism {

	public static void main(String[] args) 
	{
		Telephone obj = new SmartPhone(); //Smartphone child, telephone parent class of diff package
		obj.calling();//calling mobile -> shows only one option for selection

	}

}
