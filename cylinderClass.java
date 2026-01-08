package courseUd;

class Cylinder{
	private int radius;
	private int height;
	
	public int getRadius() {
		return radius;
	}
	public int getBreadth() {
		return height;
	}
	void setRadius(int l) {
		if(l>=1)
			radius = l;
		else
			radius = 0;
	}
	void setHeight(int b) {
		if(b>=1)
			height = b;
		else
			height = 0;
	}
	Cylinder(){
		radius = 1;
		height = 1;
	}
	Cylinder(int r, int h){
		setHeight(h);
		setRadius(r);
	}
	Cylinder(int r){
		setRadius(r);
		height=1;
	}
}


public class cylinderClass {

	public static void main(String[] args) {

	}

}
