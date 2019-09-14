package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium {
	
	@Test //1.add testNG library 2.import testNG annotations
	public void test1()
	{
      System.out.println("Testing");
      
     // D:\Drivers\chromedriver.exe
      
      System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
      
      ChromeDriver dr = new ChromeDriver();
      dr.get("http://newtours.demoaut.com/");
      
      dr.findElement(By.name("userName")).sendKeys("mercury");
      dr.findElement(By.name("password")).sendKeys("mercury");
      
      dr.findElement(By.name("login")).click();
      
      dr.findElement(By.name("findFlights")).click();
      
      dr.findElement(By.name("reserveFlights")).click();
      
      dr.findElement(By.name("passFirst0")).sendKeys("Test");
      dr.findElement(By.name("passLast0")).sendKeys("User");
      dr.findElement(By.name("creditnumber")).sendKeys("12345678");
      dr.findElement(By.name("buyFlights")).click();
      
      //dr.findElement(By.xpath("//input[contains(@src,'/images/forms/home.gif')]")).click(); //for src
      //dr.findElement(By.xpath("/images/forms/home.gif")).click(); //for src 
      //dr.findElement(By.xpath("//a[starts-with@href,'/images/forms/home.gif')]")).click(); //for src 




      


      
	}

	

}
