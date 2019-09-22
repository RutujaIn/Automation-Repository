package basicSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleIframe 
{
	
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
	      
	    ChromeDriver dr = new ChromeDriver();
	    dr.get("https://paytm.com/");
	    dr.manage().window().maximize();
	    
	    Thread.sleep(3000);  
	    dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
	    
	    dr.switchTo().frame(dr.findElement(By.tagName("iframe")));
	    //dr.switchTo().frame(0);//integer index 0
	    
	    Thread.sleep(10000);
	    dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
	    
	    //xpath types
	  //span[@class='_1QZ6fC _3Lgyp8']
	  //span[@class='_1QZ6fC _3Lgyp8'][text()='Men']
	  //span[@class='_1QZ6fC _3Lgyp8' and text()='Men']
	  //li[@class='Wbt_B2 _1YVU3_']/span[@class='_1QZ6fC _3Lgyp8' and text()='Men']
	  //span[starts-with(text(),'TVs')]
	  //span[contains(text(),'TVs')]
	    
	    //Advanced Xpath - access
	    //1.Parent-child
	    //2.Preceding-following
	    //3.Ancestors-Descenders
	    //4.Preceding siblings-following siblings
	    
	   //2.Preceding - following
	  // //span[text()='Men']//following::a[text()='Shirts']
	     //a[text()='Shirts']//preceding::span[text()='Men']
	    
	  //3.Ancestors-Descenders
		  // //a[text()='Shirts']//ancestor::li[@class='Wbt_B2 _1YVU3_']/span[text()='Men']
	         //span[text()='Men']//parent::li//descendant::a[text()='Shirts']
	         //span[text()='Men']//..//descendant::a[text()='Shirts']
	    
	 //4.Preceding siblings-following siblings
	  //a[text()='Shirts']//..//preceding-sibling::li/a[text()='Top wear']
	  //a[text()='Top wear']//..//following-sibling::li/a[text()='Shirts']
	}

}
