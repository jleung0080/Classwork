package caveExplorer;

import java.util.Arrays;
import java.util.Scanner;
public class ui {

	public static Scanner in = new Scanner(System.in);
	static String[][] arr2D;
	static int starti;
	static int startj;

	static String[][] pic;

	public static void main(String[] args) {
		arr2D = new String[8][8];
		
		for(int i =0; i< arr2D.length; i++)
		{
			for(int r = 0; r<arr2D[0].length; r++)
			{
				arr2D[i][r] = " ";
			}
			arr2D[0][i] = ""+i;
		}
		
		
		printPic(arr2D);
		startExploring();
	}

	public static void printPic(String[][] pic){
		for(String[] row : pic){
			for(String col : row){
				System.out.print("|");
				System.out.print(col);
				
			}
			System.out.print("|");
			System.out.println();
		}
	}

	private static void startExploring() {
		int col0 = 7;
		int col1 = 7;
		int col2 = 7;
		int col3 = 7;
		int col4 = 7;
		int col5 = 7;
		int col6 = 7;
		int col7 = 7;
		while(true){
			for(int row= 0; row<pic.length; row++){
				for(int col = 0; col<pic[row].length; col++){
					if(row == starti && col == startj){
						pic[row][col] = "x";
					}else{
						pic[row][col] = " ";
					}
				}
			}
			printPic(pic);


			System.out.println("What do you want to do?");
			String input = in.nextLine();
			int[] newCoordinates = interpretInput(input);
			for(int i = 0; i< newCoordinates.length; i++){
				arr2D[]
			}
		}
	}
	
	private static int[] interpretInput(String input) {
		//verify input is valid
		
		
		
		
		int[] position = {};
		while(!isValid(input)){
			System.out.println("Sorry, in this game, you can only use numbers");
			System.out.println("Tell me again what you would like to do.");
			input = in.nextLine();
		}
		
		
		return position;
	}
	
	private static boolean isValid(String input) {
		String[] validKeys = {"0","1","2","3","4","5","6","7"};
		for(String key: validKeys){
			if(input.equals(key)){
				return true;
			}
		}
		return false;
	}
}
