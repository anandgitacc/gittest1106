package org.inheritance;

// child class B
public class Employee extends Client {
	
	private void empName() {
		System.out.println("Employee name: Anand");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile: 8939278836");
	}
	
	// method3, method4
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.empName();
		e.empMobile();
		e.clLocation();
		e.clName();
		
	}

}
