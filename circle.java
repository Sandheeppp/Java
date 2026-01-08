package courseUd;

class Circle1{
	public double radius;
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public double circumference() {
		return perimeter();
	}
}


public class circle {

	public static void main(String[] args) {
		
		Circle1 c1 = new Circle1();
		c1.radius = 10;
		System.out.println("Area : "+String.format("%.4f",c1.area()));
		System.out.println("Perimeter : "+c1.circumference());
		
	}

}
