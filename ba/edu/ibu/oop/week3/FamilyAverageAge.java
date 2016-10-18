package ba.edu.ibu.oop.week3;

import java.util.Scanner;

public class FamilyAverageAge {
	public static void main(String[] args) {
		int familySize = 0;
		float ageOfFamily = 0;
		float avgAgeOfFamily = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter number of people in your family: ");

		familySize = scanner.nextInt();

		for (int i = 1; i <= familySize; i++) {
			System.out.print("Please enter age of " + i + ". family member: ");

			ageOfFamily += scanner.nextInt();
		}

		avgAgeOfFamily = ageOfFamily / familySize;

		if (avgAgeOfFamily <= 30)
			System.out.println("Your family has " + avgAgeOfFamily
					+ " years and it is young family.");
		else if (avgAgeOfFamily > 30 && avgAgeOfFamily <= 50)
			System.out.println("Your family has " + avgAgeOfFamily
					+ " years and it is middle-aged family.");
		else if (avgAgeOfFamily > 50)
			System.out.println("Your family has " + avgAgeOfFamily
					+ " years and it is old family.");

		scanner.close();
	}
}
