package courseUd;
abstract class Super{
	Super(){
		System.out.println("Super class Constructor");
	}
	public void method1() {
		System.out.println("HII from Method 1");
	}
	abstract void method2();
}
class sub extends Super{
	@Override
	void method2() {
		System.out.println("HII from method 2");
	}
}
public class abstractClass {

	public static void main(String[] args) {
		sub s1 = new sub();
		s1.method2();
	}

}
