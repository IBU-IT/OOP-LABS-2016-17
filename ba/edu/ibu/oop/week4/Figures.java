package ba.edu.ibu.oop.week4;

import java.util.Scanner;

public class Figures {

	public int height;
	public int width;
	public int base;

	public static void main(String[] args) {
		Figures figure = new Figures();
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out
					.println("Select figure you want to draw:\n1. Rectangle\n2. Diamond\n3. Piramide\n4. Exit");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Please enter height for rectangle: ");
				figure.height = scanner.nextInt();
				System.out.println("Please enter width for rectangle: ");
				figure.width = scanner.nextInt();
				figure.drawRectangle(figure);
				break;
			case 2:
				System.out.println("Please enter diagonale for diamond: ");
				figure.base = scanner.nextInt();
				break;
			case 3:
				System.out.println("Please enter base for triangle: ");
				figure.base = scanner.nextInt();
				figure.drawTriangle(figure);
				break;
			case 4:
				System.out.println("Byee...");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Please enter valid input.");
				break;
			}

		} while (true);
	}

	public void drawRectangle(Figures figure) {
		for (int i = 1; i <= figure.height; i++) {
			for (int j = 1; j <= figure.width; j++) {
				if (i == 1 || i == figure.height)
					System.out.print("-");
				else if (j == 1 || j == figure.width)
					System.out.print("|");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public void drawDiamond(Figures figure) {

	}

	public void drawTriangle(Figures figure) {
		int c = 1;
		for (int i = 1; i <= figure.base; i++) {
			for (int j = i; j <= figure.base; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= c; k++) {
				if (k % 2 == 0)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			c += 2;
		}
	}
}
