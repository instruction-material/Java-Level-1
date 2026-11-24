import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter one word:");
        if (!input.hasNextLine()) {
            return;
        }
        String line = input.nextLine();
        String word = line.trim();
        // Check for an empty word before asking for a character.
        // Find the first, middle (right of center for even lengths), and last characters.
        System.out.println("Length: " + word.length());
    }
}
