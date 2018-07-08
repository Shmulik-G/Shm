package com.shmulik.example;

import javax.swing.JOptionPane;

public class AbsoluteNum {

	public static void main(String[] args) {
		// Print The Absolute Number
		
		String strNum = JOptionPane.showInputDialog("Pleas enter your Number ? ");
		
		int num = Integer.parseInt(strNum);
		
		if (num < 0 ) 
			num = num * (-1);
			
		JOptionPane.showMessageDialog(null, "The Absolute Number is: " + num);

	}

}
