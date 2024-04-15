package org.tcs;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word to check if palindrome:");
		String word = s.next();
		String rev="";
		for(int i=word.length()-1; i>=0;i--) {
			rev = rev+word.charAt(i);	
		}
		if(rev.equalsIgnoreCase(word)) {
			System.out.println("The word is palindrome");
		}else {
			System.out.println("The word is not palindrome");
		}
	}
}