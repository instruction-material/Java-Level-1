import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ship = readAnswer(input, "What is the fictional ship called?");
        if (ship.length() == 0) {
            return;
        }
        System.out.println("Welcome aboard " + ship + "!");
        String planet = readAnswer(input, "Which imaginary planet is the destination?");
        if (planet.length() == 0) {
            return;
        }
        String pilot = readAnswer(input, "What is the robot pilot called?");
        if (pilot.length() == 0) {
            return;
        }
        String cargo = readAnswer(input, "What unusual cargo is on board?");
        if (cargo.length() == 0) {
            return;
        }
        String signal = readAnswer(input, "What is the arrival signal?");
        if (signal.length() == 0) {
            return;
        }
        System.out.println("Flight log: " + pilot + " will take " + ship + " to " + planet
                + " with " + cargo + ". Arrival signal: " + signal + ".");
    }

    // A blank line is retried. End of input closes the conversation.
    static String readAnswer(Scanner input, String question) {
        System.out.println(question);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String answer = line.trim();
            if (answer.length() > 0) {
                return answer;
            }
            System.out.println("Please enter a fictional answer.");
        }
        return "";
    }
}
