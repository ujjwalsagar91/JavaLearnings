package RandomTest;

public class FibonacciTest {
	
	static int n1=0;
	static int n2=1;
	
	public static void printFibonacci(int n) {
		
		int sum= 0;
		if(n>1) {
			sum = n1+n2;
			System.out.print(" " + sum);
			n1=n2;
			n2=sum;
			printFibonacci(n-1);
		}
		
	}

	public static void main(String[] args) {

//		0 1 1 2 3 5 8 13 21 34
		System.out.print(n1 + " " + n2);
		printFibonacci(6);

	}

}
