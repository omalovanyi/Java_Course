package com.omalovanyi.jc.Lesson8_1;

//import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloWorld extends JFrame{

	public HelloWorld()
	{
		setSize(200,300);
		setTitle("Hello Kotik");
		setVisible(true); 
		//JButton myButton = new JButton("OK");
		//add(myButton);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorld myHello = new HelloWorld();
		//JButton myButton = new JButton("OK");
		//myHello.add(myButton);
		
	}

}
