
public class Method {
	//Method created:
	public int Multiply (int a,int b) {
		int z = a*b;
		// return value
		return z;
		
	}
	public static void main(String[] args) {
		// create an object of method
		Method method = new Method();
		// calling method
		int ans = method.Multiply(16, 5);
		System.out.println("Mutliply " +ans);
	}


}
