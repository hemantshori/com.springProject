package com.DBResults.springProject.demo.springProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class OpenAccount {


	@Autowired
		private Account account;

	
//		public OpenAccount(Account account) {
//			super();
//			this.account = account;
//		}


		public void selectAccount()
		{
         account.accountType();
         
		}


		public Account getAccount() {
			return account;
		}


		public void setAccount(Account account) {
			this.account = account;
		}
		

		
	}


