package courseUd;

public class gcdAndHcf {
	static int gcd(int m, int n) {
		while(m!=n) {
			if(m>n) {m=m-n;}
			else {n=n-m;}
		}		
		return n;
	}
	
	public static void main(String[] args) {
//		gcdAndHcf x = new gcdAndHcf();     if the method is not static 
		System.out.println("GCD of 25 and 15 are : "+gcd(25,15));
	}

}
