
public class InnerClass1 {
		private String msg="Hey Ashish"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", How are you");}
		  }   
		  

		public static void main(String[] args) {

			InnerClass1 obj=new InnerClass1();
			InnerClass1.Inner in=obj.new Inner();  
			in.hello();  
		}
}

