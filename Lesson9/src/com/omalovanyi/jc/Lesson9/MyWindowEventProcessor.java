package com.omalovanyi.jc.Lesson9;
import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;

class MyWindowEventProcessor extends java.awt.WindowsAdapter {

	public void windowClosing(WindowEvent e) {
// your code that saves the data goes here.
		JOptionPane.showConfirmDialog(null,
				"Something happened...",
				"Just a test",
				JOptionPane.PLAIN_MESSAGE);
		
}
} 