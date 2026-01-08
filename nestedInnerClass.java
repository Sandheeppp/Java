package courseUd;

class OuterClass{
	int x=10;

	class InnerClass{
		int y=3204;
		
		void arithOperations() {
			System.out.println(x+"<--x  y-->"+y);
			System.out.println("Additon : "+x+y);
			System.out.println("Subtraction : "+x+y);
			System.out.println();
		}
	}
	
	void outerMethod() {
		InnerClass inner = new InnerClass();
		inner.arithOperations();
		System.out.println(inner.y);
		System.out.println();
	}
}


public class nestedInnerClass {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		System.out.println("Calling thru outer class Obj.");
		outerClass.outerMethod();
		
		OuterClass.InnerClass i = new OuterClass().new InnerClass();
		System.out.println("Calling thru inner class Obj.");
		i.arithOperations();
	}

}
