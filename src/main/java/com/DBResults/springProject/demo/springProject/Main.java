package com.DBResults.springProject.demo.springProject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

@SpringBootApplication
public class Main {

	public static void main(String args[])

	{

		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("bean.xml"));

		// following bean.xml could go in some comp location too
		//ApplicationContext ac = new FileSystemXmlApplicationContext("bean.xml");
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Account a = (Account) ac.getBean("accObj");
		a.accountType();

		Transaction tr = (Transaction) ac.getBean("tran");
		tr.someTrans();

	}
}
