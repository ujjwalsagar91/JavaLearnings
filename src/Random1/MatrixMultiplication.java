package Random1;

public class MatrixMultiplication {

	public static void main(String[] args) {


		int[][] a1 = {
				{1,2},
				{3,4}
		};

		int[][] a2 = {
				{1,2},
				{3,4}
		};

		int sum = 0;

		int[][] a3 = new int[2][2];

		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				for(int k=0; k<2; k++) {
					sum = sum + a1[i][k]*a2[k][j];
				}
				a3[i][j]=sum;
				sum=0;
			}
		}
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println(a3[i][j]);
			}
		}
	}

}
