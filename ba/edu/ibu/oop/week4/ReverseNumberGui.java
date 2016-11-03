package ba.edu.ibu.oop.week4;

import javax.swing.JOptionPane;

public class ReverseNumberGui {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter number"));
		JOptionPane.showMessageDialog(null, "Reverse number of number "+ num + " is "+ ReverseNumber.reverse(num));
	}
}
