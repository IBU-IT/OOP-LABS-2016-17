package ba.edu.ibu.oop.week2;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] numbers=new int[5];
		for(int i=0;i<5;i++){
			System.out.println("Enter number "+(i+1)+": ");
			numbers[i]=sc.nextInt();
		}
		System.out.println("Number\t Zero\t Positive\t Negative");
		for(int i=0;i<numbers.length;i++){
			System.out.println("  "+numbers[i]+"\t  "+(numbers[i]==0?"+":"-")+"\t   2  "+(numbers[i]>0?"+":"-")+"\t             "+(numbers[i]<0?"+":"-"));
		}
		sc.close();
	}

}
