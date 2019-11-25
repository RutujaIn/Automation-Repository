package testAPI;

import org.testng.annotations.Test;

public class LearnGroups {

	@Test(groups = {"sanity"})
	public void test1()
	{
		System.out.println("Testing 1");
	}

	@Test(groups = {"Regression"})
	public void test2()
	{
		System.out.println("Testing 2");
	}
	
	@Test(groups = {"Regression"})
	public void test3()
	{
		System.out.println("Testing 3");
	}
}
