package collections;

import oops.inheritance.Mobile;
import oops.inheritance.SmartPhone;
import oops.inheritance.Telephone;

public class ObjectArray {
	
	public static void main(String[] args) {
		
		Telephone p = new Telephone();
		Mobile m = new Mobile();
		SmartPhone sm = new SmartPhone();
		
		p=m; //Telephone is superclass of mobile & smartphone
		p=sm;
		
		
		int a=10;
		String s = "abc";
		boolean b = true;
		
		//a=s;
		//a=b;
		
		Object obj;  //Object is superclass of all classess
		obj=p;
		obj=m;
		obj=sm;
		obj=a;
		obj=s;
		obj=b;
		
		
	}
	
	

}
