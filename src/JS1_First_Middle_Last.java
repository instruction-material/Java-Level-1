import java.util.Scanner;

class JS1_First_Middle_Last
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nI'll print out the first, middle, and last characters!");
		System.out.print("Enter a word: ");
		String word = scanner.nextLine();
		int midpoint = word.length() / 2;
		
		System.out.print("First-Middle-Last: ");
		System.out.print(word.charAt(0) + "-");
		System.out.print(word.charAt(midpoint) + "-");
		System.out.print(word.charAt(word.length() - 1));
		System.out.println();
	}
}