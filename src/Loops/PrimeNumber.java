package Loops;

public class PrimeNumber {
public static void main(String[]args) {
	//Find out prime number from 1-100 &smallest prime number is 2
	int number=2;
	int temp=0;
	
	for(int i=2;i<=number-1;i++) {
		if(number%i==0) {
			temp=temp+1;
		}
		}
		if(temp==0) {
			System.out.println("number is prime");
	}else {
		System.out.println("number is not  prime");
	}
}
}
