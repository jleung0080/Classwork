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
		String s1 = " ";
		String s2 = "a";
		System.out.println(s1.compareTo(s2));
		
		
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
				+"We should become friends.");
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
		//find first position of key word
		int psn = searchString.indexOf(0);
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
			if(psn+keyword.length() < searchString.length){
				//psn+1 is finding one space after our current psn, so this finds the next word
				after = searchString.substring((psn + keyword.length(), 
						psn + keyword.length()+1);
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
				return psn;
			}else{
				psn = searchString.indexOf(keyword,psn+1);
			}
			
			
		}
		
		
		
		
		return -1;
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
		int cutoff = 35;
		//check for words to add
		//IOW s has a length > 0
		while(s.length()>0){
			String cut = "";
			String nextWord = "";
			//check to see if the next word will fit on the line
			//there must still be words to add
			while(cut.length() + nextWord.length() < cutoff && s.length()>0){
				//add the next word to the line
				cut += nextWord;
				
				s = s.substring(nextWord.length());
				//identify the next word without the space
				int endOfWord = s.indexOf(" ");
				//if there are no more spaces this is the last word so add the whole thing
				if(endOfWord == -1){
					endOfWord = s.length()-1; //-1 for index
				}
				
				nextWord = s.substring(0,endOfWord);
				
			}
			printString += cut+"\n";
		}
		
		System.out.println(printString);
	}
}