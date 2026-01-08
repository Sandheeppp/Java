package courseUd;

public class copyingAnArray {

	public static void main(String[] args) {
		int A[] = {5,9,5,8,7,31,1,6,54,122};
		int B[]= new int[A.length];
		
		// copying an arr
		for(int i=0; i<A.length; i++) {
			B[i]=A[i];
		}
		System.out.println("Arr B :");
		for(int x:B) {
			System.out.print(x+" ");
		}
		
		
		//reverse copying an array
		for(int i=A.length-1,j=0; i>=0; i--,j++) {
			B[j] = A[i];
		}
		for(int x:B) {
			System.out.print(x+" ");
		}
	}

}
