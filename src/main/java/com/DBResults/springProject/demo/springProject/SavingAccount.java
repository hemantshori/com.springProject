package com.DBResults.springProject.demo.springProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SavingAccount implements Account{
	
	
	public void accountType()
	{
		System.out.println("this is saving account");
	}

}
