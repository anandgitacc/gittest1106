package org.inheritance;

// child class A
public class Company extends Client {
	
	public void comName() {
		System.out.println("Company name: Greens Tech");
	}
	
	public void comId() {
		System.out.println("Company id : 1122");
	}
	
	public static void main(String[] args) {
		
		Company c = new Company();
		c.comName();
		c.comId();
		c.clName();
		c.clLocation();
		
	}
	
	

}
