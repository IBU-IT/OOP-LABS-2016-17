package ba.edu.ibu.oop.week3;

import java.util.Scanner;

/*
2. Get the monthly income of three families and categorize them as follows:
	- Example Run:
		What is your monthly income: 500
		This family is VERY POOR!
 */

public class MonthlyIncome {
	public static void main(String[] args) {
		int income = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter monthly income of your family: ");

		try {
			income = scanner.nextInt();
		} catch (Exception e) {
			System.out
					.println("You are allowed to enter just numbers. Plese try again.");
			System.exit(0);
		}

		if (income <= 1000)
			System.out.println("Your family is very poor.");
		else if (income > 1000 && income <= 2000)
			System.out.println("Your family is poor.");
		else if (income > 2000 && income <= 3000)
			System.out.println("Your family is normal.");
		else if (income > 3000 && income <= 4000)
			System.out.println("Your family is rich.");
		else if (income > 4000)
			System.out.println("Your family is very rich.");

		scanner.close();
	}
}
