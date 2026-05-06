import java.util.Scanner;


class JS9_Simple_Battleship
{
	public static void main(String[] args) {
		System.out.println("Welcome to Battleship! Your objective is to sink all of the enemy's ships. There is one two-space ship and one three-space ship hidden below the surface.");
		
		boolean[][] grid = new boolean[10][10];
		boolean[][] ships = new boolean[10][10];
		
		// place battleships on board (one three spaces long, one two spaces long)
		ships[2][3] = true;
		ships[2][4] = true;
		ships[2][5] = true;
		
		ships[8][7] = true;
		ships[9][7] = true;
		
		int numHits = 0;
		int numSquares = 5;
		
		while (true) {
			printGrid(grid);
			
			Scanner in = new Scanner(System.in);
			System.out.print("Pick a row: ");
			int row = in.nextInt();
			System.out.print("Pick a column: ");
			int col = in.nextInt();
			
			if (ships[row][col] && !grid[row][col]) {
				System.out.println("It\'s a hit!");
				grid[row][col] = true;
				numHits++;
			} else if (grid[row][col]) {
				System.out.println("You already found a ship here!");
			} else {
				System.out.println("It\'s a miss!");
			}
			
			if (numHits == numSquares) {
				System.out.println("You sank all the ships!");
				break;
			}
		}
	}
	
	public static void printGrid(boolean[][] grid) {
		// print col numbers
		System.out.print("  ");
		for (int i = 0; i < grid[0].length; i++) {
			System.out.print(" " + i + " ");
		}
		System.out.println();
		
		// print each row, with a number at the beginning
		for (int i = 0; i < grid.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j]) {
					System.out.print(" x ");
				} else {
					System.out.print(" - ");
				}
			}
			System.out.println();
		}
	}
}