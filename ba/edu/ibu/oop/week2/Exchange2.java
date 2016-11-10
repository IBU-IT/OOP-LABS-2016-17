package ba.edu.ibu.oop.week2;

import java.util.Scanner;

public class Exchange2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Yen = ");
		double yen = scan.nextDouble();
		System.out.println("Enter Sterling  = ");
		double sterling = scan.nextDouble();
		System.out.println("Enter BAM = ");
		double bam = scan.nextDouble();
		System.out.println("KM/Yen = " + bam + "/" + yen + "=" + String.format("%.4f", bam/yen));
		System.out.println("Yen/KM = " + yen + "/" + bam + "=" + String.format("%.4f", yen/bam));
		System.out.println("KM/Sterling = " + bam + "/" + sterling + "=" + String.format("%.4f", bam/sterling));
		System.out.println("Sterling/KM = " + sterling + "/" + bam + "=" + String.format("%.4f", sterling/bam));
		scan.close();

	}
}
