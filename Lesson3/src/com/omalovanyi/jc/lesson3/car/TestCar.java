package com.omalovanyi.jc.lesson3.car;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car car1 = new Car();
        Car car2 = new Car(); 
        
        JamesBondCar car3 = new JamesBondCar();
        
        car3.currentSubmergeDepth=11;
        car3.submerge();
           		
        car1.color="Red";
        car2.color="Blue";
		
        System.out.println("Car1 = "+car1.color);
        System.out.println("Car2 = "+car2.color);
        System.out.println("Car3 currentSubmergeDepth = "+car3.MANUFACTURER);
	}

}
