package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumClass1 {
	
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
      
	}

}
