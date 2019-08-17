package variablesAndDatatypes;

import functions.AccessModifiers; //calling class function from different package 

public class TestAccessModOutsidethePackage extends AccessModifiers  {

	public static void main(String[] args) 
	{
		AccessModifiers obj= new AccessModifiers();
		obj.publicfunction();
		
		//obj.pri
		
		//obj.pro
		
		//obj.def
		
		TestAccessModOutsidethePackage obj2= new TestAccessModOutsidethePackage();
		obj2.protectedfunction();
		

	}

}
