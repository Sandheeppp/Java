package courseUd;

public class pattern3 {

	public static void main(String[] args) {
//upper triangle
		for(int i=1; i<=5; i++) {
			//1st half of upper triangle
			for(int j=1; j<=5; j++) {
				if(i+j>5) {
				System.out.print("* ");}
				else {
					System.out.print("  ");
				}
			}
			//second half of upper triangle 
			for(int k=1;k<=5;k++) {
				if(k<=i-1)
					System.out.print("* ");
			}
			System.out.println();
		}
//lower triangle
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
                if (i + j > 5) {
                    System.out.print("* ");   
                } else {
                    System.out.print("  ");
                }
            }

            for (int k = 1; k <= 5; k++) {
                if (k <= i - 1)
                    System.out.print("* ");
            }

            System.out.println();
        }
	}

}
