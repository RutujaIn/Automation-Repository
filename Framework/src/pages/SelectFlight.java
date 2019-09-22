package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectFlight {
	
WebDriver dr;
	
    public SelectFlight(WebDriver dr) //constructor - no return type
    {
    	this.dr=dr;
    }
	
    
   /* WebElement table =  dr.findElement(By.xpath("//table[@cellspacing='1'][1]/tbody"));//storing returned
    
    List<WebElement> rows = table.findElements(By.tagName("tr"))//import by java.util //multiple rows
  
    for (WebElement r:rows) //enhanced for loop
    {
  	  List<WebElement> cols = r.findElements(By.tagName("td"));
  	  
  	  for(WebElement c:cols)
  	  {
  		  System.out.print(c.getText()+" ");
  	  }
  	  
  	  System.out.println();
    }*/
    
    
}

