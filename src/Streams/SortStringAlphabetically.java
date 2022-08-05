package Streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortStringAlphabetically {
	
	public static void sortStringOldWay(String str1) {
		String str = str1.replace(" ", "").toLowerCase();
		char[] ch = str.toCharArray();
		char temp;
		System.out.println("String before sorting : " + String.valueOf(ch));
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				
				if(ch[i]>ch[j]) {
					temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println("String after sorting : " + String.valueOf(ch));
	}
	
	public static void sortStringUsingStreams(String str) {
		
		String str1 = str.replace(" ", "").toLowerCase();
		List abc = str1.chars().mapToObj(e->(char)e).sorted().collect(Collectors.toList());
		String str2 = (String) abc.stream().map(e->String.valueOf(e)).collect(Collectors.joining(""));
		System.out.println(str2);
	}

	public static void main(String[] args) {
		
		sortStringUsingStreams("My name is Ujjwal");
		sortStringOldWay("My name is Ujjwal");

		
	}
	

}
