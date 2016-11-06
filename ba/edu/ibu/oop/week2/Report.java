package ba.edu.ibu.oop.week2;
import java.util.Scanner;
public class Report {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("First Student:");
		
		System.out.println(" Enter your name and surname then your age, year of study and your GPA: ");
		String name1 = scan.next();
		String surname1 = scan.next();
		int age1 = scan.nextInt();
		int year1 = scan.nextInt();
		double gpa1 = scan.nextDouble();
		
		System.out.println(" Enter your gender F(emale) M(ale): ");
		String gender1 = scan.next();
		
		System.out.println(" Enter your id and #credits you have taken this semester: ");
		int id1 = scan.nextInt();
		int credits1 = scan.nextInt();
		
		System.out.println("Second Student:");
		
		System.out.println(" Enter your name and surname then your age, year of study and your GPA: ");
		String name2 = scan.next();
		String surname2 = scan.next();
		int age2 = scan.nextInt();
		int year2 = scan.nextInt();
		double gpa2 = scan.nextDouble();
		
		System.out.println(" Enter your gender F(emale) M(ale): ");
		String gender2 = scan.next();
		
		System.out.println(" Enter your id and #credits you have taken this semester: ");
		int id2 = scan.nextInt();
		int credits2 = scan.nextInt();
		
		System.out.println("Report:");
		System.out.println("=====================================================");
		System.out.println("First Student:");
		System.out.println("--------------");
		System.out.println("Name Surname: " + name1 + " " + surname1 + "\t Gender:" + gender1 );
		System.out.println("Age: " + age1 + "\t\t\t ID: " + id1);
		System.out.println("Year: " + year1 + "\t\t\t GPA: " + gpa1);
		System.out.println("You have taken "+credits1+" credits.");
		System.out.println("=====================================================");
		System.out.println("Second Student:");
		System.out.println("--------------");
		System.out.println("Name Surname: " + name2 + " " + surname2 + "\t Gender:" + gender2 );
		System.out.println("Age: " + age2 + "\t\t\t ID: " + id2);
		System.out.println("Year: " + year2 + "\t\t\t GPA: " + gpa2);
		System.out.println("You have taken "+credits2+" credits.");
		scan.close();
	}
}
