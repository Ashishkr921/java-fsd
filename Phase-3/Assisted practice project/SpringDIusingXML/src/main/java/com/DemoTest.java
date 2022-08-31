package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class DemoTest {
	public static void main(String[] args) {
		//Employee emp1=new Employee();
		///emp1.display();
		
		Resource rs= new ClassPathResource("beans.xml");
		BeanFactory bb=new XmlBeanFactory(rs);
		//Employee employee1=(Employee)bb.getBean("emp1");
		//employee1.display();
		
		/*Employee employee2=(Employee)bb.getBean("emp2");
		employee2.display();
		
		//Employee employee3=(Employee)bb.getBean("emp1");
		//employee3.display();
		
		Employee employee4=(Employee)bb.getBean("emp2");
		employee4.display();*/
		
		/*Employee employee5=(Employee)bb.getBean("emp1");
		System.out.println(employee5);
		
		Employee employee6=(Employee)bb.getBean("emp3");
		System.out.println(employee6);*/
		
		/*Employee employee7=(Employee)bb.getBean("emp4");
		//employee7.display();
		System.out.println(employee7);
		
		Employee employee8=(Employee)bb.getBean("emp5");
		//employee7.display();
		System.out.println(employee8);
		
		Employee employee9=(Employee)bb.getBean("emp6");
		//employee7.display();
		System.out.println(employee9);*/
		
		Address add1=new Address();
		System.out.println(add1);
		
		Employee employee8=(Employee)bb.getBean("emp8");
		System.out.println(employee8);
	}
}//Singleton DP: if you have to create only one memory
