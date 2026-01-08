package courseUd;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		while(n>0) {
//			int r = n%10;
//			n= n/10;
//			System.out.print(r);
//		}
		int original = n;
		int reverse = 0;
		while(n>0) {
			int r = n%10;
			reverse = reverse*10+r;
			n=n/10;
		}
		System.out.println(reverse);
		
		if(reverse==original){
			System.out.println("palindrome");}
		else {
			System.out.println("Not a Palindrome.");
		}
	}

}
