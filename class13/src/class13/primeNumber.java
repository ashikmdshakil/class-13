package class13;

public class primeNumber {
	
	public static boolean isPrime(int n) {
		if(n== 1) {
			return false;
		}
		/*for(int i= 2 ; i<= n/2 ; i++) {
			System.out.println("Loop is iterating "+i+"times");
			if(n%i == 0) {
				return false;
			}
		}
		*/
		
		for(int i= 2 ; i<= Math.sqrt(n) ; i++) {
			System.out.println("Loop is iterating "+i+"times");
			if(n%i == 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		int count = 0;
		for(int i = 10; i<50; i++) {
			if(isPrime(i)) {
				count++;
				System.out.println("(Non Optimised)"+"The number"+i+"is a prime number");
				if(count == 10) {
					System.out.println("Exiting for loop");
					break;
				}
			}
		}
		

	}

}
