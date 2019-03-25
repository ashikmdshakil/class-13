package class13;
import java.util.Scanner;
public class whilePractise {
	
	
	public static boolean isEvenNumber(int number) {
		if(number% 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		/*int count = 5 ;
		while(count != 0) {
			System.out.println("count value is "+ count);
			count--;
		}
		
		 /*for(int i = 5 ; i != 0 ; i--) {
			System.out.println("count value is "+ i);
		}
		*/
		
		int digit = 5;
		int finishNumber = 20;
	    int count = 0;
		while(digit <= finishNumber) {
			if(isEvenNumber(digit) ) {
				digit++;
				continue ;
			}
			else {
				
				digit++;
				count++;
				System.out.println(digit);
				if(count == 5) {
					break;
				}
				
			}
				
		
		
			
		}
		
		System.out.println("total number is "+count);

	}

}

