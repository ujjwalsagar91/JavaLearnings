package ArraysManipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrays {

	public static void main(String[] args) {

		int a[] = {1,82,96,7,102,36,5};
		
//		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a, 1, 4);
		System.out.println(Arrays.toString(a));
		
		
		List<Integer> list = Arrays.asList(1,82,96,7,102,36,5);
//		Collections.sort(list);
//		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		List abc = list.stream().sorted(Collections.reverseOrder()).limit(1).collect(Collectors.toList());
		System.out.println(abc);
		
	}

}
