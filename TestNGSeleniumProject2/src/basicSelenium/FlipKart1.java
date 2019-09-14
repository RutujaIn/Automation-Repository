package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FlipKart1 {
	
	@Test
	public void test2()
	{
		  System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
	      
	      ChromeDriver dr = new ChromeDriver();
	      dr.get("https://www.flipkart.com/");
	      dr.manage().window().maximize();
	      //Implicit wait - applicable for all following elements
	      dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
	      
	      
	      
	      dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	      
	      Actions act =new Actions(dr);
          act.moveToElement(dr.findElement(By.xpath("//span[text() = 'Men']"))).build().perform();
          
          //Explicit Wait - applicable for single element
          WebDriverWait wait = new WebDriverWait(dr,5);
          
          wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='Shirts']"))));
          
          dr.findElement(By.xpath("//a[text()='Shirts']")).click();
          
          WebElement ele =dr.findElement(By.xpath("//div[@class='_3aQU3C']"));
          act.dragAndDropBy(ele, 50, 0).build().perform();
          
          
		
	}

}
