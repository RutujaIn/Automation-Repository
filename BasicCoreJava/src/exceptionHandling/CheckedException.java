package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException { //at the time of compilation

	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{

		System.out.println("name");
		
		Thread.sleep(600);  //static function,Thread->class
		UncheckExceptions.test();
		
		System.out.println("surname");
		
		FileInputStream obj= new FileInputStream("");
	}

}
