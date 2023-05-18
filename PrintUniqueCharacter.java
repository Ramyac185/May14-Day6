package week3.day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name = "Ramya";
	
		char[] ch = name.toLowerCase().toCharArray();
		Arrays.sort(ch);
		Map<Character, Integer> nonRepeatingChar = new HashMap<>();
		
		for (char c : ch) {
			nonRepeatingChar.put(c, nonRepeatingChar.getOrDefault(c, 0) +1);
		}
		
		System.out.println("Frequency of each character in my name: "+nonRepeatingChar);
		
		System.out.println("Non Repeating Characters in my name are");
		System.out.println("----------------------------------------");
		
		for (char c : ch) {
			if(nonRepeatingChar.get(c) == 1) {
				System.out.print(c+"  ");
			}	
		}
	}
}
