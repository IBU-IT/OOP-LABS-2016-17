package ba.edu.ibu.oop.week4;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		int length=10000;
		int counter=1;
		for(int i=1;i<length;i++){
			if(max<getNumberOfDevisors(i, length)){
				max=getNumberOfDevisors(i, length);
				counter=i;
			}
		}
		System.out.println("Number with most devisors is "+counter+" with "+(max+1)+" devisors.");
	}

	public static int getNumberOfDevisors(int num,int length){
		int counter=0;
		for(int i=1;i<length/2;i++){
			if(num%i==0 && i*i!=num)
				counter++;
		}
		return counter;
	}
}
