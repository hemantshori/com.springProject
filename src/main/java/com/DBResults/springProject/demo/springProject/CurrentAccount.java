package com.DBResults.springProject.demo.springProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CurrentAccount implements Account{
	
	
	public void accountType()
	{
		System.out.println("this is current account");
	}

}
