package testAPI;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnSoftAssert {
	
	@Test(priority=2)
	public void test1()
	{
		
		//Assert.assertTrue(10>10); //hard assert
		SoftAssert ars = new SoftAssert();
		
		ars.assertTrue(10>10);
		System.out.println("Rutuja");
		ars.assertAll();
	}

	@Test(priority=1)
	public void test2()
	{
		System.out.println("Testing 2");
	}
	
	@Test(priority=0)
	public void test3()
	{
		System.out.println("Testing 3");
	}
}
