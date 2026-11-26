import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Flight number:");
        int number = input.nextInt();
        // The cursor is still on the flight-number line.
        input.nextLine();
        System.out.println("Object:");
        String noun = input.nextLine();
        System.out.println("Destination:");
        String place = input.nextLine();
        System.out.println("Flight " + number + " carries " + noun + " toward " + place + ".");
    }
}
