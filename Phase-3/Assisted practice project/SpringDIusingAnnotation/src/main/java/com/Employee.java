package com;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

@Component
@Scope("prototype")
public class Employee {
	@Value(value="1")
	private int id;
	@Value(value="Saveri")
	private String name;
	@Value(value="120000")
	private float salary;
	
	@Autowired
	private Address add;
	public int getId() {
		return id;
	}
	
	
	public Employee() {
		super();
		System.out.println("Employee Object Created");
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
	}
	
	
}
