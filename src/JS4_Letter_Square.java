import java.util.Scanner;


class JS4_Letter_Square
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("What is your favorite letter? ");
		String letter = s.next();
		System.out.print("What is your favorite number? ");
		int squareSize = s.nextInt();
		
		// using for loops
		for (int i = 0; i < squareSize; i++) {
			for (int j = 0; j < squareSize; j++) {
				System.out.print(letter);
			}
			System.out.println();
		}
		
		// alternate solution using while loops
		// int i = 0;
		// while(i < squareSize) {
		// 	int j = 0;
		// 	while(j < squareSize) {
		// 		System.out.print(letter);
		// 		j++;
		// 	}
		// 	System.out.println();
		// 	i++;
		// }
	}
}