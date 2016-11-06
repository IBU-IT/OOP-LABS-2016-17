package ba.edu.ibu.oop.week2;

import javax.swing.JOptionPane;

public class CalculatorGUI {
public static void main(String[] args) {
		
		String menu = JOptionPane.showInputDialog(" 1. \t Addition \n 2. \t Subtraction \n 3. \t Multiplication \n 4. \t Division \n 5. \t Modulus \n Your Selection : ");
		int result;
		int choice = Integer.parseInt(menu); 
		String num1 = JOptionPane.showInputDialog("Enter first number: ");
		int number1 = Integer.parseInt(num1);
		String num2 = JOptionPane.showInputDialog("Enter second number ");
		int number2 = Integer.parseInt(num2);
		switch(choice)
		{ 
			case 1:
				result = number1 + number2;
				JOptionPane.showMessageDialog(null, "Result=" + number1 + "+" + number2 + "=" + result);
		        break;
		    case 2:
		    	result = number1 - number2;
		    	JOptionPane.showMessageDialog(null,"Result=" + number1 + "-" + number2 + "=" + result);
		        break;
		    case 3:
		    	result = number1 * number2;
		    	JOptionPane.showMessageDialog(null, "Result=" + number1 + "*" + number2 + "=" + result);
	            break;	
		    case 4:
			    result = number1 / number2;
			    JOptionPane.showMessageDialog(null, "Result=" + number1 + "/" + number2 + "=" + result);
			    break;
			case 5:
			    result = number1 % number2;
			    JOptionPane.showMessageDialog(null, "Result=" + number1 + "%" + number2 + "=" + result);
		        break;
		}
		}

}
