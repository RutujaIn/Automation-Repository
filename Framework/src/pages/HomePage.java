package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver dr;
	By username = By.name("userName");//"userName -> name defined in DOM element attribute "
	By password = By.name("password");//"password -> name defined in DOM element attribute "
	By login = By.name("login");
	
	public HomePage(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public void login(String username, String password)
	{
		dr.findElement(this.username).sendKeys(username);//this->using global variable
		dr.findElement(this.password).sendKeys(password);
		dr.findElement(this.login).click();

	}
} 
