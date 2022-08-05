package RandomTest;

public class BreakSingleton {

	public static void main(String[] args) throws CloneNotSupportedException {

		SingletonTest s1 = SingletonTest.getInstance();
		SingletonTest s2 = SingletonTest.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		SingletonTest s3 = (SingletonTest) s1.clone();
		System.out.println(s3);
	}

}
