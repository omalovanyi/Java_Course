package com.omalovanyi.jc.Lesson8_1;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class SimpleCalculator_BorderLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a panel
		JPanel windowContent= new JPanel();
		
		// Set a layout manager for this panel
		BorderLayout bl = new BorderLayout();
	
		windowContent.setLayout(bl);
		
		// Create controls in memory
		JLabel label1 = new JLabel("Number 1:");
		JTextField field1 = new JTextField(10);
		JLabel label2 = new JLabel("Number 2:");
		JTextField field2 = new JTextField(10);
		JLabel label3 = new JLabel("Sum:");
		JTextField result = new JTextField(10);
		JButton go = new JButton("Add");
		
		// Add controls to the panel
		windowContent.add(BorderLayout.SOUTH,label1);
		windowContent.add(BorderLayout.WEST,field1);
		//windowContent.add(label2);
		//windowContent.add(field2);
	   // windowContent.add(label3);
		windowContent.add(BorderLayout.CENTER,result);
		windowContent.add(BorderLayout.NORTH, go);
		
		// Create the frame and add the panel to it
		JFrame frame = new JFrame("My First Calculator3");
		// Add the panel to the top-level container
		frame.setContentPane(windowContent);
		//frame.setContentPane(windowContent2);
		
		// set the size and make the window visible
		frame.setSize(400,100);
		frame.setVisible(true);
		
		
		/// 2 part
		
		
		
		
		
		
	}

}
