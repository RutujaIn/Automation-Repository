package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingMaven {
	
	@Test
	public void test1()
	{
		System.out.println("Testing");
	}
	
	@Test
	public void login()
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
	}

}
