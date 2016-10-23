package ba.edu.ibu.oop.week3;

import java.util.Scanner;

/*
5. Calculate the average age of the family, classify the family according to the  average age.
	 The average is <=30, this family is young-family
 	 The average is >30 and <=50, this family is middle_aged-family
	 The average is >50, this family is old-family

	- Example Run:
		Enter number of  people in the family: 2
		Enter the age of the 1. member: 50
		Enter the age of the 2. member: 40
		The age average of this family is 45
	
	# This is family is young-family
 */

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
