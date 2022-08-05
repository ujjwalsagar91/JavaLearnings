package ArraysManipulation;

public class RemoveDuplicatesWithoutSet {

	public static void removeDuplicates(int[] a) {

		for(int i=0; i<a.length; i++) {
			boolean duplicate = false;
			int b = 0;
			while(b<i) {
				if(a[i] == a[b]) {
					duplicate = true;
				}
				b++;
			}
			if(duplicate == false) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static void main(String[] args) {

		int[] a = {5,2,3,3,4,4,5,5,5};

		removeDuplicates(a);

	}

}
