package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] nums = {1, 6, 2, 4, 5, 2, 4, 8, 2,6,3};
		Set<Integer> missingNumSet = new HashSet<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			missingNumSet.add(nums[i]);
		}
		System.out.println("After removing duplicates in an array:");
		System.out.println(missingNumSet);
		
        List<Integer> missingNumList = new ArrayList<Integer>(missingNumSet);
		
		for (Integer i : missingNumList) {
			if(i +1 != missingNumList.get(i)) {
				System.out.println("Missing number in array: "+(i+1));
				break;
			}	
		}
	}
}