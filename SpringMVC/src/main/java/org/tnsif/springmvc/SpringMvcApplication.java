package org.tnsif.springmvc;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
//SpringBootappln is convenience that wraps commonly used annotation
//3 different annotations:
//1.@configuration:
//2.@enableautoconfiguration.
//3.@component:used to denote that class is component
//componentscan:scans the project for spring components annotated with@services@respository
@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringMvcApplication.class, args);
		Scanner sc=new Scanner(System.in);
//		Employee e=context.getBean(Employee.class);
//		e.setEmpid(123445);
//		e.setEmpname("Siddhika Ghule");
//		e.print();
		HomeController h=context.getBean(HomeController.class);
		h.home();
	}

}
