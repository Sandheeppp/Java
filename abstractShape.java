package courseUd;

abstract class Shape{
	abstract public int perimeter();
	abstract public int area();
}

class Rectangle extends Shape{
	int length, breadth;
	
	public int perimeter() {
		return 2*(length+breadth);
	}
	public int area() {
		return length*breadth;
	}
}
class Circle extends Shape{
	int radius;
	@Override
	public int perimeter() {
		return (int) (2*Math.PI*radius);		
	}

	@Override
	public int area() {
		return (int) ((int) 2*Math.PI*radius*radius);
		
	}
	
}

public class abstractShape {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.length = 10;
		r.breadth = 5;
		System.out.println("Perimeter of rectangle : "+r.perimeter());
		
		Circle c = new Circle();
		c.radius = 9;
		System.out.println("Area of Circle : "+c.area());
	}
}
