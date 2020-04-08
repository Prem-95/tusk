package com.nit.pojo;

public class Employee {
	private int eno;
	private String name;
	private String dept;
	private double sal;
	
	public Employee(int eno, String name, String dept, double sal) {
		super();
		this.eno = eno;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee emp = (Employee) obj;
			
			return this.dept.equals(emp.dept)&& this.eno==emp.eno;
		}
		return false;
	}
	@Override
	public String toString() {
		return "\nEmployee [eno=" + eno + ", name=" + name + ", dept=" + dept + ", sal=" + sal + "]";
	}
	
	

}
