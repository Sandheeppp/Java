package courseUd;

public class stringMatchingWithRegularExp {
	public static void main(String[] args) {
		String str = "Sandheep";
		String str2 = "abc";
		String str3 = "sandheep@gmail.com";
		System.out.println(str.matches(".*")); //any char, any number of times
		System.out.println(str.matches("[a-z]*")); // false because of capital S
		System.out.println(str.matches("[A-Z][a-z]*")); //exactly one uppercase and zero or more lowercase
		System.out.println(str2.matches("[a-z]{3}")); // a to z only 3 time
		System.out.println(str2.matches("[a-d]{3,10}")); // 3 to 10 times
 
		System.out.println(str3.matches(".*gmail.*")); // Check if str3 contains the substring "gmail" anywhere in it
		System.out.println(str3.matches("\\w*@gmail(.*)")); // Check if str3 has only number and chars before "@gmail",
		// followed by any characters (like .com, .org, etc.)

		
		
		String str1 = "programmer@gmail.com";
		System.out.println(str1.matches(".*@gmail.com"));
		
		int i = str1.indexOf("@");
		String userName = str1.substring(0,i);
		String domainName = str1.substring(i+1,str1.length());
		System.out.println("User Name : "+userName);
		System.out.println("Domain Name : "+domainName);
		
		System.out.println(domainName.startsWith("gmail"));

		int j = domainName.indexOf(".");
		String name = domainName.substring(0,j);
		System.out.println(name.equals("yahoo"));
	}

}
