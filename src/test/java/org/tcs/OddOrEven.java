package org.tcs;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		int i=0;
		Scanner s = new Scanner(System.in);
		while(i<5) {
			System.out.println("Enter a whole number:");
			int nextInt = s.nextInt();
			if(nextInt%2==0) {
				System.out.println("The number is even");
			}else {
				System.out.println("The number is odd");
			}
		}
		
	
}

}
