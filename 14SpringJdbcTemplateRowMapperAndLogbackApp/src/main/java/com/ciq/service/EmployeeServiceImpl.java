package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ciq.dao.EmployeeDaoImpl;
import com.ciq.pojo.Employee;

//@Component
@Service
public class EmployeeServiceImpl implements EmployeeService {
//	EmployeeServiceImpl EmployeeServiceImpl=new EmployeeServiceImpl();

	@Autowired
	private EmployeeDaoImpl employeeDaoImpl;
	
	
//
//	public void setEmployeeDaoImpl(EmployeeDaoImpl employeeDaoImpl) {
//		this.employeeDaoImpl = employeeDaoImpl;
//	}

	public void save(Employee employee) {
		employeeDaoImpl.save(employee);

	}

	public List<Employee> getEmployees() {
		return employeeDaoImpl.getEmployees();
	}

	@Override
	public int update(Employee employee) {
		System.out.println("update serive method started here....");
		return employeeDaoImpl.update(employee);
	}

	@Override
	public int delete(int id) {
		return employeeDaoImpl.delete(id);
	}

}
