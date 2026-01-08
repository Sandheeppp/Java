package courseUd;

import java.util.Scanner;

public class insertingInAnArr {
	public static void main(String[] args) {
		int A[] = new int[10];
		A[0] = 5;
		A[1] = 9;
		A[2] = 6;
		A[3] = 10;
		A[4] = 12;
		A[5] = 7;		
		
		int n=6;      // length=10, n=6, element, atIndex
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the position and the element : ");
		int pos = sc.nextInt();
		int element = sc.nextInt();
		
		if(n==A.length) {            // if n is equal to the length of the array 
			System.out.println("The arr is full.");
		}
		else if(pos<0 || pos>n){     // if position of new element is less than 0 and greater than the n
			// for eg: n is 6 but the position ive to enter is 9, i cannot.
			System.out.println("Invalid Position");
		}
		else {
			for(int i=n; i>pos; i--) {
				A[i]=A[i-1];
			}
			A[pos] = element;
			n++;
			
			for(int i=0; i<n;i++) {
				System.out.print(A[i]+" ");
			}
		}
	}
}
