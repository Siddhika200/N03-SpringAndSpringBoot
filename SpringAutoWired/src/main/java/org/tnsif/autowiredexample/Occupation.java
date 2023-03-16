package org.tnsif.autowiredexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Occupation {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("far.xml");
		Land d=c.getBean("land",Land.class);
		d.accept();

	}

}
