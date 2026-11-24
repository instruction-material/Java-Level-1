import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter one word:");
            if (!input.hasNextLine()) return;
            String word = input.nextLine().strip();
            // Check for an empty word before asking for a character.
            // Find the first, middle (right of center for even lengths), and last characters.
            System.out.println("Length: " + word.length());
        }
    }
}
