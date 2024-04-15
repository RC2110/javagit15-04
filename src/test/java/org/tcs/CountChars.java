package org.tcs;

import java.util.Scanner;

public class CountChars {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sent = s.nextLine();
		int upperCaseCount=0, lowerCaseCount=0, numberCount=0, specialCharCount=0;

		for (int i = 0; i <= sent.length()-1; i++) {
			char ca = sent.charAt(i);
			if (ca >= 'A' && ca <= 'Z') {
				upperCaseCount++;

			} else if (ca >= 'a' && ca <= 'z') {
				lowerCaseCount++;

			}
			else if (ca >= '0' && ca <= '9') {
				numberCount++;
			}
			else {
				specialCharCount++;
			}
		} 
		System.out.println("Upper Case:" + upperCaseCount);
		System.out.println("Lower Case" + lowerCaseCount);
		System.out.println("Number"+numberCount);
		System.out.println("Special Charactor" + specialCharCount);
	}
}