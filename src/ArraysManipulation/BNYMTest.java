package ArraysManipulation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BNYMTest {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Ujjwal|1|12345", "Sagar|2|23456", "Ujjwal|1|5678");
		
		List<String> filteredList = list.stream().filter(e->e.startsWith("Ujjwal")).collect(Collectors.toList());
		
		System.out.println(filteredList);

	}

}
