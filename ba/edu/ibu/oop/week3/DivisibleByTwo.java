package ba.edu.ibu.oop.week3;

import java.util.Scanner;

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
