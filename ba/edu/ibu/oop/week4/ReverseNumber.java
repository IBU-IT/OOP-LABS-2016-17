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
		int number;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number to be reversed: ");
		number = scanner.nextInt();

		System.out.println("Reverse of " + number + " is " + reverse(number));
		scanner.close();
	}
	
	public static String reverse(int number){
		StringBuilder b = new StringBuilder();
		
		while (number != 0) {
			b.append(number % 10);
			number = number / 10;
		}
		
		return b.toString();
	}
}
