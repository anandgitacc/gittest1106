package org.employee;

import org.client.Client;

public class EmployeeDetails {
	
	private void empName() {
		// implementation detail or business logic
		System.out.println("Employee name: Anand");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile: 8939278836");
	}
	
	private void age() {
		System.out.println("Age is 25");
	}
	
	// main method
	public static void main(String[] args) {
		
		// diff package access
		Client cl = new Client();
		cl.clName();
		cl.clLocation();
		
		EmployeeDetails e = new EmployeeDetails();
		e.empName();
		e.empMobile();
		e.age();
		
		// same package access
		Company c = new Company();
		c.comName();
		c.comId();
		
	}
	

}
