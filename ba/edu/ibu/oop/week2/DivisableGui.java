package ba.edu.ibu.oop.week2;


import javax.swing.JOptionPane;

public class DivisableGui {

	public static void main(String[] args) {
		int number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter first integer number : "));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter second integer number : "));
		
		if (number2 == 0){
			JOptionPane.showMessageDialog(null, "Can't divide by zero");
			return;
		}
		
		if (number1%number2 == 0){
			JOptionPane.showMessageDialog(null, number1+" is divisible by "+number2);
		}else{
			JOptionPane.showMessageDialog(null, number1+" is NOT divisible by "+number2);System.out.println(number1+" is NOT divisible by "+number2);
		}
	}
}
