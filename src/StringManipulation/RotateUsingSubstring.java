package StringManipulation;

public class RotateUsingSubstring {

	public static void leftRotate(String str, int index) {

		String output = str.substring(index) + str.substring(0, index);
		System.out.println(output);		
	}

	public static void rightRotate(String str, int index) {
		String output = str.substring(str.length()-index) + str.substring(0,str.length()-index); 
		System.out.println(output);
	}

	public static void main(String[] args) {
		
		leftRotate("Ujjwal", 2);
		rightRotate("Ujjwal", 2);
	}
}