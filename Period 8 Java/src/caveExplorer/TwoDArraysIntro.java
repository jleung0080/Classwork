package caveExplorer;

import java.util.Arrays;

public class TwoDArraysIntro {
	
	public static void main(String[] args){
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
