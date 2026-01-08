package courseUd;

public class whileLoopPractice{
	public static void main(String args[]) {
		int i=1,j=1,n=100;
		System.out.println("While loop");
		while(i<n) {
			System.out.println(i);
			i=i*2;
		}
		
		System.out.println("Do While");
		do {
			System.out.println(j);
			j=j*2;
		}while(j<n);
	}	
}