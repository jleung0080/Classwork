package caveExplorer;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArraysIntro {

	public static Scanner in = new Scanner(System.in);
	static String[][] arr2D;
	static int starti;
	static int startj;
	static int treasurei;
	static int treasurej;
	static String[][] pic;


	public static void main(String[] args){
//				boolean[][] mines = new boolean[6][6];
//				plantMines(mines);
//				String[][] field = createField(mines);
//				printPic(field);
	printPic(grassyPic());


//		arr2D = new String[5][5];
//		pic = new String[5][5];
//		for(int row = 0; row<arr2D.length; row++){
//			for(int col = 0; col<arr2D[row].length; col++){
//				arr2D[row][col] = "(" + row + ", " + col +")";
//			}
//		}
//
//		starti = 2;
//		startj = 2;
//		treasurei = 4;
//		treasurej = 3;
//		startExploring();
//




	}

	
	
	
	
	

	private static void startExploring() {
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
			
			
			
			
			
			System.out.println("You are in room "+ arr2D[starti][startj]+".");
			if(starti == treasurei && startj == treasurej){
				break;
			}
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			
			
			int[] newCoordinates = interpretInput(input);
			starti = newCoordinates[0];
			startj = newCoordinates[1];
			
		}
		System.out.println("Congratulations, you've found the treasure!");
	}

	private static int[] interpretInput(String input) {
		//verify input is valid
		while(!isValid(input)){
			System.out.println("Sorry, in this game, you can only use the w, a, s, d controls.");
			System.out.println("Tell me again what you would like to do.");
			input = in.nextLine();
		}
		int currenti = starti;
		int currentj = startj;
		input = input.toLowerCase();
		if(input.equals("w"))currenti --;
		if(input.equals("s"))currenti ++;
		if(input.equals("a"))currentj --;
		if(input.equals("d"))currentj ++;
		int[] newCoordinates = {starti, startj};
		if(currenti >= 0 && currenti <arr2D.length && currentj >= 0 && currentj <arr2D[currenti].length){
			newCoordinates[0] = currenti;
			newCoordinates[1] = currentj;
		}else{
			System.out.println("Sorry, you've reached the edge of the known universe. You may go "
					+ "no further in that direction.");
		}
		return newCoordinates;
	}

	private static boolean isValid(String input) {
		String[] validKeys = {"w", "a", "s", "d"};
		for(String key: validKeys){
			if(input.toLowerCase().equals(key)){
				return true;
			}
		}
		return false;
	}

	
	
	
	
	
	
	
	
	
	
	
	public static String[][] grid(String[][] array){
		String[][] copy = new String[array.length*3+1][array[0].length*3+1];
		for(int row = 0; row<copy.length; row++){
			for(int col = 0; col < copy[row].length; col++){
				if(row%3 == 0){
					copy[row][col] = "_";
				}else{
					copy[row][col] = " ";
				}
				if(col%3 == 0){
					copy[row][col] = "|";
				}
				copy[0][col] = "_";
			}
		}
		return copy;
	
	}




	
	
	

	private static String[][] createField(boolean[][] mines) {
		String[][] field = new String[mines.length][mines[0].length];
		for(int row = 0; row<field.length; row++){
			for(int col = 0; col<field[row].length; col++){
				if(mines[row][col])
					field[row][col] ="X";
				else{
					field[row][col] = countNearby(mines, row, col);
				}
			}
		}

		return field;
	}

	private static String countNearby(boolean[][] mines, int row, int col) {
		//		for(int r = row - 1; r <= row+ 1; r++){
		//			for(int c = col-1; c<= col+1; c++){
		//				if(r >= 0 && r<mines.length && c>= 0 && c<mines[0].length){
		//					
		//				}
		//			}
		//		}
		//		
		//		
		//		
		//		//this method only considers actual elements
		//		for(int r = 0; r<mines.length; r++){
		//			for(int c = 0; c<mines[row].length; c++){
		//				
		//			}
		//		}



		//return count
		int count =0;
		count += isValidAndTrue(mines, row-1, col);
		count += isValidAndTrue(mines, row+1, col);
		count += isValidAndTrue(mines, row, col-1);
		count += isValidAndTrue(mines, row, col+1);
		return ""+count;
	}


	private static int isValidAndTrue(boolean[][] mines, int i, int j){
		if(i>= 0 && i<mines.length && j>=0 && j<mines[0].length && mines[i][j]){
			return 1;
		}else return 0;
	}


	private static void plantMines(boolean[][] mines) {
		int numberOfMines = 10;
		while(numberOfMines>0){
			int row = (int)(Math.random()*mines.length);
			int col = (int)(Math.random()*mines[0].length);
			//this part prevents the same mine from being selected twice
			//			while(mines[row][col]){
			//				row = (int)(Math.random()*mines.length);
			//				col = (int)(Math.random()*mines[0].length);
			//			}
			if(!mines[row][col]){
				mines[row][col] = true;
				numberOfMines--;
			}
		}

	}

	public static String[][] grassyPic(){
		String[][] pic = new String[10][8];
		for(int row = 0; row <pic.length; row++){
			//put an entire array on each row
			for(int col = 0; col<pic[row].length; col++){
				//populate with coordinates
				pic[row][col] = (" ");
			}
		}





		//grassy field
		for(int row = pic.length-2; row<pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = "w";
			}
		}



		for(int col = 1; col<pic[0].length-1; col++){
			pic[0][col] = "_";
			pic[pic.length-1][col] = "_";

		}
		for(int row = 1; row<pic.length; row++){
			pic[row][0] = "|";
			pic[row][pic[0].length-1] = "|"; 
		}
		return pic;
	}


	public static void printPic(String[][] pic){
		for(String[] row : pic){
			for(String col : row){
				System.out.print(col);
			}
			System.out.println();
		}
	}

	public static void intro(){
		String[] xox = {"x", "o", "x", "o", "x"};
		System.out.println(Arrays.toString(xox));

		String[][] arr2d = new String[5][4];

		System.out.println("The height is "+arr2d.length);
		System.out.println("The width is "+arr2d[0].length);


		for(int row = 0; row <arr2d.length; row++){
			//put an entire array on each row
			for(int col = 0; col<arr2d[row].length; col++){
				//populate with coodinates
				arr2d[row][col] = "("+row+", " +col+")";
			}
		}

		//print the 2d array
		// every element in a 2d array is itself an array
		//so a for-each loop looks like this
		for(String[] row : arr2d){
			System.out.println(Arrays.toString(row));
		}


	}
}
