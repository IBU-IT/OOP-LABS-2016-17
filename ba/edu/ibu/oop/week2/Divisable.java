package ba.edu.ibu.oop.week2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter first integer number: ");
		int number1 = 0;
		try {
			number1 = scanner.nextInt();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Please enter integer number");
			scanner.close();
			return;
		} 
		
		System.out.print("Please enter second integer number: ");
		int number2 = 0;
		try {
			number2 = scanner.nextInt();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Please enter integer number");
			scanner.close();
			return;
		} 
		
		if (number2 == 0){
			System.out.println("Can't divide by zero");
			scanner.close();
			return;
		}
		
		
		if (number1%number2 == 0){
			System.out.println(number1+" is divisible by "+number2);
		}else{
			System.out.println(number1+" is NOT divisible by "+number2);
		}
		scanner.close();
	}
}
