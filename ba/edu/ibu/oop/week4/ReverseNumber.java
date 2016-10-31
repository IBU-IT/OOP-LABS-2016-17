package ba.edu.ibu.oop.week4;

import java.util.Scanner;

/*
 4. Write a program that reverses a number that is entered by the user. 
 It does this by using the modulus % operator. 

	 Example run:	
	 Enter the number to be reversed: 423
	 Reverse of 423 is 324
 */
public class ReverseNumber {
	public static void main(String[] args) {
		int number, enteredNumber, reverse = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number to be reversed: ");
		number = scanner.nextInt();
		enteredNumber = number;

		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		System.out.println("Reverse of " + enteredNumber + " is " + reverse);
		scanner.close();
	}
}
