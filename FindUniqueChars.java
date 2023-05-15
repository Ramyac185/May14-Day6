package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindUniqueChars {

	public static void main(String[] args) {
		String companyName = "google";
		char[] characters = companyName.toCharArray();
		Set<Character> uniqueChar = new LinkedHashSet<Character>();

		for (int i = 0; i < characters.length; i++) {
			boolean add = uniqueChar.add(characters[i]);
			if(!add) {
				uniqueChar.add(characters[i]);
			}
		}
		System.out.println(uniqueChar);
	}

}
