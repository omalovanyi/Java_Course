package com.omalovanyi.jc.lesson3.car;

public class TestTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tax t = new Tax(500000,"NJ",3);
		
		//t.grossIncome=60000;
		//t.dependents=2;
		//t.state="NJ";
		
		
		double yourTax = t.calcTax();
		
		System.out.println("Your Tax is " + yourTax);
		
		//int credit = t.calcLoan(500,24);
		
		//System.out.println("Your Credit is " + credit);
		
		
	//	NJTax t1 = new NJTax(500000,"NJ",3);
		
		//t1.grossIncome=60000;
		//t1.dependents=2;
		//t1.state="NJ";
		
		//double yourTax1 = t1.calcTax();
		
		//double yourTax2 = t1.adjustForStudents(yourTax1);
		
		//System.out.println("Your Tax is " + yourTax1);
		//System.out.println("Your1 Tax is " + yourTax2);

	}

}
