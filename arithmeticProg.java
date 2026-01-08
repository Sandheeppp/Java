package courseUd;

import java.util.Scanner;

public class arithmeticProg {
	public static void main(String[] args) {
		
		System.out.println("Enter the 1st and 2nd number : ");
		Scanner sc = new Scanner(System.in);
		
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		int diff = secondNum - firstNum;
		
		System.out.println("Number of iterations : ");
		int n = sc.nextInt();
		
		System.out.print(firstNum+","+secondNum+",");
		
		for(int i=1; i<=n; i++) {
			System.out.print(secondNum+",");
			secondNum+=diff;
		}
	}
}
