package oops.abstraction;

public class BankUser {
	
	public static void main(String[] args) 
	{
		RBI acc;
		
		acc=new Citi();
		acc.creditCard();
		acc.debitCard();
		acc.currentAccount();
		acc.savingAccount();
		
		acc=new PNB();
		acc.creditCard();
		acc.debitCard();
		acc.currentAccount();
		acc.savingAccount();
		
		acc=new BOI();
		acc.creditCard();
		acc.debitCard();
		acc.currentAccount();
		acc.savingAccount();
	}

}
