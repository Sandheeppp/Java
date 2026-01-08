package courseUd;
abstract class abs{
	abstract void hello();
	abstract void display();
}

class AnonymousOuter{
	public void ask() {
		abs a = new abs() {
			@Override
			void display() {
				System.out.println("Hot Chocolate??");
			}

			@Override
			void hello() {
				System.out.print("Helloo...");	
			}
			
		};
		a.hello();
		a.display();
	}
}
public class anonymousInner {
    public static void main(String[] args) {
    	AnonymousOuter o = new AnonymousOuter();
        o.ask();
    }
}
