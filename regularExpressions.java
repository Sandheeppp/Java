package courseUd;

public class regularExpressions {
	public static void main(String[] args) {
		
		String str1 = "7";
		System.out.println(str1.matches(".")); // '.' if any one char is present
		System.out.println(str1.matches("[fck]")); //str1 = f and f is in expressions
		System.out.println(str1.matches("[0-9]")); // 0 to 9
		System.out.println(str1.matches("[a-z][0-9]")); //string should match both a to z and 0 to 9
	
		System.out.println(str1.matches("\\w")); //alphabets or digits
	}
}
