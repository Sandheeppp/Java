package courseUd;

public class primeNumber {
	static boolean isPrime(int number) {
		if(number<=1) {
			return false;
		}
		
		for(int i=2; i*i<=number; i++) {   // for(int i=2; i<num/2; i++)
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int num=17, num2=8;
		System.out.println(isPrime(num));
		System.out.println(isPrime(num2));

	}

}
