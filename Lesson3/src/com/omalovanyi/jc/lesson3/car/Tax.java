package com.omalovanyi.jc.lesson3.car;

public class Tax {

	double grossIncome;
	String state;
	int dependents;
	
	  Tax(double gi, String st, int depen) 
	  
	  {
		 grossIncome = gi; // class variable initialization
		 state = st;
		 dependents=depen;
		
	}
	
	public double calcTax()
	{
		
		if (grossIncome>=50000)  
				{ 
			        return grossIncome*0.06;
				}
		else 
		{ 
			return grossIncome*0.08;
		
		}
	}
	
	public int calcLoan (int amount,int number, String state) 
	
	{
		int fin=0;
		if (state=="NJ") 
		{
			fin=(amount*2+amount)*number;
		}
		
		return fin;
		
	}

public int calcLoan (int amount,int number) 
	
	{
	   
	
	return calcLoan(amount,number,"NJ");
      	
	   
	}
	
}
