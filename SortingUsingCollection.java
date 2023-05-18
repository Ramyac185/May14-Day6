package week3.day2;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] companyName = {"Google","Amazon","Microsoft","Cognizant","TestLeaf"};
		int length = companyName.length;
		String rev="";
		Arrays.sort(companyName);
		for (int i = length-1; i >= 0; i--) {
			rev += companyName[i]+" ";
		}
		System.out.println("Sorted Reverse order Company Names: "+rev);
	}

}
