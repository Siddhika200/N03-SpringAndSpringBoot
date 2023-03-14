package org.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileExecutor {

	public static void main(String[] args) {
		
//		Jio j=new Jio();
//		j.call();
//		j.message();
//		Vodafone v=new Vodafone();
//		v.call();
//		v.message();
        
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
//		Jio j=(Jio) c.getBean("jio");
//		j.call();
//		j.message();
		
    	Sim s=c.getBean("sim",Sim.class);
		s.call();
		s.message();
	}

}
