package ba.edu.ibu.oop.week3;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) throws IOException {
		int choice = 0;
		int first_number = 0;
		int second_number = 0;
		float result = 0;

		System.out
				.println("1. Addition \n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n6. Exit");

		System.out.println("Please choose which operation you want to use: ");

		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();

		if (choice == 6) {
			clear_screen();
			System.exit(0);
		}

		try {
			System.out.println("Please enter first number: ");
			first_number = scanner.nextInt();

			System.out.println("Please enter second number: ");
			second_number = scanner.nextInt();
		} catch (Exception e) {
			clear_screen();
			System.out
					.println("These operation can be done only on numbers. Plese try again");
			System.exit(0);
		}

		switch (choice) {
		case 1:
			result = first_number + second_number;
			System.out.println("Result: " + first_number + "+" + second_number
					+ "=" + result);
			break;
		case 2:
			result = first_number - second_number;
			System.out.println("Result: " + first_number + "-" + second_number
					+ "=" + result);
			break;
		case 3:
			result = first_number * second_number;
			System.out.println("Result: " + first_number + "*" + second_number
					+ "=" + result);
			break;
		case 4:
			if (second_number == 0)
				System.out
						.println("You cannot divide by zero. Plese try again.");
			else {
				result = first_number / second_number;
				System.out.println("Result: " + first_number + "/"
						+ second_number + "=" + result);
			}
			break;
		case 5:
			result = first_number % second_number;
			System.out.println("Result: " + first_number + "%" + second_number
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
			clear_screen();
		} else {
			clear_screen();
			scanner.close();
			System.exit(0);
		}

	}

	public static void clear_screen() {
		for (int i = 0; i < 50; i++)
			System.out.println("");
	}
}
