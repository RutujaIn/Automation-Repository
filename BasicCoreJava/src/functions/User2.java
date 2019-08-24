package functions;

public class User2 {

	public static void main(String[] args) 

	{
		
		// constructor -> to initialize instance(object) variables
      Car2 honda=new Car2();
      honda.cc =2000;
      honda.fueltype="diesel"; //initializing object
      honda.steering=1;
      honda.acceleration();
      
      Car2 audi=new Car2();
      audi.cc =3000; //instance variables
      audi.fueltype="diesel";
      audi.steering=1;
      audi.acceleration();
      
      Car2 hyundai=new Car2();
      hyundai.cc =2000;
      hyundai.fueltype="petrol";
      hyundai.steering=1;
      hyundai.acceleration();
      
	}

}
