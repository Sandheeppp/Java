package courseUd;

public class maxElementsUsingVarArg {

	static void max(int ...Num) {
		if(Num.length==0)return;
		
		int m = Num[0];
		
		for(int i=0; i<Num.length; i++) {
			if (Num[i] > m) {
                m = Num[i]; // Update max if the current element is greater
            }
        }
		System.out.print("MAximum element is : "+m);
	}
		
	public static void main(String[] args) {
		max(34,65,768,6879,5,57,3,436);

	}

}
