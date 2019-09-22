package basicSelenium;

import java.util.Set;
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
	public void test2() throws InterruptedException
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
          WebDriverWait wait = new WebDriverWait(dr,10);
          
          wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='Shirts']"))));
          
          dr.findElement(By.xpath("//a[text()='Shirts']")).click();
          
          //drag slider
          WebElement ele =dr.findElement(By.xpath("//div[@class='_3aQU3C']"));
          act.dragAndDropBy(ele, 50, 0).build().perform();
          
         // wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//img[@class='_3togXc']")))).click();//staleElement exception
          
         // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='_3togXc']")));
         // dr.findElement(By.xpath("//img[@class='_3togXc']")).click();
          
         // wait.until(ExpectedConditions.stalenessOf((dr.findElement( By.xpath("//img[@class='_3togXc']")))));
         // dr.findElement(By.xpath("//img[@class='_3togXc']")).click();
          
          String parent=dr.getWindowHandle(); //gives id of current window
          System.out.println(parent + "First");
          
          Thread.sleep(2000);
          dr.findElement(By.xpath("//img[@class='_3togXc']")).click();
          
          Set<String> wins = dr.getWindowHandles();
          
          for(String w:wins) //enhanced for loop
          {
        	 // System.out.println(w);
        	  if(!w.equals(parent))
        	  dr.switchTo().window(w);
          }
          
	      dr.findElement(By.xpath("//input[@class='_20PCkk']")).sendKeys("411001");
		
	}

}
