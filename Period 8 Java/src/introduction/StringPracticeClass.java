package introduction;

import java.util.Scanner;

public class StringPracticeClass{

	static Scanner input;
	static String user;




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
				+"We should become friends.");
	}

	private static void promptForever() {
		while(true){
			promptInput();
		}
	}

	private static void promptInput() {
		print("Please type something.");
		String userInput = input.nextLine();
		print("Congratulations! You typed: "+userInput);
	}


	private static void createField() {
		input = new Scanner(System.in);
		user = "";
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