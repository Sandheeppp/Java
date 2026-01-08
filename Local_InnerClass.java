package courseUd;
class Outer{
	void method() {
		
		class LocalInner{
			void show() {
				System.out.println("Local Inner.");
		}
	}
		LocalInner i = new LocalInner();
		i.show();
}

}
public class Local_InnerClass {
	public static void main(String[] args) {
	Outer o = new Outer();
	o.method();
	}
}