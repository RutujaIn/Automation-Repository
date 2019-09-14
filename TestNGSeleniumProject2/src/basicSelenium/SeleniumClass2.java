package basicSelenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class SeleniumClass2 {
	
	@Test //testNG annotation to execute method
	public void test1() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
	      
	      ChromeDriver dr = new ChromeDriver();
	      dr.get("http://newtours.demoaut.com/");
	      dr.manage().window().maximize();
	      
	      //Text Box
	      dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");//relative xpath
	      dr.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
	      
	      //Button
	      dr.findElement(By.xpath("//input[@name='login']")).click();
	      dr.findElement(By.xpath("//input[@value='oneway']")).click();
	      
	      //Radio Button
	      WebElement pass=dr.findElement(By.xpath("//select[@name='passCount']"));//findElement returns web element
          
	      //Dropdown
	      Select sel=new Select(pass); //import 2nd option //pass argument for constructor
	      sel.selectByIndex(2);
	      
	      Thread.sleep(2000);
	      sel.selectByValue("2");
	      
	      Thread.sleep(2000);
	      sel.selectByVisibleText("4");    
	      
	      //write code to handle all dropdowns
	      
	      dr.findElement(By.xpath("//input[@name='findFlights']")).click();
	      
	      WebElement table =  dr.findElement(By.xpath("//table[@cellspacing='1'][1]/tbody"));//storing returned
	      
	      List<WebElement> rows = table.findElements(By.tagName("tr"));//import by java.util //multiple rows
	    
	      for(WebElement r:rows) //enhanced for loop
	      {
	    	  List<WebElement> cols = r.findElements(By.tagName("td"));
	    	  
	    	  for(WebElement c:cols)
	    	  {
	    		  System.out.print(c.getText()+" ");
	    	  }
	    	  
	    	  System.out.println();
	      }
	      
	      //click on continue
	      dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
	      
	      //Country drop down
	      WebElement country = dr.findElement(By.xpath("//select[@name='delCountry']"));
	      
	      Select cont= new Select(country);
	      
	      cont.selectByIndex(3);
	      
	      //Alert
	     Alert alt = dr.switchTo().alert();
	     
	     System.out.println(alt.getText());
	     
	     alt.accept();
	     //alt.dismiss();
	     
	     //Checkbox
	     WebElement check = dr.findElement(By.xpath("//input[@name='ticketLess']"));
	     System.out.println(check.isSelected());
	     check.click();
	     System.out.println(check.isSelected());
	     
	     //Click on secured flight
	     dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
	     
	     System.out.println(dr.findElement(By.xpath("//font[@size='+1']")).getText());
	     
	     //Image
	     WebElement img = dr.findElement(By.xpath("//img[@alt='Mercury Tours']"));
	     System.out.println(img.getAttribute("width"));
	     System.out.println(img.getAttribute("height"));

	}
}
