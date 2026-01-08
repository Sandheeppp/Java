package courseUd;

public class nestedLoops {

	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5;j++) {
				System.out.format("%02d ",n);
				n+=1;
			}
			System.out.println();
		}
	}

}
