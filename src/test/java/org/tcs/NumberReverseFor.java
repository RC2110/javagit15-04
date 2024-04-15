package org.tcs;

import java.util.Scanner;

public class NumberReverseFor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a whole number");
		int num = s.nextInt(); //678
		int i=0;
		for(;num>0;) { 
			int r = num%10;
			i=(i*10)+r;
			num = num/10;
		}
		
	System.out.println(i);
	}
	

}
