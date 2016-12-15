package arrays;

public class Test2Review {
	
	private static boolean[][] grid;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grid = new boolean[5][5];
		buttonClick(4,4);
		printGrid(grid);
		buttonClick(4,4);
		printGrid(grid);
	}

	
	
	public static void buttonClick(int r, int c) {
		// TODO Auto-generated method stub
		if(r>=0&&r<grid.length){
			switchRow(grid[r],c);
		}
		switchColumn(grid,r,c);
		for(boolean[]row:grid){
			for(boolean col: row){
				if(col){
					return;
				}
			}
		}
		System.out.println("You have solved the puzzle");
		
	}
	
	public static void switchIfValid(boolean[][]grid , int r, int c){
		if(r>=0&&r<grid.length&&c>=0&&c<grid[r].length){
			grid[r][c] = !grid[r][c];
		}
	}
	
	public static void switchRow(boolean[]row, int x){
		for(int i =-1; i<2; i++){
			if(x+i>=0&&x+i<row.length) row[x+i] = !row[x+i];
		}
	}
	
	public static void switchColumn(boolean[][]grid, int r, int c){
		switchIfValid(grid,r-1,c);
		switchIfValid(grid,r+1,c);
	}



	public static void printGrid(boolean[][] grid){
		for(boolean[]row:grid){
			for(boolean col: row){
				if(col){
					System.out.print(" O ");
				}else System.out.print(" X ");
			}
			System.out.print("\n\n");
		}
	}
}
