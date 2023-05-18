package week3.day2;


import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		int[] data = {4,3,6,8,29,1,29,7,8};
		Set<Integer> duplicateNum = new TreeSet<>();
		
		for (int i = 0; i < data.length; i++) {
			boolean add = duplicateNum.add(data[i]);
			if(!add) {
				System.out.println(data[i]);
			}
		}
	}

}
