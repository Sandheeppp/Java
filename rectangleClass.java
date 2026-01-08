package courseUd;

class Rectangle{
	public int length;
	public int breadth;
	
	public int area() {
		return length*breadth;
	}
	public boolean isSquare() {
		if(length==breadth) {return true;}
		else {return false;}
		}
}

public class rectangleClass {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.length = 10;
		r1.breadth = 8;
		System.out.println(r1.area());
		System.out.println(r1.isSquare());

	}

}
