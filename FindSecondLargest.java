package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> secondLargeSet = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			secondLargeSet.add(data[i]);
		}
		
		List<Integer> secondLargeList = new ArrayList<>(secondLargeSet);
		System.out.println(secondLargeList);
		System.out.println("Second Largest number in the List : "+secondLargeList.get(secondLargeList.size()-2));
	}

}
