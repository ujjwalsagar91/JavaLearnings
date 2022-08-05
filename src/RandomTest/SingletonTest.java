package RandomTest;

public class SingletonTest implements Cloneable {
	
	private static SingletonTest instance = null;
	
	private SingletonTest() {
		
	}
	
	public static SingletonTest getInstance() {
		if(instance==null) {
			instance = new SingletonTest();
		}
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
