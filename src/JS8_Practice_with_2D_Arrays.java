class JS8_Practice_with_2D_Arrays
{
	public static void main(String[] args) {
		int[][] arr = {
				{3, 6, 4, 7},
				{2, 8, 5, 7},
				{0, 4, 2, 5}
		};
		
		System.out.println(sum(arr));
		System.out.println(min(arr));
		
		int[][] table = multiplicationTable(9);
		for (int[] row : table) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		double[] rowAvg = rowAvg(arr);
		for (double num : rowAvg) {
			System.out.print(num + " ");
		}
	}
	
	public static int sum(int[][] arr) {
		int sum = 0;
		for (int[] row : arr) {
			for (int num : row) {
				sum += num;
			}
		}
		return sum;
	}
	
	public static int min(int[][] arr) {
		int min = arr[0][0];
		for (int[] row : arr) {
			for (int num : row) {
				if (num < min) {
					min = num;
				}
			}
		}
		return min;
	}
	
	public static int[][] multiplicationTable(int n) {
		int[][] table = new int[n][n];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				table[i - 1][j - 1] = i * j;
			}
		}
		return table;
	}
	
	public static double[] rowAvg(int[][] arr) {
		double[] avg = new double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
			}
			avg[i] = (double) sum / arr[i].length;
		}
		return avg;
	}
}