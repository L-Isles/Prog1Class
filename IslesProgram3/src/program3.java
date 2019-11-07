// Program 3 assignment using loops

import java.util.*;
public class program3 {

	
	public static void main(String[] args) throws InterruptedException {
		
	      // Initialize keyboard and declare variables
        Scanner kb = new Scanner(System.in);
        String userName;
        int userNum = 0;

        // Ask user for their name
        System.out.print("What is your name? ");
        userName = kb.next();

        // Ask user for a number
        System.out.print(userName + " pick a number between 0 and 100: ");
        userNum = kb.nextInt();

        // Display message if user selected number is not between 0 and 100
        while (userNum < 0 || userNum > 100) {
            System.out.println(userName + " please enter a valid number!");
            userNum = kb.nextInt();

        }
        // Display message if user number is valid
        if (!(userNum <= 0 || userNum >= 100)) {
            System.out.println("Thank you for your input, " + userName);

            // Count down from user selected number
            for (int i = 0; i < userNum; userNum--) {
                System.out.println("Stand by while we count down. This might take a while! " + userNum);
                Thread.sleep(1000);
            }
            // Close keyboard
            kb.close();
        }
    }


	}


