package com.omalovanyi.jc.lesson3.car;

public class NJTax extends Tax {
	
	
	
	NJTax(double gi, String st, int depen) {
		super(gi, st, depen);
		// TODO Auto-generated constructor stub
	}




	double adjustForStudents (double stateTax){
		 double adjustedTax = stateTax-500;
		 return adjustedTax;
		 }

	 
	
	 
	public double calcTax()
	{
		
		if (grossIncome>=50000)  
				{ 
			        return grossIncome*0.1;
				}
		else 
		{ 
			return grossIncome*0.13;
		
		}
	}

}
