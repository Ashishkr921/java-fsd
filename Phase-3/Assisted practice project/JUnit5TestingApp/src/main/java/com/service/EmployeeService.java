package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;

public class EmployeeService {
	public String checkUser(String emailid, String password) {
		if(emailid.equals("Saveri@gmail.com") && password.equals("123")) {
			return "success";
		}else {
			return "failure";
		}
	}
	
	public Employee getEmployee() {
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Saveri");
		emp.setSalary(1000000);
		return emp;
	}
	
	public List<Employee> listOfEmployee() {
		
		List<Employee> listOfEmp=new ArrayList<Employee>();
		Employee emp1=new Employee();
		emp1.setId(1);
		emp1.setName("Saveri");
		emp1.setSalary(1000000);
		
		Employee emp2=new Employee();
		emp2.setId(2);
		emp1.setName("Sahithi");
		emp1.setSalary(2000000);
		return listOfEmp;
	}
	
	public float passEmployeeObject(Employee emp) {
		return emp.getSalary();
	}
}
