package org.tcs;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a whole number: ");
		int num = s.nextInt();
		int count=0;
		for (int i = 2; i < num; i++) {
			if (num%i==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("The number is not prime");
		}else {
			System.out.println("The number is prime");
		}
		
		
	}

}
