package ArraysManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftNumbersInArray {

	public static void shiftNumber(int[] arr, int n) {
		
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list = new ArrayList<>();
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			if(arr[i]!=n) {
				list.add(arr[i]);
			}
		}
		
		int count = len - list.size();
		
		for(int j=0; j<count; j++) {
			list.add(n);
		}
		
		System.out.println(list.toString());
		
	}
	
	public static void main(String[] args) {

		int[] a  = {1,2,0,4,0,5,0,2,7,0};
		int[] b  = {1,2,2,4,2,5,2,2,7,0};
		shiftNumber(a, 0);
		shiftNumber(b, 2);

	}

}
