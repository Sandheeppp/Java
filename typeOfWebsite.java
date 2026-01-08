package courseUd;

import java.util.Scanner;

public class typeOfWebsite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the URL : ");
		String url = sc.nextLine();
		
		int i =  url.indexOf(":");
		String s = url.substring(0,i);
		
		if(s.equals("http")) {
			System.out.println("HTTP");
		}else if(s.equals("ftp")) {
			System.out.println("FTP");
		}else {
			System.out.println("Invalid");
		}
		
		String ext  = url.substring(url.lastIndexOf(".")+1);
		if(ext.equals("com")) {
			System.out.println("Commercial");
		}else if(ext.equals("org")) {
			System.out.println("Organization");
		}else if(ext.equals("net")) {
			System.out.println("Network");
		}else {
			System.out.println("invalid");
		}
		
	}

}
