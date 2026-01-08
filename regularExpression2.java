package courseUd;

public class regularExpression2 {

	public static void main(String[] args) {
		 int b = 1011101;
		 String num = b+"";
		 System.out.println(num);
		 System.out.println(num.matches("[01]*"));

		 String hex = "234AB";
		 System.out.println(hex.matches("[0-9 A-F]+"));
		 
		 String date = "01/12/2020";
		 System.out.println(date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
	}
}
