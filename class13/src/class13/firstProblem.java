package class13;
import java.util.Scanner;
public class firstProblem {

	
	public static void main(String[] args) {
		int value = 2;
		/* if(value == 2) {
			System.out.println("The value is 2");
		}
		else if(value == 3) {
			System.out.println("The value is 3");
		}
		else {
			System.out.println("value not found");
		}
		*/
	   
	
	    Scanner rd = new Scanner(System.in);
	    String name = rd.nextLine();
		switch (name) {
		case "ashik" : System.out.println(" "+name);
			
			break;
			
		case "shakil" : System.out.println(" "+ name);
		
		break;	
		
		case "Pranto" : System.out.println(""+name);

		break;
		
		case "kaium" : System.out.println(" "+ name);

		break;	

		default: System.out.println("name not found");
			break;
		}
		
		
	}

}
