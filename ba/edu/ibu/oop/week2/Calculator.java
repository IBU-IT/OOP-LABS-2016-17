package ba.edu.ibu.oop.week2;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		
		System.out.println(" 1. \t Addition \n 2. \t Subtraction \n 3. \t Multiplication \n 4. \t Division \n 5. \t Modulus \n Your Selection : ");
		Scanner scan = new Scanner(System.in);
		int result;
		int choice = scan.nextInt(); 
		System.out.println("Enter first number: ");
		int number1 = scan.nextInt();
		System.out.println("Enter second number ");
		int number2 = scan.nextInt();
		scan.close();
		switch(choice)
		{ 
			case 1:
				result = number1 + number2;
				System.out.println("Result=" + number1 + "+" + number2 + "=" + result);
		        break;
		    case 2:
		    	result = number1 - number2;
		    	System.out.println("Result=" + number1 + "-" + number2 + "=" + result);
		        break;
		    case 3:
		    	result = number1 * number2;
		    	System.out.println("Result=" + number1 + "*" + number2 + "=" + result);
	            break;	
		    case 4:
			    result = number1 / number2;
			    System.out.println("Result=" + number1 + "/" + number2 + "=" + result);
			    break;
			case 5:
			    result = number1 % number2;
			    System.out.println("Result=" + number1 + "%" + number2 + "=" + result);
		        break;
		}
		}
        
}
