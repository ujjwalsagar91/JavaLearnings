package RandomTest;

public class MergeSortedArrays {
	
	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		
		int[] arr3 = new int[arr1.length+arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			}
			else {
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while(i<arr1.length) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		
		return arr3;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,4,7,8};
		int[] arr2 = {2,5,9,11};
		int[] arr3 = mergeArrays(arr1, arr2);
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}
}
