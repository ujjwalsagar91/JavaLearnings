package ArraysManipulation;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] arr = {6,1,2,3,4,5,6,1,2,4};
		
		Set<Integer> s1 = new LinkedHashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			s1.add(arr[i]);
		}
		
		System.out.println(s1);

	}

}
