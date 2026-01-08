package courseUd;

import java.util.Scanner;

public class switchCaseWebsite {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String domain = sc.nextLine();
		
		String ext = domain.substring(domain.lastIndexOf(".")+1);
		switch(ext){
			case "com" : 
				System.out.println("Commercial");
				break;
			case "org":
				System.out.println("Organization");
				break;
			case "net":
				System.out.println("Network");
				break;
			default:
				System.out.println("invalid");
		}
	}
}
