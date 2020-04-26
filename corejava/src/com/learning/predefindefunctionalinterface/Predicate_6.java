package com.learning.predefindefunctionalinterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	
	String empName;
	String empAdd;
	double empSalary;
	
	Employee(String empName, String empAdd, double empSalary){
		this.empName = empName;
		this.empAdd  = empAdd;
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		
		String emp_Details = String.format("(%s,%s,%.2f)",empName,empAdd,empSalary);
		return emp_Details;
	}	
}

public class Predicate_6 {
	
	public static void populate(ArrayList<Employee> employee) {
		
		employee.add(new Employee("vinay", "dhanbad", 50000.50));
		employee.add(new Employee("value1","hyd", 30000.55));
		employee.add(new Employee("value2","delhi", 60000.00));
		employee.add(new Employee("value3","bangalore", 40000.25));
		employee.add(new Employee("value4","bihar", 20000.53));
		employee.add(new Employee("kr", "dhanbad", 50000.50));
	}
	public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		
		for(Employee emp : list) {
			
			if(p.test(emp)) {
				
				System.out.println(emp);
			}
		}
		System.err.println("*****************************************");
		
	}
	public static void main(String []args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		populate(list);
		System.out.println(list);
		
		Predicate<Employee> p1 = emp -> emp.empAdd.equals("dhanbad");
		System.out.println("Employee information based on address");
		display(p1, list);
		
		Predicate<Employee> p2 = emp -> emp.empName.equals("vinay");
		System.out.println("Employee information based on name");
		display(p2, list);
		
		System.out.println("Employee information based on name and address");
		display(p1.and(p2), list);
	}

}
