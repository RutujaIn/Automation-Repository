package assignment3;

public class A3_4 {
	
	/**
	* @param args
	*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeClass obj=null;
		try{
		obj.someMethod();
		System.out.println("success");
		}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
		}


	}

}
