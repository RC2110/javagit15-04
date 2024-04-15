package org.tcs;

import java.util.Scanner;

public class ReverseSent {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your sentence");
		String sent = s.nextLine();
		String[] split = sent.split(" ");
		String rev = "";
		for (String string : split) {
			for(int i = string.length()-1; i>=0; i--) {
				char charAt = string.charAt(i);
				rev=rev+charAt;
		}
			rev=rev+" ";
		}
		System.out.println(rev);
	}

}
