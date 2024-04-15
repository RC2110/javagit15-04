package org.tcs;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = s.next();
		String rev="";
		for(int i=word.length()-1; i>=0;i--) {
			rev= rev+word.charAt(i);
		}
		System.out.println(rev);
	}
}