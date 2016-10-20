package homework;

import java.util.Scanner;

public class quiz1 {
	static Scanner input = new Scanner(System.in);

	public static String waitForEntry(){
		return input.nextLine();
	}

	//1 point for private visibility
	//1 point of data type declaration throughout
	private static String username = "test_user";
	private static String password = "test";


	//1point for correct method
	public static void main(String[] args){
		//1 point asking username once
		if(correctUser()){
			askPassword();
		}else{
			System.out.println("Unknown username, please contact the network administrator.");
		}
	}


	private static void askPassword() {
		boolean inLoop = true;
		int triesRemaining =3;
		while(inLoop){
			System.out.println("Enter your password.");
			//1 point use waitForEntry() correctly
			
			if(waitForEntry().equals(input)){
				System.out.println("You've logged in!");
				inLoop = false;
			}else{
				//.5 triesRemaining is changing
				triesRemaining--;
				if(triesRemaining == 0){
					//.5 points for printing invalid password.
					System.out.println("Invalid password.");
					//.5 point MAX 3 tries
					inLoop = false;
				}else{
					//.5 point printing the correct number
					System.out.println("You have " + triesRemaining + " attempt(s) left.");					
				}
			}
		}
		
	}


	private static boolean correctUser() {
		System.out.println("Enter a username");
		//1 point comparing strings (MUST USE .EQUALS) (== is for primitive types)
		return waitForEntry().equals(username);
	}


}
