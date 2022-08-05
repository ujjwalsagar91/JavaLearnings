package Random1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionTest {

	String s1= "abc";
	
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		System.out.println(a + ' ' + b);
		
		String s1 = "ujjwal";
		
		List<String> list = new ArrayList<>(Arrays.asList(s1.split("")));
		
		list.forEach(System.out::println);
		
		list.forEach(e->System.out.println(e));
		
		String s2=s1;
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		s1=s1+"d";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		StringBuffer sb1 = new StringBuffer("xyz");
		StringBuffer sb2 = sb1;
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		sb1.append("a");
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		
		
	}

}
