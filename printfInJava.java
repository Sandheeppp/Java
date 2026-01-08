package courseUd;

public class printfInJava {
	public static void main(String[] args) {
		int i=10; float f=12.34f; char c = 'S';
		System.out.printf("Hello all!!! %d %f %c",i,f,c);
		
		// format specifier : char c
		// int d,o,x      (decimal, octal, hexa)
		// float f,e,g    (float, exponential, )
		// String s       ()
		
		float fd=123.3f;
		System.out.println("");
		System.out.printf("%08.2f",fd);
	}
}
