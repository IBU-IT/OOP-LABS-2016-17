package ba.edu.ibu.oop.week2;
import java.util.Scanner;
public class NumOfPosNegZero {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int[] numbers=new int[5];
		int pos=0, neg=0, zero=0;
		for(int i=0;i<5;i++){
			System.out.println("Enter number "+(i+1)+": ");
			numbers[i]=scan.nextInt();
			if (numbers[i]<0) neg++;
			else if  (numbers[i]>0) pos++;
			else zero++;
		}
        
		if (pos == 1) System.out.println("There is 1 positive value.");
		else System.out.println("There are " + pos +  " positive values.");
		if (zero == 1) System.out.println("There is 1 zero value.");
		else System.out.println("There are " + zero +  " zero values.");
		if (neg == 1) System.out.println("There is 1 negative value.");
		else System.out.println("There are " + neg +  " negative values.");
		scan.close();
	}

}
