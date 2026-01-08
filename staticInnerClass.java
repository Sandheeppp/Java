package courseUd;

class StaticOuter{
	static int x=10, y=13928;
	int z = 324;
	
	static class StaticInner{
		void display() {
			System.out.println("Hii from static inner class!!");
			System.out.println(x+y);
			System.out.println("cannot access the non static members.");
		}
	}
	
}
public class staticInnerClass {

	public static void main(String[] args) {
		StaticOuter.StaticInner i = new StaticOuter.StaticInner();
		i.display();
	}

}
