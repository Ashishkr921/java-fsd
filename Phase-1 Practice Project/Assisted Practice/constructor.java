class ConstructorDemo {
	// parameter is included
	ConstructorDemo() {
		System.out.println("non-parameterized constructor");
	}
	// parameter is not included
	ConstructorDemo(String s) {
		System.out.println("parameterised constructor");
	}
}
public class constructor {
	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo("Java");
	}
}