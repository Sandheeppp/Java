package courseUd;

public class stringObjects {
	public static void main(String[] args) {
		
		String str1 = "HP victus";
		
		String str2 = new String("Java Program");
		
		char c[] = {'S','A','N','D','H','E','E','P'};
		String str3 = new String(c);
		//String str3 = new String(c,3,5) start from 3rd index and 5 letters
		
		byte b[] = {65,66,67,68};
		// String str4 = new String(b);
		String str4 = new String(b,2,2); //start from 2nd index and 2 letters
		
		System.out.println(str3);
		System.out.println(str1.charAt(1));		
		System.out.println(str4);
	}
}
