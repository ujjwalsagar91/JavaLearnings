package ArraysManipulation;

public class TransposeOfMatrix {

	public static void transposeMatrix(int[][] a) {

		int[][] b = new int[4][4];

		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				b[i][j] = a[j][i];
			}
		}
		
		for(int m=0; m<4; m++) {
			for(int n=0; n<4; n++) {
				System.out.print(b[m][n] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] arr = {
				{1,1,1,1},
				{2,2,2,2},
				{3,3,3,3},
				{4,4,4,4}
		}; 
		transposeMatrix(arr);

	}

}
