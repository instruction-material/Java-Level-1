import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        java.util.Random random = args.length == 0 ? new java.util.Random() : new java.util.Random(Long.parseLong(args[0]));
        int n = random.nextInt(26) + 97;
        char letter = (char)n;

        Scanner in = new Scanner(System.in);
        int numGuesses = 0;

        while (in.hasNextLine()) {
            System.out.print("Guess a random letter (lowercase)! ");
            String line = in.nextLine();
            if (line.isBlank()) continue;
            char guess = line.charAt(0);
            numGuesses++;

            if (guess == letter) {
                System.out.println("You got it! It took you " + numGuesses +
                                   " guesses to guess correctly.");
                break;
            } else {
                System.out.println("That\'s not it!");
            }
        }
    }
}
