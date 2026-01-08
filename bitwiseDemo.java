package courseUd;

public class bitwiseDemo {

	public static void main(String[] args) {
		int x=0b1010,y=0b0110,a=0b1000,b=-0b1000,and,xor,leftShift,rightShift; //10, 6
		
		and = x&y;
		System.out.println("AND : "+and);
		
		xor = x^y;
		System.out.println("XOR : "+xor);
		
		leftShift = a<<1; //multiplies by 2 for one time, if a<<2 o/p 32
		System.out.println("LEFT SHIFT : "+leftShift);
		
		rightShift = a>>1;
		System.out.println("RIGHT SHIFT : "+rightShift); // divides by 2 for one time
		
		int rightShift2 = b>>1;
		System.out.println("RIGHT SHIFT NEGATIVE NUM : "+rightShift2);
		
		//binary form of x and y
		System.out.println(String.format("BINARY FORM OF X : %32s ",Integer.toBinaryString(x)));
		System.out.println(String.format("BINARY FORM OF B : %s",Integer.toBinaryString(b))); //integer is a 32 bit - negative 
		
		int not=~x;
		System.out.println(x+"<--X    NOT OF X--> "+not);
		
	}

}
