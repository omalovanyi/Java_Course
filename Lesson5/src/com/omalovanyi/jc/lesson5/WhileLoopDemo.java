package com.omalovanyi.jc.lesson5;

public class WhileLoopDemo {
	
	
	public static void main(String[] args) {  
	
	String [] friends = new String[20];
	
	//String friends2 [][] = new String [20][2];
	
	friends[0] = "Masha"; //Initializing the first element
	friends[1] = "Matilda"; //Initializing the second element
	friends[2] = "Rosa";

	friends[19] = "Natasha"; 
	
	int n=friends.length;
	
	int j=0;
	int k=0;
	
	int i = 3;
	int a = i++; // a = 3, i = 4
	//System.out.println("for customer1 =" + a);
	int b = ++a;
	//System.out.println("for customer1 =" + b);
	
	
	for (String girl: friends) 
	   {
	 
		//System.out.println(girl);
	   }
		
	
	// While Loop
	int totalElements = 10;
	int d=0;
	while (d<totalElements){
	 // Do something
		
		
		
    // System.out.println(d);
	 d++;
	}
	
	i=0;
	do{
		 // Do something
		//System.out.println(i); 
		i++;
		} while (i<totalElements);
	
	i=0;
	while (i<n){
		
		
		if (friends[i]==null){
		 i++;
          continue;
		}
		
		//System.out.println("I love " + friends[i]);
		i++;
		 }
	
	String gfriend="Masha";
	if (gfriend=="Masha")
	{ // true or false?
		System.out.println("True1" );
			
	}
		
	
	String gfriend1 = new String ("Natasha");
	String gfriend2 = new String ("Natasha");
	if (gfriend1.equals(gfriend2))
	{ 
		// true or false?
		System.out.println("True22" );
		
	
	}
		
	}
	
	}
