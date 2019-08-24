package oops.abstraction;

public interface RBI extends Modi, SupremeCourt //multiple inheritance allowed in interface,not in classes
{ 
	
	public void savingAccount(); //inside interface default abstract method
	public void currentAccount();
	public void debitCard();
	public void creditCard();  

}
