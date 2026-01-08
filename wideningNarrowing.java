package courseUd;

public class wideningNarrowing {
	public static void main(String[] args) {
		byte b=5;
		short s=200;
		int i = 10;
		long l =10;
		double d = 10;
		float f = 10.5f;
		char c = 10;
		boolean bl = true;
		
		b = (byte)s; //narrowing(), may result in loss of data
		i =(int)f;
		
		System.out.println(b);
		System.out.println(i);
//		s=b;
//		i=b;
//		l=b;
//		f=b;
//		l=b;
//		c=b; // only int and char, others not compatible
	}
}
