package org.tcs;

import java.util.Scanner;

public class FactWhile {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a whole number:");
		int nextInt = s.nextInt();
		int i=1, fact=1;
		while(i<=nextInt) {
			fact = fact*i;
			i++;
		}
		System.out.println(fact);
		
	}
}
