public class Array {

	public static void main(String[] args) {
		
		//single-dimensional array
		int a[]= {101,102,102};
		for(int i=0;i<3;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}

		//multidimensional array
		int b[][]={{2,2,3},{8,4,5},{9,4,5}};
		//Print the array elements
		for(int i=0;i<3;i++){
			System.out.println("\nElements of array b: ");
		for(int j=0;j<3;j++){
		System.out.print(b[i][j]+" ");
		

	}
		System.out.println();
		
}
	}
}