package courseUd;

import java.util.Scanner;

public class deleteEleInAnArray {

	public static void main(String[] args) {
		int A[] = {5,9,5,8,7,31,1,6,54,122};
		int n =10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position u wanna delete :");
		int pos = sc.nextInt();
		if(pos<0 || pos>=n) {
			System.out.println("Invalid Pos.");
			return;
		}
		
		for(int i=pos; i<n-1; i++) {
			A[i] = A[i+1];
		}
		n--;
		
        for (int i = 0; i < n; i++) {
			System.out.print(A[i]+" ");
		}
	}

}
