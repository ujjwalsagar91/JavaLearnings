package ArraysManipulation;

public class SumOfElementsIn2DArray {

	public static void main(String[] args) {

		int[][] a = {{1,2,3},{4,5},{6}};
		int sum = 0;

		for(int i=0; i<3; i++) {
			try {
				for(int j=0; j<3; j++) {
					sum = sum+a[i][j];
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
			}
		}

		System.out.println(sum);
	}

}
