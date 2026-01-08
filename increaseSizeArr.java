package courseUd;

import java.util.Arrays;

public class increaseSizeArr {

	public static void main(String[] args) {
		//increasing an size of an array
		//once declared cannot alter the size of the array, so create an another array by copying the element and make the ref of old array to point to the new array
		int A[] = {5,9,5,8,7,31,1,6,54,122};
		int B[] = new int[A.length + 5];
		for(int i=0;i<A.length;i++) {
			B[i]=A[i];
		}
		A=B;
		System.out.println("New Size : "+A.length);
		
		
		//or
		
		System.arraycopy(A, 0, B, 0, A.length);
		A=B;
		
		
		//or
		
		A = Arrays.copyOf(A, A.length+5);
	}

}
