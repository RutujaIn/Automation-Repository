package oops.abstraction;

public class User {

	public static void main(String[] args) {
		// cannot call abstract class 
		
		WordPad wp=new Sprint3();
		wp.createNewFile();
		wp.edit();
		wp.insert();
		wp.save();
		wp.layout();

	}

}
