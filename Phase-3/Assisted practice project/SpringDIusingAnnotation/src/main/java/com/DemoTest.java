package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		//Done using XMLfile
		
		/*ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Address add1=(Address)ac.getBean("address");
		System.out.println(add1);
		
		Employee emp1=(Employee)ac.getBean("employee");
		System.out.println(emp1);
		
		add1.setCity("Mumbai");
		add1.setState("Maharashtra");
		emp1.setAdd(add1);
		emp1.setId(2);
		emp1.setName("Sahithi");
		emp1.setSalary(120000);
		
		System.out.println(emp1);
		System.out.println(add1);*/
		
		//Done using Configuration file
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		Address add1=(Address)ac.getBean("address");
		System.out.println(add1);
		
		Address add2=(Address)ac.getBean("address");
		System.out.println(add2);
		
		Employee emp1=(Employee)ac.getBean("employee");
		System.out.println(emp1);
		
		Employee emp2=(Employee)ac.getBean("employee");
		System.out.println(emp1);
		
		add1.setCity("Mumbai");
		add1.setState("Maharashtra");
		emp2.setAdd(add1);
		emp2.setId(2);
		emp2.setName("Sahithi");
		emp2.setSalary(120000);
		
		System.out.println(emp2);
		System.out.println(add2);
	}

}
