package functions;

public class Car2 
{
   int cc; // local variables ?
   String fueltype;
   int steering;
   
   //Default constructor
   public Car2()
   {
   
   }
   
   //Parameterized constructor
   public Car2(int cc, String fueltype, int steering )
   {
	  /* cc=cc1;
	   fueltype=fueltype1;
	   steering=steering1;*/
	   
	   this.cc=cc;
	   this.fueltype=fueltype;
	   this.steering=steering;
	   
   
   }
   
   
   public void acceleration()
   {
	   System.out.println("Car is accelerating with : Engine:"+cc+", fueltype="+fueltype+" and steerings="+steering);
	   
	   System.out.println( steering+ " steering Car's fueltype is " +fueltype+" and engine size is "+cc);

	   
   }
}

//variable-> ctrl + space