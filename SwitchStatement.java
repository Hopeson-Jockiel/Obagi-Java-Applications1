import java.util.Scanner;

public class SwitchStatement{
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter *131# to load Data");
		System.out.println("Enter *310# to check Balance");
		System.out.println("Enter *303# to Borrow data");
	
		int option = input.nextInt();
	
		Switch (option) {
			case "*131#":
			break;
			{
				System.out.println("Enter 1 for 1 Month Plan");
				System.out.println("Enter 2 for 2 Month Plan");
				System.out.println("Enter 3 for 3 Month Plan");
				System.out.println("Enter 4 for 4 Month Plan");
			}
			
			case "*310#":
			break;
			{
			}
			case "*303#":
	
		}
	}
}