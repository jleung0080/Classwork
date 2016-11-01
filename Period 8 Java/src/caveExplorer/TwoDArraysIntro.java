package caveExplorer;

import java.util.Arrays;

public class TwoDArraysIntro {
	
	public static void main(String[] args){
		{
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
			
			
			
			//print the 2d array
			// every element in a 2d array is itself an array
			//so a for-each loop looks like this
			for(String[] row : pic){
				for(String col : row){
					System.out.print(col);
				}
				System.out.println();
			}
			
			
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
