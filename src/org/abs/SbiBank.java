package org.abs;

public class SbiBank implements RbiBank, WorldBank {

	@Override
	public void savings() {
		System.out.println("Savings % : 5%");
	}

	@Override
	public void fixed() {
		System.out.println("Fixed % : 6%");
	}

	@Override
	public void loan() {
		System.out.println("Loan % : 7%");
	}
	
	
	public static void main(String[] args) {
		
		SbiBank s = new SbiBank();
		s.savings();
		s.fixed();
		s.loan();
		s.deposite();
		
	}

	@Override
	public void deposite() {
		System.out.println("deposite % : 10%");
	}
	

}
