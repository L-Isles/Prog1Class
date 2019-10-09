import java.util.Scanner;
public class IslesProgram2 {

	public static void main(String[] args) {
		// Enable user input
		Scanner scanner = new Scanner(System.in);
		// Declare user input variables
		int firstNum;
		int secondNum;
		int thirdNum;
		int result;
		
		// Receive user selected 3 numbers
		System.out.println("Enter your first number: ");
		firstNum = scanner.nextInt();
		System.out.println("Enter your second number: ");
		secondNum = scanner.nextInt();
		System.out.println("Enter your third number: ");
		thirdNum = scanner.nextInt();
		// Print Menu choices
		System.out.println("Menu Options: What should we do with these numbers? ");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Exit");
		
		// Declare switch variable and enable user input
		int option = scanner.nextInt();
		// Switch statement
		switch(option){
		
			case 1:
				result = firstNum + secondNum + thirdNum;
		System.out.println("The result of adding these numbers is: " + result);
		break;
		
			case 2:
				result = firstNum - secondNum - thirdNum;
		System.out.println("The result of subtracting these numbers is: " + result);
		break;
		
			case 3:
				result = firstNum * secondNum * thirdNum;
				System.out.println("The result of multiplying these numbers is: " + result);
				break;
				
			case 4:
				result = firstNum / secondNum / thirdNum;
				System.out.println("You probably shouldn't be dividing three numbers: " + result);
				break;
				
			case 5:
				System.exit(option);
			
			default:
				System.out.println("Please make a valid selection!");
				break;
			
				
		
	}
	// Close scanner
		scanner.close();
		
	}

}
