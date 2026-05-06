class JS8_Magic_Square
{
	public static void main(String[] args) {
		
		int[][] magic = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
		System.out.println(isMagicSquare(magic));
		
		int[][] magic2 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 2}};
		System.out.println(isMagicSquare(magic2));
	}
	
	public static boolean isMagicSquare(int[][] a) {
		
		//check if it's a square
		if (a.length != a[0].length) {
			return false;
		}
		
		// find the sum of the first row
		int firstRowSum = 0;
		for (int i = 0; i < a.length; i++) {
			firstRowSum += a[0][i];
		}
		
		// compare the first row with every other row
		for (int i = 0; i < a.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < a[i].length; j++) {
				rowSum += a[i][j];
			}
			if (firstRowSum != rowSum) {
				return false;
			}
		}
		
		// compare the first row with every column
		for (int j = 0; j < a[0].length; j++) {
			int colSum = 0;
			for (int i = 0; i < a.length; i++) {
				colSum += a[i][j];
			}
			
			if (firstRowSum != colSum) {
				return false;
			}
		}
		
		// compare with the first diagonal
		int diagonalSum1 = 0;
		for (int i = 0; i < a.length; i++) {
			diagonalSum1 += a[i][i];
		}
		if (firstRowSum != diagonalSum1) {
			return false;
		}
		
		// compare with the second diagonal
		int diagonalSum2 = 0;
		for (int i = 0; i < a.length; i++) {
			diagonalSum2 += a[a.length - 1 - i][i];
		}
		if (firstRowSum != diagonalSum2) {
			return false;
		}
		
		return true;
	}
}