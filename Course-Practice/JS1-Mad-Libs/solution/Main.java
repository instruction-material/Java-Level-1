import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Noun:");
        String noun = input.nextLine();
        System.out.println("Verb:");
        String verb = input.nextLine();
        System.out.println("Adjective:");
        String adjective = input.nextLine();
        System.out.println("The " + adjective + " " + noun + " " + verb + " above town.");
    }
}
