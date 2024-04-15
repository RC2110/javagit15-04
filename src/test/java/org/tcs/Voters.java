package org.tcs;

import java.util.Scanner;

public class Voters {
	public static void main(String[] args) {
		int i= 0;
		Scanner s = new Scanner(System.in);
		while(i<5) {
		System.out.println("Hello, enter your age:");
		byte nextByte = s.nextByte();
		if(nextByte>=18) {
			System.out.println("You're eligible to vote");
		} else {
			System.out.println("You're not eligible to vote");
		}
		i++;
		}
	}
}
