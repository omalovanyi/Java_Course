package com.omalovanyi.jc.lesson4;

public class calcTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tax t1= new Tax(65000,"TX",4);
		
		Tax t2= new Tax(65000,"TX",4);
		
		double hisTax = t2.calcTax();
		
		System.out.println("for customer1 =" +hisTax);
	}

}
