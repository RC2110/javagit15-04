package org.tcs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CharOccurance {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = s.nextLine();
		Map<Character, Integer> m = new LinkedHashMap<>();
		for(int i=0;i<=word.length()-1;i++) {
			char charAt = word.charAt(i);
			if(m.containsKey(charAt)) {
				Integer count = m.get(charAt);
				count++;
				m.put(charAt, count);
			} else {
				m.put(charAt, 1);
			}
		}
		Set<Entry<Character, Integer>> entry = m.entrySet();
		for(Entry<Character,Integer> e : entry) {
			if (e.getValue()>1) {
				System.out.println(e.getKey()+":"+e.getValue());
			}
		}
		
			
		
		
	}
}