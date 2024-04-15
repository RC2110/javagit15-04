package org.tcs;

import java.util.Scanner;

public class FormatSent {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your sentence: ");
		String sent = s.nextLine();
		
		String[] split = sent.split(" ");
		String formattedString="";
		for(String s1: split) {
			char ca = s1.charAt(0);
			char upperCase = Character.toUpperCase(ca);
			String substring = s1.substring(1);
			formattedString = formattedString + upperCase+substring+" ";
		}
		System.out.println(formattedString);
	}

}
