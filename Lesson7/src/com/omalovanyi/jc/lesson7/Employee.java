package com.omalovanyi.jc.lesson7;

public class Employee extends Person {

	public Employee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean increasePay(int percent) {
		// TODO Auto-generated method stub
		System.out.println("Increasing salary by " +
				percent + "%. "+ getName());
				return true;
	}

}
