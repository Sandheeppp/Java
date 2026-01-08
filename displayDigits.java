package courseUd;

import java.util.Scanner;

public class displayDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i=0;
		while(number>0) {
			i=i+1;
			int r = number%10;
			number = number/10;
			System.out.println(r);
		}
		System.out.println("Number of digits : "+ i);
	}

}
