import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter one word:");
            if (!input.hasNextLine()) return;
            String word = input.nextLine().strip();
            if (word.isEmpty()) {
                System.out.println("A word is needed.");
                return;
            }
            int middle = word.length() / 2;
            System.out.println("First-Middle-Last: " + word.charAt(0) + "-"
                    + word.charAt(middle) + "-" + word.charAt(word.length() - 1));
        }
    }
}
