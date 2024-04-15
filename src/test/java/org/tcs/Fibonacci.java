package org.tcs;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a whole number:");
		int num = s.nextInt();
		int n1=0, n2=1;
		if(num==1) {
		System.out.println(n1);
		}else if (num==2) {
			System.out.println(n1);
			System.out.println(n2);
		}else {		
			System.out.println(n1);
			System.out.println(n2);
		for (int i = 2; i <num; i++) {
			int n3 = n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);	
			
			}
		}
	}
}