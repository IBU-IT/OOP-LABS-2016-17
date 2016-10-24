package ba.edu.ibu.oop.week4;

import java.util.Scanner;

/*


 6. We want to print different figures. The user selects the figure type and you will 
    print a figure accordingly until the user wants to quit.

	 1. Rectangle	 2. Diamond    		3. Pyramid
	 ---------			  *					 *
	 |		|		    * * *		   		* *
	 |		|		  * * * * *	      	   * * *
	 |		|		  * * * * *			  * * * *
	 |		|		    * * *			 * * * * *
	 ---------		   	  *				* * * * * *
 */
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
					.println("Select figure you want to draw:\n1. Rectangle\n2. Diamond\n3. Pyramid\n4. Exit");
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
				figure.drawDiamond(figure);
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
		for (int i = 1; i <= figure.base; i++) {
			for (int j = figure.base; j >= i; j--) {
				System.out.print(" ");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i = 1; i <= figure.base; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int m = figure.base; m >= i; m--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public void drawTriangle(Figures figure) {
		for (int i = 1; i <= figure.base; i++) {
			for (int j = figure.base; j >= i; j--) {
				System.out.print(" ");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
