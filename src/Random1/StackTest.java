package Random1;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {

		
		
		Stack<Integer> stk = new Stack<>();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		
		System.out.println(stk);
		
		try {
			throw new NullPointerException("Testing null pointer exception");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		stk.pop();
		
		System.out.println(stk);

	}

}
