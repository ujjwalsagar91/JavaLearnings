package RandomTest;

public class ReverseEveryWordInSentence {

	public static void reverseWordsInSentence(String str) {
		
		String strArr[] = str.split("\\s");
		
		for(int i=0; i<strArr.length; i++) {
			String op = reverseString(strArr[i]);
			System.out.print(op + " ");
		}
	}
	
	public static String reverseString(String str) {
		char[] chArr = str.toCharArray();
		String op = "";
		for(int i=chArr.length-1; i>=0; i--) {
			op = op + String.valueOf(chArr[i]);
		}
		return op;
	}
	
	public static void main(String[] args) {

		String str = "Hi My Name Is Ujjwal";
		reverseWordsInSentence(str);

	}

}
