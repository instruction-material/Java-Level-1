import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String ship = readAnswer(input, "What is the fictional ship called?");
            if (ship == null) return;
            System.out.println("Welcome aboard " + ship + "!");
            // Add four fictional questions. Store each answer and use all five in the log.
        }
    }

    // A blank line is retried. End of input closes the conversation.
    static String readAnswer(Scanner input, String question) {
        System.out.println(question);
        while (input.hasNextLine()) {
            String answer = input.nextLine().strip();
            if (!answer.isEmpty()) return answer;
            System.out.println("Please enter a fictional answer.");
        }
        return null;
    }
}
