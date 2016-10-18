package ba.edu.ibu.oop.week3;

import java.io.IOException;
import java.util.Scanner;

/*
1. Write a simple calculator. Show a menu of operations to the user. Then get two numbers and calculate the result
	- Example Run:
		1. Addition
		2. Subtraction
		3. Multiplication
		4. Division
		5. Modulus
		Your Selection: 1
		Enter first number: 4
		Enter second number: 8
	# Result=4+8=12
 */

public class Calculator {
	public static void main(String[] args) throws IOException {
		int choice = 0;
		int firstNumber = 0;
		int secondNumber = 0;
		float result = 0;

		System.out
				.println("1. Addition \n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n6. Exit");

		System.out.println("Please choose which operation you want to use: ");

		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();

		if (choice == 6) {
			clearScreen();
			System.exit(0);
		}

		try {
			System.out.println("Please enter first number: ");
			firstNumber = scanner.nextInt();

			System.out.println("Please enter second number: ");
			secondNumber = scanner.nextInt();
		} catch (Exception e) {
			clearScreen();
			System.out
					.println("These operation can be done only on numbers. Plese try again");
			System.exit(0);
		}

		switch (choice) {
		case 1:
			result = firstNumber + secondNumber;
			System.out.println("Result: " + firstNumber + "+" + secondNumber
					+ "=" + result);
			break;
		case 2:
			result = firstNumber - secondNumber;
			System.out.println("Result: " + firstNumber + "-" + secondNumber
					+ "=" + result);
			break;
		case 3:
			result = firstNumber * secondNumber;
			System.out.println("Result: " + firstNumber + "*" + secondNumber
					+ "=" + result);
			break;
		case 4:
			if (secondNumber == 0)
				System.out
						.println("You cannot divide by zero. Plese try again.");
			else {
				result = firstNumber / secondNumber;
				System.out.println("Result: " + firstNumber + "/"
						+ secondNumber + "=" + result);
			}
			break;
		case 5:
			result = firstNumber % secondNumber;
			System.out.println("Result: " + firstNumber + "%" + secondNumber
					+ "=" + result);
			break;
		default:
			System.out.println("Please enter valid operation.");
			break;
		}

		System.out.println("\nDo you want to continue 1/0?");
		choice = 0;
		choice = scanner.nextInt();
		if (choice == 1) {
			clearScreen();
		} else {
			clearScreen();
			scanner.close();
			System.exit(0);
		}

	}

	/*
	 * This method is used to clear screen. It just prints 50 new lines.
	 */

	public static void clearScreen() {
		for (int i = 0; i < 50; i++)
			System.out.println("");
	}
}
