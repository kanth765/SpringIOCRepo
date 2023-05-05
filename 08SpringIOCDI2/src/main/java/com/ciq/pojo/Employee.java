package com.ciq.pojo;

import java.util.List;

/**
 * @author sarik
 *
 */
public class Employee {

	private int id;
	private String name;
	private double salary;
	private List<Address> addressess;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary, List<Address> addressess) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.addressess = addressess;
	}

	public int getId() {
		return id;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Address> getAddressess() {
		return addressess;
	}

	public void setAddressess(List<Address> addressess) {
		this.addressess = addressess;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", addressess=" + addressess + "]";
	}

}
