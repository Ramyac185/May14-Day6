package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] arrayText = text.split(" ");
		Set<String> duplicate = new LinkedHashSet<String>();
	
		for (int i = 0; i < arrayText.length; i++) {
			if(!duplicate.contains(arrayText[i])) {
				duplicate.add(arrayText[i]);
			}			
		}
		String output = String.join(" ", duplicate);
		System.out.println(output);
	}

}
