package courseUd;

public class maskingAndMerging {
	public static void main(String[] args) {
		byte a=9, b=12;
		byte c; //c will have and and b in it.
		c = (byte)(a<<4);// '<<' have least precedence so, only a is typecasted for both use ()
		c = (byte)(c|b); //for storing in the right hand side use OR operation
		System.out.println((c&0b11110000)>>4); //to see the 1st half ANDing with all one one left
											//then right shift to the actual num.
		System.out.println(c&0b00001111);
		System.out.println(c);
		
		//ORing and Shifting ----> store
		//ANDing and Shifting ---> retrieve
		
//		byte c;
//		c = (byte)(9<<4);
//		c = (byte)(c|12);
//		System.out.println((c&0b11110000)>>4);
//		System.out.println(c&0b00001111);
//		System.out.println(c);
	}
}
