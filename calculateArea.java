package courseUd;

import java.util.Scanner;

public class calculateArea {
	public static void main(String[] args) {
		float base, height, area;
		System.out.println("Enter the base and height : ");
		Scanner sc = new Scanner(System.in);
		base = sc.nextFloat();
		height = sc.nextFloat();
		area = (float) (0.5*base*height);  // or (0.5*base*height) make any number to a float
		System.out.println("Area of the triangle : "+area);
	}
}
