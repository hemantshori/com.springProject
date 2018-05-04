package com.DBResults.springProject.demo.springProject;






public class Account{
	
	int accNo;
	String accName;




	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public void accountType()
	{
		System.out.println("Hello " +accName +"your account number is " +accNo);
	}

}
