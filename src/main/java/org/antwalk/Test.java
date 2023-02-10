package org.antwalk;

import org.antwalk.interfaces.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String args[]) {
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
//	Account c1= context.getBean("savings", Account.class); 
//	Account c2= context.getBean("current", Account.class); 
	
	Customer c = context.getBean("customer",Customer.class);
	
	c.setName("Sheldon Cooper");
	c.setAge(37);
	c.setEmail("sheldonCooper@yahoomail.com");
	c.display();

	context.close();
	}
}
