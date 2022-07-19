
public class Typecasting {
	public static void main(String args[])
	{
		// Implicit type casting
		
	    byte i = 20;
	    
	    short j = i;
	    int k = j;
	    long l = k;
	    float u = l;
	    double v = u;
	    
	    System.out.println("byte value : "+i);
	    System.out.println("short value : "+j);
	    System.out.println("int value : "+k);
	    System.out.println("long value : "+l);
	    System.out.println("float value : "+u);
	    System.out.println("double value : "+v);

            // Explicit type casting
	    
            double d = 95.0;
		 
		float m = (float) d;
		long n = (long) m;
		int o  = (int) n;
		short p = (short) o;
		byte q = (byte) p;
		
		System.out.println("double value : "+d);
		System.out.println("float value : "+m);
		System.out.println("long value : "+n);
		System.out.println("int value : "+o);
		System.out.println("short value : "+p);
		System.out.println("byte value : "+q);
	}

}
