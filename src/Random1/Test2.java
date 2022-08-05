package Random1;

public class Test2 extends Test {

	public static void main(String[] args) {

		Test2 obj1 = new Test2();
		obj1.process();
		
		One obj2 = new Test2();
		obj2.process();
		
		One obj3 = new One();
		obj3.process();
		
	}

	@Override
	public void process() {

		System.out.println("From Test2");
		
	}

}
