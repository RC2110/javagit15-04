package org.tcs;

public class NumberReverse {
	public static void main(String[] args) {
		int a = 123456;
		int i=0;
		while(a>0) {
		int n =a%10;
		i=(i*10)+n;
		a=a/10;
		}
	System.out.println(i);	
	}

}
