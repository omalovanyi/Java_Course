package com.omalovanyi.jc.lesson4;

public class Tax {

	double grossIncome; // class member variables
	String state;
	int dependents;
	static int customerCounter;
	
	// Constructor
	Tax (double gi, String st, int depen){
	grossIncome = gi; // member variable initialization
	state = st;
	dependents=depen;
	customerCounter++; // increment the counter by one
	System.out.println("Preparing the tax data for customer #" + customerCounter);
	}

	static int calcTax() {
	    
		return ( customerCounter*100);
	
	}
	
	
	static int calcAdd(int x,int y )
	
	{
		
		return x+y;
	}
	
	
}
