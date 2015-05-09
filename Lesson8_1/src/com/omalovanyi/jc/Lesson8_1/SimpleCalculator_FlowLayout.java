package com.omalovanyi.jc.Lesson8_1;
import javax.swing.*;
import java.awt.FlowLayout;

public class SimpleCalculator_FlowLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a panel
		JPanel windowContent= new JPanel();
		JPanel windowContent2= new JPanel();
		
		// Set a layout manager for this panel
		FlowLayout fl = new FlowLayout();
		windowContent.setLayout(fl);
		windowContent2.setLayout(fl);
		
		// Create controls in memory
		JLabel label1 = new JLabel("Number 1:");
		JTextField field1 = new JTextField(10);
		JLabel label2 = new JLabel("Number 2:");
		JTextField field2 = new JTextField(10);
		JLabel label3 = new JLabel("Sum:");
		JTextField result = new JTextField(10);
		JButton go = new JButton("Add");
		
		// Add controls to the panel
		windowContent.add(label1);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(result);
		windowContent.add(go);
		
		windowContent2.add(label1);
		
		
		
		// Create the frame and add the panel to it
		JFrame frame = new JFrame("My First Calculator");
		
		// Add the panel to the top-level container
		frame.setContentPane(windowContent);
		//frame.setContentPane(windowContent2);
		
		// set the size and make the window visible
		frame.setSize(400,100);
		frame.setVisible(true);

	}

}
