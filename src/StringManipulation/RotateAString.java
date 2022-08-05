package StringManipulation;

public class RotateAString {

	public static void rightRotate(String str, int index) {

		String op = "";
		char[] ch = str.toCharArray();

		for(int k=1; k<=index; k++) {
			char last = ch[ch.length-1];
			for(int i= ch.length-1; i>0; i--) {
				ch[i] = ch[i-1];
			}
			ch[0] = last;
		}

		for(char c : ch) {
			op = op+c;
		}
		System.out.println(op);
	}

	public static void leftRotate(String str, int index) {
		
		String op = "";
		
		char[] ch = str.toCharArray();
		for(int i=1; i<=index; i++) {
			char first = ch[0];
			for(int j=0; j<ch.length-1; j++) {
				ch[j] = ch[j+1];
			}
			ch[ch.length-1] = first;
		}
		
		for(char c : ch) {
			op = op+c;
		}
		System.out.println(op);

	}

	public static void main(String[] args) {

		rightRotate("Ujjwal", 2);
		leftRotate("Ujjwal", 2);

	}

}
