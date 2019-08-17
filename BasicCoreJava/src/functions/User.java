package functions;

public class User {
	
	public static void main(String[] args) 
	{
		
		System.out.println(Car.wheels);
		Car.testdrive();
		
		//Non static functions & variable
		Car Renault= new Car();
		Renault.colour="Black";
		Renault.model="m1";
		Renault.specifications();
		
		Car.wheels=5;

		Car BMW= new Car();
		BMW.colour="White";
		BMW.model="X1";
		BMW.specifications();
		
		Car jaguar= new Car();
		jaguar.colour="Wine";
		jaguar.model="XJ";
		jaguar.specifications();
		
	}

}


//variable types : 1.Static(class) 2.Non static(instance)
  