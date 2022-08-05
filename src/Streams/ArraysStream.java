package Streams;

import java.util.Arrays;

public class ArraysStream {

	public static void main (String[] args) {

		String[] names = {"Ujjwal", "Kumar", "Sagar", "Utkarsh"};

		Arrays.stream(names).filter(x->!x.startsWith("U")).forEach(System.out::println);

		int[] a= {1,4,68,22,21,43,2};

		Arrays.stream(a).filter(x->x>5).sorted().forEach(System.out::println);

	}
}
