package ba.edu.ibu.oop.week3;

import java.util.Scanner;

/*
6. Calculate the monthly budget of a family, classify the family according to the net income, calculate the average income per person if there is no deficit. For the budget consider the followings:
	Income:
		a. Ask the salary of the father
		b. Ask the salary of the mother
		c. Ask if there is another income
	Expenses:
		a. Ask for the rental 
		b. Ask for bills(electricity, water, etc.)
		c. Ask for kitchen expenses.
		d. Ask for the other expenses.(education,health,etc.)
	
	Classification
		If  net income is <= 530 YTL this family is a poor family
		If net income is  >530 and <=1500 YTL this family is a middle-class family
		If net income is  >1500 this family is a rich family
 */

public class BudgeteCalculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalIncome = 0;
		int sizeOfFamily = 0;
		String choice = "";

		while (true) {
			
			System.out.println("\nWould you like to do budget calculation, (Y)es/(N)o: ");
			choice = scanner.nextLine();
			
			if (choice.equals("y") || choice.equals("Y")) {
				
				clearScreen();
				System.out.print("Enter the income of your father (KM): ");
				totalIncome += scanner.nextInt();
				System.out.print("Enter the income of your mather (KM): ");
				totalIncome += scanner.nextInt();
				System.out.print("Enter if there is another income (KM): ");
				totalIncome += scanner.nextInt();
				System.out.print("Enter the rental expense (KM): ");
				totalIncome -= scanner.nextInt();
				System.out.print("Enter the bills expenses (KM): ");
				totalIncome -= scanner.nextInt();
				System.out.print("Enter the kitchen expenses (KM): ");
				totalIncome -= scanner.nextInt();
				System.out.print("Enter the other expenses (KM): ");
				totalIncome -= scanner.nextInt();
				System.out.print("How many people are there in  this family? ");
				sizeOfFamily = scanner.nextInt();

				System.out.println("Net income of your family is "
						+ totalIncome + " KM.");
				System.out.println("Income per person in your family is "
						+ totalIncome / sizeOfFamily + " KM.");

				if (totalIncome <= 530)
					System.out.println("You are poor family.");
				else if (totalIncome > 530 && totalIncome <= 1500)
					System.out.println("You are middle-class family.");
				else
					System.out.println("You are rich family.");
			} else if (choice.equals("n") || choice.equals("N")) {
				clearScreen();
				System.out.println("Byee..");
				if (!scanner.hasNextLine())
					scanner.close();
				System.exit(0);
			}
		}
	}

	/*
	 * This method is used to clear screen.
	 * It just prints 50 new lines. 
	 */
	public static void clearScreen() {
		for (int i = 0; i < 50; i++)
			System.out.println("");
	}
}
