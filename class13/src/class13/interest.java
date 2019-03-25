package class13;

public class interest {
	
	
	public static double calculateInterest(double amount , double interestRate) {
		return (amount*(interestRate/100));
	}

	public static void main(String[] args) {
		for(int i= 2 ; i< 9; i++) {
		
		System.out.println("total amount is  "+ String.format("%.2f", calculateInterest(10000, i)));
		}

	}

}
