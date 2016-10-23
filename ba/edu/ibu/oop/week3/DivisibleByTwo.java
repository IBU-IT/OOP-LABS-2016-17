package ba.edu.ibu.oop.week3;

import java.util.Scanner;

/*
3. Get ten numbers from the user and count the ones that are divisible by 2.
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
	# 5 numbers are divisible by 2.
 */

public class DivisibleByTwo {
	public static void main(String[] args) {
		int counter = 0;
		int number = 0;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("Please enter a number: ");
			number = scanner.nextInt();
			if (number % 2 == 0)
				counter++;
		}

		System.out.println(counter + " numbers are divisible by 2.");
		scanner.close();
	}
}
