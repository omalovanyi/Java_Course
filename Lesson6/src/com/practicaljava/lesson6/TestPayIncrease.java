package com.practicaljava.lesson6;

//import com.omalovanyi.jc.lesson7.Person;

public class TestPayIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Payable workers[] = new Payable[3];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new Employee("Steve");
		
		Employee currentEmployee;
		Contractor currentContractor;
		
		/*for (Person p: workers)
		
		{
			
		if (p instanceof Employee)
		{
		   currentEmployee = (Employee) p;
		   currentEmployee.increasePay(30);
		}
		else if (p instanceof Contractor)
		{
		   currentContractor = (Contractor) p;
		   currentContractor.increasePay(30);
		}
		}*/
		
		for (Payable p: workers){
			p.increasePay(30);
			
			}
		
		
		
		
	}

}
