package ba.edu.ibu.oop.week4;

import java.util.Scanner;

public class GeometryCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			menu();
			int choice=sc.nextInt();
			switch(choice){
			case 1 :
				System.out.println("Side 1: ");
				int side1=sc.nextInt();
				System.out.println("Side 2: ");
				int side2=sc.nextInt();
				System.out.println("Area= "+(side1*side2));
				System.out.println("Perimetar= "+(2*(side1+side2)));
				break;
			case 2 :
				System.out.println("Side 1: ");
				int tside1=sc.nextInt();
				System.out.println("Side 2: ");
				int tside2=sc.nextInt();
				double hypo=Math.sqrt((tside1*tside1)+(tside2*tside2));
				System.out.println("Hypotenuse= "+hypo);
				System.out.println("Area= "+((tside1*tside2)/2));
				System.out.println("Perimeter= "+(tside1+tside2+hypo));
				break;
			case 3 :
				System.out.println("Diametar: ");
				int di=sc.nextInt();
				System.out.println("Area= "+(Math.PI*(di/2)*(di/2)));
				System.out.println("Perimeter= "+(2*Math.PI*(di/2)));
				break;
			case 4 :
				System.out.println("Geometry class ends. See you later");
				sc.close();
				System.exit(0);
				break;
			}
			//clearScreen();
		}
	}
	
	public static void menu(){
		System.out.println("Select shape for calculation: ");
		System.out.println(" 1. Rectangle\n 2. Triangle\n 3. Circle\n 4. Quit");
		System.out.println("Your Chooice: ");
	}
	
	public static void clearScreen(){
		for (int i = 0; i < 50; ++i) System.out.println();
	}
}
