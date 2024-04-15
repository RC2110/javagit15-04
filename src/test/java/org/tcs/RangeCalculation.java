package org.tcs;

import java.util.Scanner;

public class RangeCalculation {
	public static void main(String[] args) {
		int i=0;
		Scanner s = new Scanner(System.in);
		while(1<5) {
		System.out.println("Enter the byte size of the datatype:");
		byte nextByte = s.nextByte();
		short bit=(short) (nextByte*8);
		long lowerLimit = (long) -Math.pow(2, bit-1);
		long upperLimit = (long) ( Math.pow(2, bit-1)+1);
		System.out.println("The value range is from: "+lowerLimit+" to " + upperLimit);
		i++;
		}
	}
}