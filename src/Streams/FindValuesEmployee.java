package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindValuesEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Ujjwal", 25, 12345);
		Employee e2 = new Employee(2, "Sagar", 26, 23456);
		Employee e3 = new Employee(3, "Mamta", 23, 34567);
		Employee e4 = new Employee(4, "Kumari", 27, 45678);


		List<Employee> list = Arrays.asList(e1, e2, e3, e4);
		List<Employee> finalList = list.stream().map(e->{
			if(e.getAge()>=25) {
				e.setSalary(e.getSalary()*1.10);
			}
			return e;
		}).collect(Collectors.toList());
		
		System.out.println(finalList);

	}

}
