package testAPI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider {
	
	@Test(dataProvider = "getdata")
	public void login(String username, String password) 
	{
		System.out.println("Launch browser");
		System.out.println("Navigate to application");
		System.out.println("Enter username"+username);
		System.out.println("Enter password"+password);
		System.out.println("Click login");
	}

	
	@DataProvider
	public String[][] getdata()
	{
		String[][] data = new String[3][2];
		
		//Row1
		data[0][0] = "Username";
	    data[0][1] = "Password";

	    //Row2
	    data[1][0] = "Username1";
	    data[1][1] = "Password1";

	    //Row3
	    data[2][0] = "Username2";
	    data[2][1] = "Password2";
				
	    return data;
				
	}
	
}
