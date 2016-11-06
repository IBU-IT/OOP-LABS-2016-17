package ba.edu.ibu.oop.week2;
import java.util.Scanner;
public class Income {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<3; i++){
		System.out.println("What is your monthly income: ");
		int income = scan.nextInt();
		
		if (income>=0){
		if ( income<=1000)
		{
			System.out.println("Your family is VERY POOR!");
		}
		else if (income<=2000) 
		{
			System.out.println("Your family is POOR!");
		}
		else if (income<=3000) 
		{
			System.out.println("Your family is NORMAL!");
		}
		else if (income<=4000) 
		{
			System.out.println("Your family is RICH!");
		}
		else 
		{
			System.out.println("Your family is VERY RICH!");
		}
		
	}
		else System.out.println("Invalid input");
	}
		scan.close();
	}
}
