package assignment2;

public class A2_1 {

	public static void main(String[] args) 
			{
		// TODO Auto-generated method stub
		// M
		
			A a = new A(); //object initialization
			B b = new B();
			System.out.println(a.x);
			System.out.println(a.y);
			System.out.println(b.x);
			System.out.println(b.y);

			}

			}

			class A
			{
			String x="Parent";
			}

			class B extends A // multilevel inheritance
			{
			String y="Child";
			}	


