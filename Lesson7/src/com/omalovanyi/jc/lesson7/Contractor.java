package com.omalovanyi.jc.lesson7;

public class Contractor extends Person {

	public Contractor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean increasePay(int percent) {
		// TODO Auto-generated method stub
		if(percent < INCREASE_CAP){
			System.out.println("Increasing hourly rate by " +
			percent + "%. "+ getName());
			return true;
			} else {
			System.out.println("Sorry, can�t increase hourly rate by more than" 
			+ INCREASE_CAP + "%. "+ getName());
			return false;
			}
	}

}
