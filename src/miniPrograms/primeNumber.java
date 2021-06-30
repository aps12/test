package miniPrograms;

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = s.nextInt();
		if(isPrime(n)){
			System.out.println("Entered number is prime !!");
		}
		else{
			System.out.println("Entered number is NOT prime !!");
		}
	}

	private static boolean isPrime(int n) {
		if(n<=1){
			return false;
		}
		for (int i =2; i < Math.sqrt(n); i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
