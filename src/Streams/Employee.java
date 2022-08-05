package Streams;

public class Employee {
	
	private int empID;
	private int age;
	private String name;
	private double salary;
	
	public Employee(int empID, String name, int age, double salary) {
		this.empID=empID;
		this.age = age;
		this.name=name;
		this.salary=salary;
	}
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee Salary - " + salary;
		
	}

}
