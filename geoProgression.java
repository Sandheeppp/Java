package courseUd;

import java.util.Scanner;

public class geoProgression {

	public static void main(String[] args) {
		System.out.println("Enter 1st number: ");
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		System.out.println("Enter the ratio :");
		int ratio = sc.nextInt();
		//int ratio = secondNum/firstNum;
		System.out.println("Number of iterations : ");
		int n = sc.nextInt();
		System.out.print(firstNum+",");
		for(int i=1;i<=n;i++) {
			firstNum*=ratio;
			System.out.print(firstNum+",");
		}
	}

}
