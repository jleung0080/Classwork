package test;

import java.util.Scanner;

public class DanielMain {
		
		static String response;
		static boolean inMainLoop;
		static Scanner input;
		static String user;
		static Chatbot blackJack;
		
	public static void main(String[] args) {
		createFields();
		promptName();
		//promptInput();
		promptGame();
	}
	
	public static void promptName() {
		print("Welcome, Please Enter Your Name!");
		user = input.nextLine();
	}

	public static void promptGame() {
		inMainLoop = true;
		while(inMainLoop){
			print("Hi, "+user+". Would you like to play blackjack, mafia, or 20 questions?");
			response = promptInput();
//			daniel.talk();
			if(findKeyword(response, "blackjack", 0) >= 0){
				inMainLoop = false;
				print("Okay, let's begin our game of BlackJack.");
				blackJack.talk();
			}
			else {
				print("Please pick a game");
				
			}
		}
	}

	public static int findKeyword(String searchString, String keyword, int startPsn) {
		//deletes white space
		searchString = searchString.trim();
		searchString = searchString.toLowerCase();
		keyword = keyword.toLowerCase();
		//find first position of key word
		int psn = searchString.indexOf(keyword);
		
		//keep searching until context keyword found
		while(psn>=0){
			//assume preceded and followed by space
			String before = " ";
			String after = " ";
			//check character in front if it exists
			if(psn>0){
				before = searchString.substring(psn-1, psn);
			}
			//check if there is a character after the keyword
			if(psn+keyword.length() < searchString.length()){
				//psn+1 is finding one space after our current psn, so this finds the next word
				after = searchString.substring((psn + keyword.length()), 
						psn + keyword.length()+1);
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0 && noNegations(searchString, psn)){

				return psn;
			}else{
				psn = searchString.indexOf(keyword,psn+1);
			}
			
			
		}
		return -1;
	}
	private static boolean noNegations(String searchString, int psn) {
		if(psn - 3 >= 0  && searchString.substring(psn-3, psn).equals("no "))
		{
			return false;
		}
		if(psn - 4 >= 0  && searchString.substring(psn-4, psn).equals("not "))
		{
			return false;
		}
		if(psn - 6 >= 0  && searchString.substring(psn-6, psn).equals("never "))
		{
			return false;
		}
		if(psn - 4 >= 0  && searchString.substring(psn-4, psn).equals("n't "))
		{
			return false;
		}
		return true;
		
	}

	public static String promptInput() {
		String userInput = input.nextLine();
		return userInput;
		
		
	}

	public static void createFields() {
		input =  new Scanner(System.in);
		user = "";
		blackJack = new JoeyClass();
	}
	
	public static void print(String s){
			 	System.out.println(s);
	}			
}