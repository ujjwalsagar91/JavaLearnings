package StringManipulation;

public class SplitSentence {

	public static void main(String[] args) {

		String str = "Hello Ujjwal Sagar";

		String[] strArr = str.split("\\s");
		int count = 0;
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);

		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length(); j++) {
				if(strArr[i].charAt(j)=='l') {
					count++;
				}
			}
			if(count==2) {
				for(int k=strArr[i].length()-1; k>=0; k--) {
					System.out.print(strArr[i].charAt(k));
				}
				System.out.println();
			}
			
			else {
				System.out.println(strArr[i]);
			}
		}

	}
}
