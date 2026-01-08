package courseUd;

public class methodOverloading {
	static int max(int x, int y) {
		return x>y?x:y;
	}
	static float max(float x, float y) {
		return x>y?x:y;
	}
	static int max(int x, int y, int z) {
		return x>y&&x>z?x:(y>x&&y>z?y:z);
	}
	
	
	public static void main(String[] args) {
		System.out.println(max(10,15));
		System.out.println(max(1f,6f));
		System.out.println(max(10,15,5));


	}

}
