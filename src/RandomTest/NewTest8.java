package RandomTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewTest8 { 

	public static void main(String[] args) {

		int[] num1 = {1,2,3};
		int num2[] = {3,4,5};
		Integer[] num3 = new Integer[num1.length+num2.length];
		
		
		System.out.println(num3.length);
		
//		String s1 = null;
//		System.out.println(s1.equals("book"));
//		System.out.println("book".equals(s1));
		
		String s1 = "coding";
//		String s3 = new String("coding");
		StringBuffer s2 = new StringBuffer(s1);
		StringBuffer s3 = new StringBuffer("coding");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s1));
		System.out.println(s3.equals(s1));
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.contentEquals(s3));
//		System.out.println(s1==s3);
//		System.out.println(s1.equals(s3));
		StringBuilder s5 = new StringBuilder("coding");
		System.out.println(s1.equals(s5));
		System.out.println(s3.equals(s5));
		
	}
}
