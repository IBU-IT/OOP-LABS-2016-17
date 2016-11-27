package ba.edu.ibu.oop.week6;

import java.util.Scanner;

public class FirstTask {

	String accountNumber;

	public FirstTask(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[][] users = new Object[50][];
		Scanner scanner = new Scanner(System.in);
		String accountNumber;
		int choice;

		do {
			System.out
					.println("\nWelcome to our bank\n1. New account\n2. Operations\n3. Exit\nYour selection ");

			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				createAccount(users, scanner);
				break;
			case 2:
				accountNumber = login(users, scanner);
				if (!(accountNumber).equals("")) {
					operations(users, accountNumber, scanner);
				}
				break;
			case 3:
				closeScanner(scanner);
				System.exit(0);
			default:
				break;
			}

		} while (true);

	}

	public static void closeScanner(Scanner scanner) {
		scanner.close();
	}

	public static String login(Object[][] users, Scanner scanner) {
		String accountNumber, password = "";
		int counter = 0;
		do {
			System.out.println("\nPlease enter your account number ");
			accountNumber = scanner.next();
			int arrayIndex = getArrayIndex(users, accountNumber);
			if (arrayIndex != 50) {
				for (Object[] user : users) {
					if ((Boolean) users[arrayIndex][6] == false) {
						System.out
								.println("\n\nYour account is blocket. Contact administrator for details.");
						return "";
					} else {
						if (user != null && accountNumber.equals(user[5])) {
							do {
								System.out.println("Please enter your password ");
								password = scanner.next();
								counter++;
								if (counter == 3) {
									System.out.println("\n\n\nAccount is blocked\n\n\n");
									blockAccount(users, arrayIndex);
									return "";
								} else {
									if (user != null && accountNumber.equals(user[5])
											&& password.equals(user[4])) {
										return user[5].toString();
									}
								}
							} while (true);
						}
					}
				}
			}
		} while (true);
	}

	public static void operations(Object[][] users, String accountNumber, Scanner scanner) {

		FirstTask userAcc = new FirstTask(accountNumber);
		int index = getArrayIndex(users, accountNumber);
		int choice = 0;

		outerLoop: do {
			System.out
					.println("\n\nWhich operation you want to do\n1. Change password\n2. Deposit\n3. Withrawal\n4. Print\n5. Exit\nYour choice ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				userAcc.changePassword(users, index, scanner);
				break;
			case 2:
				userAcc.deposit(users, index, scanner);
				break;
			case 3:
				userAcc.withrawal(users, index, scanner);
				break;
			case 4:
				userAcc.printUserDetails(users, index);
				break;
			case 5:
				break outerLoop;
			default:
				break;
			}
		} while (true);

	}

	private void printUserDetails(Object[][] users, int arrayIndex) {
		System.out.println("/n/nName: " + users[arrayIndex][0]);
		System.out.println("Address: " + users[arrayIndex][1]);
		System.out.println("Phone: " + users[arrayIndex][2]);
		System.out.println("Account number: " + users[arrayIndex][5]);
		System.out.println("Balance: " + users[arrayIndex][3] + "\n");
	}

	private static int getArrayIndex(Object[][] users, String accountNumber) {
		int index = 0;

		for (Object[] user : users) {
			if (user != null && user[5].equals(accountNumber))
				return index;
			else
				index++;
		}
		return index;
	}

	public static void createAccount(Object[][] users, Scanner scanner) {

		Object[] user = new Object[7];
		int userIndex = arrayIndexForNewUser(users);
		String password = "";
		String confirmedPassword = "";
		int accountNumber;

		System.out.println("\n\n\nEnter your name ");
		user[0] = new String(scanner.next());

		System.out.println("Enter your address ");
		user[1] = new String(scanner.next());

		System.out.println("Enter your phone ");
		user[2] = new String(scanner.next());

		System.out.println("Enter your initial amount ");
		user[3] = new Integer(scanner.nextInt());

		System.out.println("Enter your password ");
		password = new String(scanner.next());

		do {
			System.out.println("Please retype your password ");
			confirmedPassword = new String(scanner.next());

			if (password.equals(confirmedPassword)) {
				user[4] = new String(password);
				break;
			}
		} while (true);

		accountNumber = (int) (Math.random() * 9000) + 1000;
		user[5] = "" + accountNumber;

		// This is flag that says that account is active
		user[6] = true;

		users[userIndex] = user;

		System.out.println("\n\nYour account number is " + user[5] + "\n");
	}

	public static void checkArray(Object[][] arr) {
		@SuppressWarnings("unused")
		int counter = 0;

		for (Object[] object : arr) {
			if (object != null) {
				System.out.println(object[5]);
				counter++;
			}
		}
	}

	public static int arrayIndexForNewUser(Object[][] users) {
		int arrayIndex = 0;
		for (Object[] object : users) {
			if (object != null)
				arrayIndex++;
		}
		return arrayIndex;
	}

	public void changePassword(Object[][] users, int arrayIndex, Scanner scanner) {
		System.out.println("Enter your new password ");
		String password = scanner.next();

		do {
			System.out.println("Please retype your password ");
			String confirmedPassword = scanner.next();

			if (password.equals(confirmedPassword)) {
				users[arrayIndex][4] = password;
				break;
			}
		} while (true);
		System.out.println("\nYou have sucessefuly change your password.\n");
	}

	public void withrawal(Object[][] users, int arrayIndex, Scanner scanner) {
		int withrawalAmount = 0;
		System.out.println("\n\nPlease enter amount you want to withraw: ");
		withrawalAmount = scanner.nextInt();
		users[arrayIndex][3] = (Integer) users[arrayIndex][3] - withrawalAmount;
	}

	public void deposit(Object[][] users, int arrayIndex, Scanner scanner) {
		int depositAmount = 0;
		System.out.println("\n\nPlease enter amount you want to deposit: ");
		depositAmount = scanner.nextInt();
		users[arrayIndex][3] = (Integer) users[arrayIndex][3] + depositAmount;
	}

	public static void blockAccount(Object[][] users, int arrayIndex) {
		users[arrayIndex][6] = false;
	}

}