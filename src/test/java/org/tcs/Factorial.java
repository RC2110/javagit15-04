package org.tcs;

import java.util.Iterator;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a whole number: ");
		int nextInt = s.nextInt();
		int fact =1;
		for (int j = 1; j <= nextInt; j++) {
			fact=fact*j;
		}
		System.out.println(fact);
			
		}
		
}