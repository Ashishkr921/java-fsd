
class C1{
	public int x = 10;
	protected int y = 51;
	int z = 18;
	private int a = 91;
	public void output1(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}
			
}
public class accessmodifier {

	public static void main(String[] args) {
		C1 c = new C1();
		c.output1();
		
	}

}
