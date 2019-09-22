package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import config.Configuration;
import libraries.ApplicationLibrary;
import pages.FlightFinder;
import pages.HomePage;

public class TC_MercuryTours_Login 
{

	WebDriver dr;
	ApplicationLibrary lib;
	
	@BeforeClass
	public void initialize()
	{
		lib=new ApplicationLibrary();
		dr=lib.LaunchBrowser("Chrome");
		Assert.assertTrue(dr!=null);
	}
	
	@Test
	public void Script1()
	{
		dr.get(Configuration.url);
		HomePage page1 = new HomePage(dr);
		
		//Login in the application
		page1.login(Configuration.globalUsername, Configuration.globalPassword);
		
		//Verify login
		FlightFinder page2 = new FlightFinder(dr);
		Assert.assertTrue(lib.isElementPresent(dr,page2.oneway));
		
	}
	
	@AfterClass
	public void tearDown()
	{
		dr.quit();//quits all tabs , dr.close()->closes current tab
	}
}
