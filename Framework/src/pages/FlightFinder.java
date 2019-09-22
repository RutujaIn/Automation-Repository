package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {
	
	WebDriver dr;
	
    public FlightFinder(WebDriver dr) //constructor - no return type
    {
    	this.dr=dr;
    }
    
   public By oneway=By.xpath("//input[@value='roundtrip']");
   
   /*public void test(WebElement fromMonth, WebElement fromDay) throws InterruptedException 
   {
   	
   Select sele1=new Select(fromDay); //import 2nd option //pass argument for constructor
   	  
   Thread.sleep(2000);
   sele1.selectByValue("4");
   		
   Select sele2=new Select(fromMonth); //import 2nd option //pass argument for constructor

   Thread.sleep(2000);
   sele2.selectByValue("5");
   
   }*/
   
  // public By serveclass =By.xpath("//input[@name='servClass']");

   public By continueBtn=By.name("findFlights");
    
    public void click(By element) //By ->class
    {
    	dr.findElement(element).click();
    }
    
   
}
