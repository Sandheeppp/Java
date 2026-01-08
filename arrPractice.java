package courseUd;

import java.util.Scanner;

public class arrPractice {
    public static void main(String[] args) {

        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};

        // sum of all elements
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        System.out.println("Sum = " + sum);

        // searching for an element
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you wanna search : ");
        int n = sc.nextInt();

        boolean found = false;
        for (int x = 0; x < A.length; x++) {
            if (n == A[x]) {
                System.out.println("Found at index " + x);
                found = true;
                break;    // Found → stop searching
            }
        }
        if (!found) {
            System.out.println("Not found");
        }

        // maximum element
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("Largest number : " + max);

        // second largest number (fixed logic)
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            } 
            else if (A[i] > max2 && A[i] != max1) {
                max2 = A[i];
            }
        }

        System.out.println("Second largest number : " + max2);
    }
}
