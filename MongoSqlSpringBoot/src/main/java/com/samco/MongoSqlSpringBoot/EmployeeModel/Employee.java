package com.samco.MongoSqlSpringBoot.EmployeeModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	private int empid;
	private String empname;
	private int empage;
	private String emprole;
	public Employee() {
		super();
	}
	public Employee(int empid, String empname, int empage, String emprole) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empage = empage;
		this.emprole = emprole;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	public String getEmprole() {
		return emprole;
	}
	public void setEmprole(String emprole) {
		this.emprole = emprole;
	}
	

}
