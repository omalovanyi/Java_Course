package com.omalovanyi.jc.lesson3.car;

public class TestTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tax t = new Tax();
		
		t.grossIncome=60000;
		t.dependents=2;
		t.state="NJ";
		
		
		double yourTax = t.calcTax();
		
		System.out.println("Your Tax is " + yourTax);

	}

}
