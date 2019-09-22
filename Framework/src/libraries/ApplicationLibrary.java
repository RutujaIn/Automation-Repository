package libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.Configuration;

public class ApplicationLibrary {
	
	public WebDriver LaunchBrowser(String browserName)
	{
		 WebDriver dr = null;
		 
		 if(browserName.equalsIgnoreCase("Chrome"))
		 {
		 //System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver",Configuration.chromeDriver);
		 //ChromeDriver dr = new ChromeDriver();
	     dr = new ChromeDriver();
	     dr.manage().window().maximize();
		 }else if(browserName.equalsIgnoreCase("firefox"))
		 {
			 //system.set property for driver
			 dr= new FirefoxDriver();
		 }
		 return dr;
	}
	
	public void navigate(WebDriver dr, String url)
	{
		dr.get(url);
	}
	
	public boolean isElementPresent(WebDriver dr, By element) //to check if element is present in DOM
	{
		if(dr.findElements(element).size()>=1)//gives size from list//By element - for any pages
			return true;
		else
			return false;
	}

}
