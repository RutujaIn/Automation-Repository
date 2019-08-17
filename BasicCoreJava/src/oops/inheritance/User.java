package oops.inheritance;

public class User {

	public static void main(String[] args) 
	{

		SmartPhone sm = new SmartPhone();
		sm.internet();
		sm.calling();
		sm.texting();
		
		Mobile mb = new Mobile();
		mb.texting();
		mb.calling();
		
		Telephone phone = new Telephone();
		phone.calling();
		
		
	}

}
