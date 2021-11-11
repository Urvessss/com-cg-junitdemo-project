package com.cg.jpademo.service;

import java.util.List;

import com.cg.jpademo.Model.Employee;



public interface EmployeeService {

	public abstract void addEmployee(Employee employee);

	public abstract void updateEmployee(Employee employee);

	public abstract void removeEmployee(Employee employee);

	public abstract com.cg.jpademo.Employee findEmployeeById(int id);

	void addEmployee(com.cg.jpademo.Employee employee);

	void updateEmployee(com.cg.jpademo.Employee employee);

}