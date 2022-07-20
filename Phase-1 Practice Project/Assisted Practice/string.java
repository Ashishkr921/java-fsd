public class string {
	public static void main(String[] args) {
		
		// String to StringBuilder
		String strs[] = {"AAA", "BBB", "CCC" };
	      StringBuilder sb = new StringBuilder();
	      sb.append(strs[0]);
	      sb.append(" "+strs[1]);
	      sb.append(" "+strs[2]);
	      System.out.println(sb.toString());
	      
	      // String to StringBuffer
	      String str = "java";
	      StringBuffer sbf = new StringBuffer(str);
	      System.out.println("StringBuffer contents: " + sbf);
	}
}