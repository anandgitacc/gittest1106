package org.polymorphism;

public class EmployeeDetails {

	// normal method / empty args
	private void employee() {
		System.out.println("Employee details as follow: ");
		System.out.println("************************");
	}

	// args based on data type
	private void employee(String empName) {
		System.out.println("Employee name: " + empName);
		System.out.println("************************");
	}

	private void employee(int empId) {
		System.out.println("Employee id: " + empId);
		System.out.println("************************");
	}

	// args based on data type count
	private void employee(String empName, int empId, float empSalary) {
		System.out.println("Employee name: " + empName);
		System.out.println("Employee id: " + empId);
		System.out.println("Employee salary: " + empSalary);
		System.out.println("************************");
	}

	// args based on data type order
	private void employee(int empId, String empName, float empSalary) {
		System.out.println("Employee name: " + empName);
		System.out.println("Employee id: " + empId);
		System.out.println("Employee salary: " + empSalary);
		System.out.println("************************");
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails a = new EmployeeDetails();
		a.employee();
		a.employee("bala");
		a.employee(111);
		a.employee("bala", 111, 87876.228f);
		a.employee(111, "bala", 87876.228f);
		
	}
	
	
	
	
	
	
	
	
	
	

}
