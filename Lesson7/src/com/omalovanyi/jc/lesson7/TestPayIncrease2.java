package com.omalovanyi.jc.lesson7;

public class TestPayIncrease2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person workers[] = new Person[3];
		
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new Employee("Steve");
		
		for (Person p: workers){
		p.promote(30);
		}
		
	}

}
