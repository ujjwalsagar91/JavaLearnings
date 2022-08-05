package ArraysManipulation;

public class MatrixMultiplication {

	public static void multiplyMatrix(int[][] a1, int[][] a2) {

		int sum = 0;

		int[][] a3 = new int[2][2];

		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				for(int k=0; k<3; k++) {
					sum = sum + a1[i][k]*a2[k][j];
				}
				a3[i][j]=sum;
				sum=0;
			}
		}

		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(a3[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int[][] arr1 = {
				{1,2,3},
				{2,3,4}
		};

		int[][] arr2 = {
				{1,2},
				{2,3},
				{3,4}
		};


		multiplyMatrix(arr1, arr2);

	}

}
