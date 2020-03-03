
public class HelloWorldJava {
	
	private static String name;

	public static String getName() {
		return name;
	}
	
	public static void setName(String _name) {
		name = _name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, world! - Java");
		setName("Perker");
		System.out.println(getName());
	}

}
