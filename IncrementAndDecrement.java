package courseUd;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int x=7,y;
		x++;
		
		System.out.println(x);
		++x;
		System.out.println(x); //same o/p
		
		y=x++;
		System.out.println(x+" "+y);
		
		
		int a=5,b=4,c;
		c = 2 * a++ + 3 * ++a;
		System.out.println(c);
		
	}

}
