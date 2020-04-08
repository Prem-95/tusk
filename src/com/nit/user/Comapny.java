package com.nit.user;

import java.util.ArrayList;

import com.nit.pojo.Employee;

public class Comapny {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		
		System.out.println("al size:"+al.size());
		System.out.println("al eles : "+al);
		
		Employee e1 = new Employee (101,"HK","CJ",1000);
		Employee e2 = new Employee (102,"BK","CJ",1000);
		Employee e3 = new Employee (103,"RK","AJ",2000);
		Employee e4 = new Employee (104,"PK","OR",3000);
		Employee e5 = new Employee (105,"SK","CJ",1000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		System.out.println("al size:"+al.size());
		System.out.println("al eles : "+al);

		//RETERIVING BK OBJECT FROM COLLECTION
		Employee emp = al.get(al.indexOf(new Employee(102,"BK","CJ",1000)));
		
		//UPDATING SALARY
		emp.setSal(emp.getSal()+1000);
		System.out.println("al eles : "+al);
		
		//UPDATING CJ DEPT EMPLOYEE'S SALARY
		for (int i = 0;i<al.size();i++) {
			emp = al.get(i);
					if (emp.getDept().equalsIgnoreCase("CJ")) {
						emp.setSal(emp.getSal()+500);
					}//if
		}//for
		System.out.println("al size:"+al.size());
		System.out.println("al eles : "+al);

	}//main

}//class
