package courseUd;

public class recursiveMethods {
	
	static void functions(int n) {
		 if(n>0) {
			 System.out.println(n);
			 functions(n-1);
			 System.out.println(n);
		 }
	}
	
	
	public static void main(String[] args) {
		functions(3);
	}

}
