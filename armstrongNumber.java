package courseUd;

import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {
		// if the cubes of the digits of the number are added and if we get the same number then it is an Armstrong number
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
			int r = n%10;
			sum =sum+(r*r*r);
			n = n/10;
		}
		System.out.println(sum);
		if(sum==n) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("not an Armstrong number");
		}
	}

}
