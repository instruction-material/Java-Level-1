import java.util.Scanner;


class JS5_Letter_Guesser
{
	public static void main(String[] args) {
		int n = (int) (Math.random() * 26 + 97);
		char letter = (char) n;
		
		Scanner in = new Scanner(System.in);
		int numGuesses = 0;
		
		while (true) {
			System.out.print("Guess a random letter (lowercase)! ");
			String line = in.nextLine();
			char guess = line.charAt(0);
			numGuesses++;
			
			if (guess == letter) {
				System.out.println("You got it! It took you " + numGuesses + " guesses to guess correctly.");
				break;
			} else {
				System.out.println("That's not it!");
			}
		}
	}
}
