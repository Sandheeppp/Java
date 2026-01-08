package courseUd;

class rectanglee{
	private int length;
	private int breadth;
	
	public int getLength() {
		return length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setLength(int l) {
		if(l>0) {length = l;}
		else {length =0;}
	}
	public void setBreadth(int b) {
        if(b>=0)
            breadth=b;
        else 
            breadth=0;
	}
	public int area() {
		return length*breadth;
	}
    public int perimeter()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else 
            return false;
    }
}

public class Shapes {

	public static void main(String[] args) {
		rectanglee r = new rectanglee();
		r.setLength(10);
		r.setBreadth(9);
		System.out.println(r.area());
		System.out.println(r.getBreadth());
		System.out.println(r.isSquare());
		System.out.println(r.perimeter());



		
	}

}
