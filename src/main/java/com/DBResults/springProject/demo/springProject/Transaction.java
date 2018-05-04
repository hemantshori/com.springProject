package com.DBResults.springProject.demo.springProject;

public class Transaction {

	private Account account;

	
	
	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	public void someTrans()
	{
	   System.out.println("hello " +account.accName + "paaji ");
	   System.out.println("thwada number is " +account.accNo);
	}
	
}
