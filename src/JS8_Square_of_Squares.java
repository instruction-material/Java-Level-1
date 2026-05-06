import java.util.Scanner;


class JS8_Square_of_Squares
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a size for our square: ");
		int size = in.nextInt();
		
		int[][] arr = new int[size][size];
		int x = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = x * x;//Math.pow(x, 2));
				x++;
			}
		}
		
		for (int[] ints : arr) {
			for (int anInt : ints) {
				System.out.print(anInt + " ");
			}
			System.out.println();
		}
	}
}