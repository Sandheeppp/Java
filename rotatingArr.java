package courseUd;

public class rotatingArr {

	public static void main(String[] args) {
		// rotating an array
        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int first = A[0];
        for(int i=0; i<A.length-1; i++) {
        	A[i] = A[i+1];
        }
        A[A.length - 1] = first;
        
        for(int x:A) {
        	System.out.print(x+" ");
        }
	}

}
