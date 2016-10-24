package ba.edu.ibu.oop.week4;

import java.util.Scanner;

/*
 2. Write a program that draws the triangles given below
 
		 1.	 		2.  			3.		4.
		 *****  |	*****	|  		*	|	*
		  **** 	|	****	|  	   **	|	**
		   *** 	|	***		|     ***	|	***
		    **	|	**		|    ****	|	****
		     *	|	*		|   *****	|	*****
 */
public class DrawTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Which figure you want to draw (1, 2, 3, 4) or 5 for exit?");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				drawFirstFigure();
				break;
			case 2:
				drawSecondFigure();
				break;
			case 3:
				drawThirdFigure();
				break;
			case 4:
				drawFourthFigure();
				break;
			case 5:
				System.out.println("Byee...");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Please enter valid input.");
				break;
			}
		} while (true);

	}

	public static void drawFirstFigure() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void drawSecondFigure() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public static void drawThirdFigure() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (j > i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void drawFourthFigure() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
