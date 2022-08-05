package RandomTest;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

public class RemoveDuplicatesStack {
	
	public static void removeImmediateDuplicates(String name) {
		
		Stack<Character> stack = new Stack<>();
		stack.push(name.charAt(0));
		
		for(int i=1; i<name.length(); i++) {
			if(name.charAt(i-1) != name.charAt(i)) {
				stack.push(name.charAt(i));
			}
		}
		
		for(Character c : stack) {
			System.out.print(c);
		}
	}
	
	
	public static void removeDupUsingSet(String str) {
		char[] ch = str.toCharArray();
		Set<String> s = new LinkedHashSet<>();
		for(char c1 : ch) {
			s.add(String.valueOf(c1));
		}
		
		String op = String.join("", s);
		System.out.println(s);
	} 
	
	public static void main(String args[]) {

		removeImmediateDuplicates("Weelccoommee HHoomee");
		removeDupUsingSet("Weelccoommee HHoomee");
	}
	
}
