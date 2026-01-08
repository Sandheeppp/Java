package courseUd;
class Parent1{
	public Parent1() {
		System.out.println("Non Parameterized Const -- Parent");
	}
	public Parent1(int x) {
		System.out.println("Parameterized Const -- Parent "+x);
	}
}
class Child1 extends Parent1{
	public Child1() {
		System.out.println("Non Parameterized Const -- Child");
	}
	public Child1(int x, int y) {
		super(x);
		System.out.println("Parameterized Const -- Child "+y);
	}
}


public class parameterizedConstructor {

	public static void main(String[] args) {
		Child1 c = new Child1();
		Child1 c1 = new Child1(10,12);
	}

}
