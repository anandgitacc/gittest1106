package org.polymorphism;

// child class
public class SbiBank extends RbiBank {
	
	@Override // @-> annotation
	public void savings() {
		System.out.println("Sbi Savings % is: 6%");
		super.savings();
	}
	
	@Override
	public void fixed() {
		System.out.println("Sbi fixed % is: 7%");
		super.fixed();
	}
	
	public static void main(String[] args) {
		
		SbiBank s = new SbiBank();
		s.savings();
		s.fixed();
		
	}
	

}
