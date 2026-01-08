package courseUd;

public class variableArguments {

	static void infiniteArg(int ...c) {
		for(int x:c) {
			System.out.print(x+" ");
		}
		System.out.println();
			
	} 
	
	static void strngg(String ...S) {
		for(int i=0; i<S.length;i++) {
			System.out.print(S[i]+" ");
		}
		}
	
	public static void main(String[] args) {
		infiniteArg();
		infiniteArg(34);
		infiniteArg(34,46,57,4);
		infiniteArg(new int[] {2,4,54,6,5,68,77,9,34,7} );
		
		strngg("sandheep","hi","diuew");
	}

}
