package org.tnsif.literals;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingLiteral {

	public static void main(String[] args) {
		BeanFactory f=new ClassPathXmlApplicationContext("beans.xml");
        XUVEngine e=f.getBean("xuv",XUVEngine.class);
        System.out.println(e);
        System.out.println(e.cost());
        System.out.println(e.display());
      
	}

}
 