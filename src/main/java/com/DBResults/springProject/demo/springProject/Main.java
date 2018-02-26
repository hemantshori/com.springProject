package com.DBResults.springProject.demo.springProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Main {

	public static void main (String args[] )
	
	{
		//OpenAccount xx = new OpenAccount(new CurrentAccount());
		
		ApplicationContext ac = SpringApplication.run(Main.class, args);
	      OpenAccount oc=  ac.getBean(OpenAccount.class);
		 oc.selectAccount();
	}
}
	