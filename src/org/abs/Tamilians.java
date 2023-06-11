package org.abs;

// child class
public class Tamilians extends Indians {

	@Override
	public void foodHabit() {
		System.out.println("following south food habit");
	}

	@Override
	public void culture() {
		System.out.println("following south culture");
	}
	
	private void festival() {
		System.out.println("celebrating pongal");
	}
	
	public static void main(String[] args) {
		
		Tamilians t = new Tamilians();
		t.foodHabit();
		t.culture();
		t.festival();
		t.panCard();
		t.aadharCard();
	}
	

}
