package ReverseString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseAStringUsingList {

	public static void main(String arg[]) {

		String input = "123456789";
		char[] ch = input.toCharArray();
		List<Character> list = new ArrayList<>();

		for(char c : ch) {
			list.add(c);
		}
		Collections.reverse(list);

		ListIterator itr = list.listIterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
		
		System.out.println();
		
		Iterator<Character> itr1 = list.iterator();
		while(itr1.hasNext()) {
			System.out.print(itr1.next());
		}
		
	}
}
