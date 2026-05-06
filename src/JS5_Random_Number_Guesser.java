import java.util.Scanner;


class JS5_Random_Number_Guesser
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the random number guesser!");
		System.out.println();
		
		System.out.println("First, give me the range in which I can guess.");
		System.out.print("Minimum value: ");
		int min = scanner.nextInt();
		System.out.print("Maximum value: ");
		int max = scanner.nextInt();
		System.out.println();
		
		System.out.println("OK, let me think of a random number in between " + min + " and " + max + ".");
		int rand = (int) (Math.random() * (max - min + 1)) + min;
		System.out.println("...");
		System.out.println("I have a random number in mind. Try and guess it!");
		int guesses = 0;
		System.out.println();
		
		while (true) {
			
			System.out.print("Your guess: ");
			int guess = scanner.nextInt();
			guesses++;
			
			if (guess == rand) {
				System.out.println("You guessed it! My random number was " + rand + ". It took you " + guesses + " tries to guess my number.");
				break;
			} else if (guess > rand) {
				System.out.println("Nope! Your guess is too high. Try again!");
				System.out.println();
			} else {
				System.out.println("Nope! Your guess is too low. Try again!");
				System.out.println();
			}
		}
	}
}