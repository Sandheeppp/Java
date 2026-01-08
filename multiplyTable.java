package courseUd;

import java.util.Scanner;

public class multiplyTable{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i*n);
		}
		
		int num = sc.nextInt();
		int sum=0;
		for(int j=1;j<=num;j++) {
			sum = sum + j;
			System.out.println(sum);
		}
	}
}