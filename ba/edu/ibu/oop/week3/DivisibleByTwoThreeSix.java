package ba.edu.ibu.oop.week3;

import java.util.Scanner;

public class DivisibleByTwoThreeSix {
	public static void main(String[] args) {
		int number = 0;
		int divisibleByTwo = 0;
		int divisibleByThree = 0;
		int divisibleBySix = 0;
		int notDivisible = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("Please enter a number: ");
			number = scanner.nextInt();

			if (number % 2 == 0 && number % 3 == 0) {
				divisibleBySix++;
				divisibleByThree++;
				divisibleByTwo++;
			} else if (number % 3 == 0)
				divisibleByThree++;
			else if (number % 2 == 0)
				divisibleByTwo++;
			else
				notDivisible++;
		}

		System.out.println(divisibleByTwo + " numbers are divisible by two.");
		System.out.println(divisibleByThree + " numbers are divisible by three");
		System.out.println(divisibleBySix + " numbers are divisible by six");
		System.out.println(notDivisible + " numbers are not divisible by two, three or six.");

		scanner.close();
	}
}