package ba.edu.ibu.oop.week3;

import java.util.Scanner;

/*
4. Get ten numbers from the user and count the numbers that are divisible by 2, 3, 6 and none of them. Do not test the numbers by 6 instead use the idea that if a number is divible by 2 and 3 then it is divisible by 6.
	- Example Run:
		Enter a number: 1
		Enter a number: 24
		Enter a number: 36
		Enter a number: 40
		Enter a number: 15
		Enter a number: 17
		Enter a number: 19
		Enter a number: 14
		Enter a number: 13
		Enter a number: 32
		5 numbers are divisible by 2.
		3 numbers are divisible by 3.
		2 numbers are divisible by 6.
		
	# 4 numbers are not divisible by any of them.
 */

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