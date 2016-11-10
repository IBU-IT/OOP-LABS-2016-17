package ba.edu.ibu.oop.week2;
import java.util.Scanner;
public class Exchange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter $= ");
		double dollar = scan.nextDouble();
		System.out.println("Enter E= ");
		double euro = scan.nextDouble();
		System.out.println("$/E = " + dollar + "/" + euro + "=" + String.format("%.4f", dollar/euro));
		System.out.println("E/$" + euro + "/" + dollar + "=" + String.format("%.4f", euro/dollar));
		
		scan.close();

	}

}
