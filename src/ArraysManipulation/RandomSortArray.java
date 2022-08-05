package ArraysManipulation;

public class RandomSortArray {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,6,7,8,9};
		
		for(int i=0; i<a.length-2; i+=3) {
			int temp = a[i];
			a[i] = a[i+2];
			a[i+2] = temp;
//			i+=2;
		}
		
		for(int s : a) {
			System.out.println(s);
		}

	}

}
