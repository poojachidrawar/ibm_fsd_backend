package com.java.spring.empmanagement.autowiring;

import java.sql.SQLException;
import java.util.List;


public class EmployeeServices {
	public EmployeeServices() {
		
	}
	EmployeeDao  employeedao;
	public EmployeeServices(EmployeeDao employeedao) {
		this.employeedao = employeedao;
	}
	
	public EmployeeDao getEmployeedao() {
		return employeedao;
	}

	public void setEmployeedao(EmployeeDao employeedao) {
		this.employeedao = employeedao;
	}

	public void add(Employee e) throws SQLException {
		  employeedao.addEmp(e);
	}
	
	public List show() throws SQLException {
		return employeedao.printDetails();
	}
	
	public void update(int id, String dept) throws SQLException {
		int eid = id;
		String dept1 = dept;
		employeedao.updateDetails(eid,dept1);
	}
	
	public void delete(int id) throws SQLException {
		int eid = id;
		employeedao.deleteDetails(eid);
	}
	
	public void showEmp(int id) throws SQLException {
		int eid = id;
		employeedao.showEmployee(eid);
	}
	
	public void printStatistics() throws ClassNotFoundException, NullPointerException, SQLException {
		employeedao.statistics();
	}
	
	public void importEmpls() {
		employeedao.importData();
	}
	
	public void exportEmpls() throws ClassNotFoundException, SQLException {
		employeedao.exportData();
	}
}
