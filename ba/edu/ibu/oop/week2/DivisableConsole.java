package ba.edu.ibu.oop.week2;

/*
4. Get two numbers and find if the first number is divisible by the second one.
	- Example run:
		Enter first number: 6
		Enter second number: 4
		6 is not divisible by 4
*/

public class DivisableConsole {

	public static void main(String[] args) {
		if (args.length != 2){
			System.out.println("Please send 2 integer numbers as arguments");
			return;
		}
		
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		
		if (number2 == 0){
			System.out.println("Can't divide by zero");
			return;
		}
		
		if (number1%number2 == 0){
			System.out.println(number1+" is divisible by "+number2);
		}else{
			System.out.println(number1+" is NOT divisible by "+number2);
		}
	}
}
