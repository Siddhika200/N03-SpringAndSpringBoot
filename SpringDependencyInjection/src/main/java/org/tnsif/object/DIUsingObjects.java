package org.tnsif.object;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DIUsingObjects {

	public static void main(String[] args) {
		BeanFactory f=new ClassPathXmlApplicationContext("web.xml");
        Cellphone e1=f.getBean("c2",Cellphone.class);
        e1.accept();
        
	}

}
