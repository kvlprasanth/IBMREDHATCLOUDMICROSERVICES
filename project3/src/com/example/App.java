package com.example;

public class App {
	
	public static void main(String args[])
	{
		AccountClass account=new AccountClass();
		account.createAccount("acc-1", 200.0, "John", AccountType.CURRENT);
		
		if(account.getAccountType()==AccountType.CURRENT)
		{
			if(account.getAccountType()==AccountType.CURRENT)
			{
				CurrentAccount cur=new CurrentAccount();
				cur.createCurrentAccount();
				
			}
			else if(account.getAccountType()==AccountType.SAVINGS)
			{
				SavingsAccount cur=new SavingsAccount();
				cur.createSavingsAccount();
				
			}
		}
	}

}
