package chatbot;

import java.util.Scanner;

public class JoeyMain{

	
	static String response;
	static boolean inMainLoop;
	static Scanner input;
	static String user;
	static Chatbot school;



	public static void main(String[] args) {
		createField();
		promptName();
		//promptInput();
		promptForever();















		String text1 = new String("Hello World");
		String text2 = "Hello World";

		if(text1.equals(text2)){//use .equals to compare objects
			System.out.println("These strings are equal:");
		}
		print(text1);
		print(text2);

		String word1 = "Aardvark";
		String word2 = "Zyzzva";

		if(word1.compareTo(word2)<0){
			print("word1 comes before word2");
		}


	}

	private static void promptName() {
		print("Enter your name");
		user = input.nextLine();
		print("Glad to meet you, "+user+". For the rest of the time, "
				+"I will call you "+user+". "
				+"You may call me Computer."
				+" We should become friends.");
	}

	public static void promptForever() {
		inMainLoop = true;
		while(inMainLoop){
			print("Hi, "+user+". How are you?");
			response = promptInput();
			//how you feel
			if(findKeyword(response, "good", 0) >= 0){
				print("That's wonderful. So glad you feel good.");
			}
			//school
			else if(response.indexOf("school") >= 0){
					print("School is great! Tell me about school.");
					inMainLoop = false;
					//go to the school's talk method
					school.talk();
				}
			else{
				print("I don't understand.");
			}
			
			
		}
	}

	public static int findKeyword(String searchString, String keyword, int startPsn) {
		//deletes white space
		searchString = searchString.trim();
		searchString = searchString.toLowerCase();
		keyword = keyword.toLowerCase();
		System.out.println("The phrase is "+searchString);
		System.out.println("The keyword is "+keyword);
		//find first position of key word
		int psn = searchString.indexOf(keyword);
		System.out.println("The keyword was found at "+psn);
		
		//keep searching until context keyword found
		while(psn>=0){
			//assume preceded and followed by space
			String before = " ";
			String after = " ";
			//check character in front if it exists
			if(psn>0){
				before = searchString.substring(psn-1, psn);
				System.out.println("The character before is "+before);
			}
			//check if there is a character after the keyword
			if(psn+keyword.length() < searchString.length()){
				//psn+1 is finding one space after our current psn, so this finds the next word
				after = searchString.substring((psn + keyword.length()), 
						psn + keyword.length()+1);
				System.out.println("The character after is "+after);
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0 && noNegations(searchString, psn)){
				System.out.println("Found "+keyword+" at "+psn);
				return psn;
			}else{
				psn = searchString.indexOf(keyword,psn+1);
				System.out.println("Did not find " + keyword + ", checking position "+psn);
			}
			
			
		}
		
		
		
		
		return -1;
	}

	//notes
	//this is a helper method a helper method is a method designed for helping a larger method 
	//because of this helper methods are private bs they only help what they assigned to
	private static boolean noNegations(String searchString, int psn) {
		//check to see if word "no" is in front of psn
		if(psn - 3 >= 0 && searchString.substring(psn-3, psn).equals("no ")){
			return false;
		}
		if(psn - 4 >= 0 && searchString.substring(psn-4, psn).equals("not ")){
			return false;
		}
		if(psn - 6 >= 0 && searchString.substring(psn-6, psn).equals("never ")){
			return false;
		}
		if(psn - 4 >= 0 && searchString.substring(psn-4, psn).equals("n't ")){
			return false;
		}
		return true;
	}

	public static String promptInput() {
		String userInput = input.nextLine();
		return userInput;
	}


	private static void createField() {
		input = new Scanner(System.in);
		user = "";
		school = new JoeySchool();
	}

	public static void print(String s){
		String printString = s;
		System.out.println(printString);
	}
}