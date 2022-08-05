package StringManipulation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	// Using lambda
	public static <T> Set<T> removeDuplicateLambda(List<T> list) {
		Set<T> set = new HashSet<>();
		return list.stream().filter(e->set.add(e)).collect(Collectors.toSet());
	}
	
	public static void removeDuplicatesStack(List<Integer> list) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(list.get(0));
		
		for(int i=1; i<list.size(); i++) {
			if(list.get(i-1) != list.get(i)) {
				stack.push(list.get(i));
			}
		}
		
		for(Integer e : stack) {
			System.out.print(e + " ");
		}
		System.out.println();
		
	}
	
	public static Set<Integer> removeDuplicatesOldWay(int[] a) {
		
		Set<Integer> set1 = new HashSet<>();
		for(int b : a) {
			set1.add(b);
		}
		return set1;
		
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,3,3,4,5,3,6,6,6,6,7);
		List<Integer> list1 = Arrays.asList(1,2,3,3,3,4,5,3,6,6,6,6,7,6);
		
		System.out.println(removeDuplicateLambda(list));
		removeDuplicatesStack(list1);
		
		int a[] = {1,2,3,1,2,4};
		System.out.println(removeDuplicatesOldWay(a));
		
	}

}
