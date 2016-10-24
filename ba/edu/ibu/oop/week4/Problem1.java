package ba.edu.ibu.oop.week4;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input=getInput();
		String[] range=input.split(" ");
		int start=Integer.parseInt(range[0]);
		int finish=Integer.parseInt(range[1]);
		int[] primes=getPrimeNumbers(start, finish);
		showResults(primes);
	}
	
	public static void showResults(int[] primes){
		String res="";
		for(int i=0;i<primes.length;i++){
			res+=primes[i]+" ";
		}
		System.out.println(res+"\n");
	}
	
	public static int[] getPrimeNumbers(int start,int finish){
		if(finish-start<10){
			System.out.println("Range should be at least 10");
			System.exit(0);
		}
		int counter=0;
		int[] result=new int[10];
		for(int i=start;i<=finish;i++){
			if(isPrime(i)){
				if(counter<10){
					result[counter++]=i;
				}
				else
					break;
				
			}
		}
		return result;
	}
	
	public static String getInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range: ");
		String input=sc.nextLine();
		sc.close();
		return input;
	}
	
	public static boolean isPrime(int number){
		if(number<=1)
			return false;
		for(int i=2;i<=number/2;i++){
			if(number % i==0)
				return false;
		}
		return true;
	}

}
